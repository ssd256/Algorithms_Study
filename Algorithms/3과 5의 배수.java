import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
    // 1000 이하의 자연수를 입력하여 3의 배수, 5의 배수의 합 구하기
		int sum = 0;
		for(int i = 1; i <= num; i++){
			if(i%3 == 0 || i%5 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
