import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
    // 3,6,9가 포함된 숫자에 박수친 횟수 세기 --> 33, 36일 경우 박수 2번
    
		int count = 0;  // 박수 친 횟수
		for(int i = 1; i < num; i++){ // 내가 입력한 숫자까지 증가하는 i
			if(input.length() == 1){    // 한 자리 수 입력
				if(i%3 == 0 || i%6 == 0 || i%9 == 0){
					count++;
					//System.out.println(count);
				}
// 			} else {    // 두 자리 수 입력 시 : 30번대는 박수 2번 쳐야 되는 경우 발생
				
// 			}
		}
		
	}
}
