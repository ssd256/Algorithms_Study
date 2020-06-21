import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		// 연도가 윤년이면 true, 평년이면 false 리턴
		// 윤년 
		// ((연도가 4의 배수) && (연도가 100의 배수가 아님)) || (400의 배수가 되는 해)
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + "년은 윤년입니다");
			return true;
		} else {
			System.out.println(year + "년은 평년입니다");
			return false;
		}
	}
	
	public long leapDate(Calendar c) { // 현재 날짜
		// 1년 1월 1일 부터 오늘까지의 총 날 수를 계산
		// Date 레퍼런스 출력 ==> Sun Jun 21 16:54:41 GMT+09:00 2020 이런식
		// Calendar 레퍼러스.getTimelInMillis() ==> 년월일시가 초로 환산
		// Calendar 레퍼러스.getTime() ==> Date 레퍼런스 출력과 동일
		// 1년 1월 1일 ==> baseCal을 기준날짜로 잡음
		// 오늘 날짜 ==> objCal로 잡음
		// (objCal 날짜) - (baseCal 날짜) ==> 두 기간 사이의 시간이 나옴
		// 밀리세컨으로 뽑기 때문에 1000로 나눠주고 * 60초 * 60분 * 24시간을 해줌
		Calendar baseCal = new GregorianCalendar(1, Calendar.JANUARY, 1); // 년, 월, 일
//		Calendar objCal = new GregorianCalendar();
		long tt = (c.getTimeInMillis() - baseCal.getTimeInMillis());
		// getTimeInMillis() : 밀리세컨즈라 1/1000(0.001)이라서 1000으로 나눠줌
		long ttday = tt / 1000 / (60 * 60 * 24); 
//		System.out.println(ttday); // 초 => 일(60초*60분*24시간)
		
		// 1년부터 현재 연도까지 각 연도가 윤년 ==> 총 날 수 + 366일
		// 									평년 ==> 총 날 수 + 365일
		// 현재 연도가 윤년이면 2월 ==> 29일, 평년이면 2월 ==>  28일
		// 31일 : 1, 3, 5, 7, 8, 10, 12월
		// 30일 : 4, 6, 9, 11월
		
		// 1년 ==> 평년 : 365
		// 2년 ==> 평년 : 1년 총 날수(365)  + 365
		// ...
		// 4년 ==> 윤년 : (1+2+3)총 날 수(365+365+365) + 366
		// 5년 ==> 평년 : (1+2+3+4)총 날 수(365+365+365+366) + 365
		// ...
		// 8년 ==> 윤년 : (1+2+3...+7)총 날 수(365+365+365+366+...+365) + 366
		// 9년 ==> 평년 : (1+2+3...+7+8)총 날 수 + 365
		// 10년 ==> 평년 : (1+2+3...+7+8+9)총 날 수 + 365
		// ...
		// 2019년 ==> 평년 : (1+2+3...+2018)총 날 수 + 365
		// 2020년 ==> 윤년 : (1+2+3...+2018+2019)총 날 수 + 366
		// year가 4의 배수이고 100의 배수가 아닐때거나 400의 배수일 때 ==> 윤년
		// ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)
		// 윤년일땐 +366
		// 평년일땐 +365

//		System.out.println(ttday); // 초 => 일(60초*60분*24시간)
		// 연도를 뽑을 때, 기준 연도에서 하나씩 증감 ==> ++
		int baYear = baseCal.get(Calendar.YEAR);
		int toYear = c.get(Calendar.YEAR);
		int dayCount = 0;
		for(int i = 1; i < toYear; i++) {
			if(((baYear % 4 == 0) && (baYear % 100 != 0)) || (baYear % 400 == 0)) {
				dayCount += 366;
			} else {
				dayCount += 365;
			}
			baYear++;
		}
		System.out.println("총 날짜 수 : " + dayCount);
		return dayCount;
	}
} // class end
