package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		// 입력받은 하나의 정수가 양수이면 "양수다"
		// 양수가 아니면 "양수가 아니다"
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num >= 0 ? "양수다" : "양수가 아니다");
		System.out.println(result);
	}
	
	public void practice2() {
		// 입력받은 하나의 정수가 양수이면 "양수다"
		// 양수가 아닌 경우 중 0이면 "0이다", 0이 아니면 "음수다"
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = sc.next();
		int num = Integer.parseInt(str);
		
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(result);
	}
	
	public void practice3() {
		// 입력받은 하나의 정수가 짝수이면 "짝수다"
		// 홀수이면 "홀수다"
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2) == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}
	
	public void practice4() {
		// 인원 수, 사탕 개수 입력받음
		// 1인당 사탕 개수 -> 사탕 개수 / 인원 수
		// 남은 사탕 개수 -> 사탕 개수 % 인원 수
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int num = sc.nextInt(); 
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		int result1 = candy / num;
		int result2 = candy % num; 
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
	}
	
	public void practice5() {
		// 성별이 'F'면 여학생, 'M'이면 남학생으로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int su = sc.nextInt();
		
		System.out.print("성별(F/M) : ");
		char ch = sc.next().charAt(0);
		String gender = (ch == 'F') ? "여학생" : "남학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float total = sc.nextFloat();
		
		System.out.println(grade + "학년 " + num + "반 " + su + "번 " 
							+ name + " " + gender + "의 성적은 " + total + "이다.");
	}
	
	public void practice6() {
		// 어린이(13세 이하) <= 13
		// 13 < 청소년(13세 초과 ~ 19세 이하) <= 19 
		// 성인(19세 초과) > 19
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		String str = sc.next();
		int num = Integer.parseInt(str);
		
		String age = num <= 13 ? "어린이" : (num <= 19 ? "청소년" : "성인");
		System.out.println(age);
	}
	
	public void practice7() {
		// 국어, 영어, 수학 점수 입력받기
		// 세 과목 합계
		// 세 과목 평균(0.0)
		// 각 과목이 40점 이상이면서 평균 60점 이상일 때 "합격", 아니면 "불합격"
		//  40 <= 국, 영, 수  && 60 <= 평균 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		float ave = sum / 3;
		
		// 코드 단순화 할 순 없나.. 너무 길고 복잡시러
		String exam = ((40 <= kor) && (40 <= eng) && (40 <= mat)) && (60 <= sum) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		System.out.println(exam);
	}
	
	public void practice8() {
		// 주민번호를 이용하여 여자인지 남자인지 구분
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		String num1 = sc.nextLine();
		char num2 = sc.next().charAt(7);
		
		String gender = (num2 == '2') ? "여자" : "남자";
		System.out.println(gender);
	}
	
	public void practice9() {
		// 정수 두 개를 입력 받아 num1, num2에 저장(단, num1 < num2)
		// 또 다른 정수를 입력받음
		// 또 다른 정수가 num1 이하이거나 num2 초과이면 true, 그렇지 않으면 false
		// 또 다른 정수 <= num1 또는 또 다른 정수 > num2 -> true
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2);
		
		System.out.println(result);
	}
	
	public void practice10() {
		// 3개의 수 입력받기
		// 입력받은 수가 모두 같으면 true, 아니면 false
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) ? (num1 == num3 ? true : false) : false;
		System.out.println();
		System.out.println(result);
	}
	
	public void practice11() {
		// A, B, C 사원의 연봉 입력받기
		// 각 사원의 연봉과 인센티브를 포함해서 계산
		// 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"
		// A는 인센티브 0.4, B는 인센티브 없음, C는 인센티브 0.15
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의  연봉 : ");
		int mo1 = sc.nextInt();
		
		System.out.print("B사원의  연봉 : ");
		int mo2 = sc.nextInt();
		
		System.out.print("C사원의  연봉 : ");
		int mo3 = sc.nextInt();
		
		// 강사님이 알려줌
		// A 인센티브 -> A연봉 +(A연봉 * 0.15) 
		// A연봉(1 + (1*0.15)) -> A연봉(1 + 0.15) -> A연봉 * 1.15
		
		// 내가 짠 코드
//		double plus1 = mo1 * 0.4;
//		double plus2 = mo2 * 0.0;
//		double plus3 = mo3 * 0.15;
//		
//		double sum1 = mo1 + plus1;
//		double sum2 = mo2 + plus2;
//		double sum3 = mo3 + plus3;
		
		double sum1 = mo1 * 1.4;
		double sum2 = mo2 * 1.0;
		double sum3 = mo3 * 1.15;
		
		String total1 = sum1 >= 3000 ? "3000 이상" : "3000 미만"; 
		String total2 = sum2 >= 3000 ? "3000 이상" : "3000 미만"; 
		String total3 = sum3 >= 3000 ? "3000 이상" : "3000 미만"; 
			
		System.out.println("A사원 연봉/연봉+a : " + mo1 +"/" + sum1);
		System.out.println(total1);
		System.out.println("B사원 연봉/연봉+a : " + mo2 +"/" + sum2);
		System.out.println(total2);
		System.out.println("C사원 연봉/연봉+a : " + mo3 +"/" + sum3);
		System.out.println(total3);
	}
}
