import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) { 
		// trim은 맨 앞/뒤 공간만 제거
		// 문자 중간중간을 제거하려면
		// StringTokenizer로 띄어쓰기를 기준으로 다시 뜯음
		StringTokenizer st = new StringTokenizer(str, " ");
		String strT = "";
		while(st.hasMoreTokens()) {
			strT += st.nextToken();
		}
		return strT;
	}
	
	public String firstCap(String input) { 
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		// 첫 글자 뽑기 ==> substring(0, 1) : 0 <= index < 1 ==> 0인덱스
		// 대문자 만들기 ==> toUpperCase() : String
		// 첫 글자 바꾸기 ==> replaceFirst(regex, replacement) : String
		
		return input.replaceFirst(input.substring(0, 1), input.substring(0, 1).toUpperCase());
	}
	
	public int findChar(String input, char one) {
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		// StringTokenizer에 input 문자열 하나씩 넣기
		// st.nextToken()을 str : String의 새로운 공간에 넣어줌
		// str 안의 문자 하나하나와 one를 비교 ==> if문
		// one이가 str.charAt(i)와 맞으면 count++

		StringTokenizer st = new StringTokenizer(input);
		int count = 0;
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == one) {
					count++;
				}
			}
		}
		return count;
	}
	
} // class end
