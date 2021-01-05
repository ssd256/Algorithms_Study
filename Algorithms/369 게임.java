import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
		// 3,6,9 체크 --> 한 글자씩 체크해야 함
		int count = 0;	// 박수 횟수
		
		// 입력한 숫자까지만 증가해야 되니까 i < num --> i++은 구문 벗어난 후에 증가(주의)
		for(int i = 1; i < num; i++){
			// 문자열로 형변환
			String chkNum = String.valueOf(i);
			
			// 형변환 된 문자열 길이만큼 반복 --> 입력한 숫자의 길이
			for(int j = 0; j < chkNum.length(); j++){
				
				// 한 글자씩 chk에 담음
				char chk = chkNum.charAt(j);						
				if(chk == '3' || chk == '6' || chk == '9'){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
