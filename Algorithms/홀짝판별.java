import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// Scanner 대신 사용  --> Scanner보다 빠르다
		int input = Integer.parseInt(br.readLine());	// String 값으로 고정되므로 int로 형변환  --> readLine() : 한 줄씩 읽을 수 있음
		
		if(input % 2 != 0){
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
	}
}
