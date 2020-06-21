import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		// 평년인지, 윤년인지, 1년 1월부터 지금까지 며칠이 지났는지 모두 출력
		LeapController lc = new LeapController();
		Calendar gc = new GregorianCalendar(2020, Calendar.JULY, 21);
		lc.isLeapYear(2019);
		lc.leapDate(gc);
	}
} // class end
