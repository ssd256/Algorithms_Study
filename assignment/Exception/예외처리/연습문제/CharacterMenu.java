package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int count = 0; 
		try { // 						count를 리턴하는 메소드 ==> int값 반환
	// int 타입인 count에 리턴 된 count값 담아줌
			count = new CharacterController().countAlpha(str); 
			System.out.println("'" + str + "'에 포함된 영문자 개수 : " + count);
		} catch (CharCheckException e) {
			e.printStackTrace();
			System.out.println();
		}
		
	}
	
} // class end
