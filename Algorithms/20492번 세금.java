  
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        double num1 = 0;
        double num2 = 0;
        if(input < 1000 || input > 10000000){
            System.out.println("범위에 맞는 수를 입력하세요.");
        } else {
            num1 = input - (input*0.22); // 제세공과금 22% 납부
            num2 = input - (input*0.2*0.22); // 경비 80%를 제외한 나머지 금액에 대해서 제세공과금 22% 납부
            System.out.printf("%.0f %.0f", num1, num2); 
        }
    }
}
