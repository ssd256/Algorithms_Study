import java.io.*;
class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if(input < 1000 || input > 3000){
            System.out.println("바른 숫자를 입력해주세요.");
        } else {
            System.out.println(input - 543);
        }
    }
}
