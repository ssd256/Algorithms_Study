import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() { 
		
		// 학생 정보 출력 ==> printStudent() 반환값
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sArrs = ssm.printStudent(); // 주소값을 반환받았으니, 얕은복사하기
		for(int i = 0; i < sArrs.length; i++) {
			System.out.println(sArrs[i].inform());
		}
		
		// 학생 성적 출력 ==> avgScore() 반환값
		System.out.println("========== 학생 성적 출력 ==========");
		double[] avgScore = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + avgScore[0]);
		System.out.println("학생 점수 평균 : " + avgScore[1]);	
		
		// 성적 결과 출력 ==> 학생 점수 < CUT_LINE ==> 재시험, 아니면 통과 출력 
		System.out.println("========== 성적 결과 출력 ==========");
		int cut = StudentController.CUT_LINE;
		int score = 0;
		for(int i = 0; i < sArrs.length; i++) {
			score = sArrs[i].getScore();
			if(score > cut) {
				System.out.println(sArrs[i].getName() + "학생은 통과입니다.");
			} else {
				System.out.println(sArrs[i].getName() + "학생은 재시험 대상입니다.");
			}
		}
	}
	
	
} // StudentMenu end
