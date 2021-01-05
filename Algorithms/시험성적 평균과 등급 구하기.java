import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] numArr = (input).split(" ");
		
		int sum = 0;
		double avg = 0;
		int size = numArr.length;
		
		for(String i : numArr){
			sum += Integer.parseInt(i);	
		}
		
		avg = (double)sum/size;
    		// 3번째 자리에서 반올림
		avg = Math.round(avg*100d)/100d;
		
    // 방법1
    if(avg <= 100.0 && avg >= 90.0){
			System.out.printf("%.2f A", avg); 
		} else if(avg < 90.0 && avg >= 80){
			System.out.printf("%.2f B", avg); 
		} else if(avg < 80.0 && avg >= 70){
			System.out.printf("%.2f C", avg); 
		} else if(avg < 70.0 && avg >= 60){
			System.out.printf("%.2f D", avg); 
		} else {
			System.out.printf("%.2f F", avg);
		}				
    
    		// 평균의 10자리만 비교(내림)
		int avgVal = (int)Math.floor(avg)/10;
		
    // 방법2
    // 소수점 2자리까지 출력하는 부분에서 고민했는데 printf로 쉽게 풀림
	switch(avgVal){
		case 10:
		case 9: System.out.printf("%.2f A", avg); break;  
		case 8: System.out.printf("%.2f B", avg); break;
		case 7: System.out.printf("%.2f C", avg); break;
		case 6: System.out.printf("%.2f D", avg); break;
		default: System.out.printf("%.2f F", avg);
	}		  
        
	}
}
