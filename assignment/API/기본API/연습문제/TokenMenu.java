import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		do {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num == 1) {
				tokenMenu();
			} else if (num == 2) {
				inputMenu();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다."); 
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); continue;
			}
			
		} while(true);
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("첫 글자 대문자 : " + tc.firstCap(str));
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch + " 문자가 들어가 개수 : " + tc.findChar(str, ch));
		
	}
	
} // class end
