package com.kh.practice.charCheck.controller;

import java.util.StringTokenizer;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환 ==> count : int
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메세지는 출력 값 참고
		
		// s에 숫자+문자 ==> 문자열과 비교해서 해당 인덱스가 문자면(true) count++
		//				 ==> 문자가 아니면 통과(false)
		int count = 0; 
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
				count++;
			} else if(s.charAt(i)  == ' ') {
				throw new CharCheckException("체크할 문자열 안에  공백이 포함되어 있습니다.");
			}
		}
		return count;
	}
	
} // class end
