import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {}
	
	public Student[] printStudent() { // 데이터 반환
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동","서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
		for(int i = 0; i < sArr.length; i++) {
			sArr[i].inform(); // 출력을 하지 말고 값만 넣기
		}
		return sArr;
	}
	
	public int sumScore() {	// 점수 합 반환
			int sum = 0;
			for(int i = 0; i < sArr.length; i++) {
				sum = sArr[i].getScore();
			}
		return sum;
	}
	
	public double[] avgScore() { // 평균 반환
//	 double[]에 sumScore의 리턴 값을 0번째 인덱스에 저장해서 
		
		double[] avg = new double[2];
		
		for(int i = 0; i < sArr.length; i++) {
			avg[0] += sArr[i].getScore(); // 합의 평균을 1번째 인덱스에 저장
		}
		avg[1] = (avg[0] / sArr.length);
		
		return avg;
	}
	
} // StudentController end
