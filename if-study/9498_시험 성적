import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        
        // 방법 1 - if문
        if(score < 0 || score > 100){
           System.out.println("잘못된 점수를 입력하였습니다.");
       }
        
       if(score <= 100 && score >= 90){         // 입력받은 수가 100 ~ 90점일 때 
           System.out.println('A');
       }else if(score < 90 && score >= 80){    // 입력받은 수가 89 ~ 80점일 때
           System.out.println('B');
       }else if(score < 80 && score >= 70){    // 입력받은 수가 79 ~ 70점일 때
           System.out.println('C');
       }else if(score < 70 && score >= 60){    // 입력받은 수가 69 ~ 60점일 때
           System.out.println('D');
       }else{                                   // 그 외의 점수일 때
           System.out.println('F');
       }



        // 방법 2 - switch문
        int num = score/10;     // 입력받은 점수를 10으로 나눠서 나눈 결과 값을 switch문으로 걸러줌
        
        switch(num){
            case 10: System.out.println('A'); break;
            case 9 : System.out.println('A'); break;
            case 8 : System.out.println('B'); break;
            case 7 : System.out.println('C'); break;
            case 6 : System.out.println('D'); break;
            default : System.out.println('F');
        }
    }
}
