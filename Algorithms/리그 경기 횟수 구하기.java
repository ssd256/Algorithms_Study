import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		// 입력한 수 n에서 자기 자신을 뺀만큼 경기를 진행할 때 총 경기 수 구하기
    // n=3 이면 1 + 2 = 3 
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
    
		int play = 0; 
		for(int i = 0; i < num; i++){
			play += i;
		}
		System.out.println(play);
	}
}
