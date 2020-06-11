package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.cotroller.CircleController;
import com.kh.practice.point.cotroller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		// 메인메뉴 출력, 잘못 입력 시 반복
		do {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
			if(num < 1 && num > 9) {
				continue;
			}
			if(num == 1) {
				circleMenu();
				continue;
			} else if (num == 2){
				rectangleMenu();
				continue;
			} else {
				System.out.println("종료합니다.");
				break;
			}
			
		} while(true);
	} // mainMenu end
	
	public void circleMenu() {
		// 원 메뉴 출력, 잘못 입력 시 메인메뉴로 되돌아감
		System.out.println("==== 원 메뉴 ====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
			if(num < 1 && num > 9) {
				mainMenu();
			}
			if(num == 1) {
				calcCircum();
			} else if (num == 2){
				calcCircleArea();
			} 
	} // circleMenu end
	
	public void rectangleMenu() {
		// 사각형 메뉴 출력, 잘못 입력 시 메인메뉴로 되돌아감
		System.out.println("==== 사각형 메뉴 ====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
			if(num < 1 && num > 9) {
				mainMenu();
			}
			if(num == 1) {
				calcPerimeter();
			} else if (num == 2){
				calcRectArea();
			} 
	} // rectangleMenu end
	
	public void calcCircum() {
		// 원의 정보, 원 둘레 출력
		System.out.print("x 좌표 : ");
		int numx = sc.nextInt();
		System.out.print("y 좌표 : ");
		int numy = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		String result = cc.calcCircum(numx, numy, r);
		System.out.println("둘레 : " + result);
	} // calcCircum end
	
	public void calcCircleArea() {
		// 원의 정보, 원 넓이 출력
		System.out.print("x 좌표 : ");
		int numx = sc.nextInt();
		System.out.print("y 좌표 : ");
		int numy = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		String result = cc.calcArea(numx, numy, r);
		System.out.println("면적 : " + result);
	} // calcCircleArea end
	
	public void calcPerimeter() {
		// 사각형 정보, 사각형 둘레 출력
		System.out.print("x 좌표 : ");
		int numx = sc.nextInt();
		System.out.print("y 좌표 : ");
		int numy = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		String result = rc.calcPerimeter(numx, numy, h, w);
		System.out.println("둘레 : " + result);
	} // calcPerimeter end
	
	public void calcRectArea() {
		// 사각형 정보, 사각형 넓이 출력
		System.out.print("x 좌표 : ");
		int numx = sc.nextInt();
		System.out.print("y 좌표 : ");
		int numy = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		String result = rc.calcArea(numx, numy, h, w);
		System.out.println("면적 : " + result);
	} // calcRectArea end
	
	
	
	
	
	
} // class end
