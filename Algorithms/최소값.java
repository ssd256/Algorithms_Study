import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
    // 첫 줄에는 입력할 수의 개수
    // 두 번째 줄에는 비교할 숫자들 입력
    // 두 번째 줄의 숫자들 중 최소값 출력
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		String num = br.readLine();
		String[] numArr = num.split(" "); 

		// 첫 번째 입력값과 나머지 값들 비교
		int min = Integer.parseInt(numArr[0]);

		for(int i = 1; i < numArr.length; i++){
			if(min > Integer.parseInt(numArr[i])){

      // 첫 번째 값이 다른값보다 크면 해당값을 min에 넣음 
      min = Integer.parseInt(numArr[i]);	
			} 
		}
		System.out.println(min);
	}
}
