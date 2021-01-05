import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Math.abs(Integer.parseInt(input));
		
		// 1과 자기 자신으로만 나누어져야 함
		if(num%2 != 0 && num%3 != 0){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
