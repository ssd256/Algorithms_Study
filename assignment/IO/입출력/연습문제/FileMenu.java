import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() { // 메인 메뉴
		// 1. 노트 새로 만들기(저장) ==> fileSave()
		// 2. 노트 열기(오픈) 		 ==> fileOpen()
		// 3. 노트 열어서 수정		 ==> fileEdit()
		// 9. 끝내기				 ==> "프로그램을 종료합니다." 출력 후 종료
		do {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

      // switch도 가능
			if(num == 1) {
				fileSave();
			} else if(num == 2) {
				fileOpen();
			} else if(num == 3) {
				fileEdit();
			} else if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}while(true);
	}
	
	public void fileSave() { // 파일명과 저장할 값 받음. ex끝it 입력 ==> 종료
		String contents = null; // 내용 입력
		StringBuilder sb = new StringBuilder(); // 입력값 저장
		do {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			contents = sc.next();
			if(!contents.equals("ex끝it")) {
				sb.append(contents);
			}
		} while(!contents.equals("ex끝it"));
		
		String fName = "";
		String yesNo = "";
		while(true) {
			System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			fName = sc.next();
			// 이미 존재하는 파일 명이면 "이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)"
			// y ==> FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김 
			// n ==> "저장할 파일 명을 입력해주세요 ~"가 다시 나오게끔 반복

			if(fc.checkName(fName) == true) { // 아니 왜 안걸러지는겨
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				yesNo = sc.next();
				if(yesNo.equalsIgnoreCase("y")) {
					fc.fileSave(fName, sb); // 파일명, 파일 내용
					break;
				} else if(yesNo.equalsIgnoreCase("n")) {
					continue;
				}
			} else if (fc.checkName(fName) != true) {
			// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면  
			// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
				fc.fileSave(fName, sb);
				return;
			}
		}
	}
	
	public void fileOpen() { // 파일명을 받아 저장된 데이터 출력
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		System.out.print("열 파일 명 : ");
		String fName = sc.next();
		boolean cName = fc.checkName(fName); // 파일명 있는지 확인
		
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력 
		if(cName == true) {
			System.out.println(fc.fileOpen(fName));
		} else if (cName == false){ 
			// 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감
			System.out.println("없는 파일입니다.");
			return;
		}
	}
	
	public void fileEdit() { // 파일명과 저장할 값을 받음
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		System.out.print("수정할 파일 명 : ");
		String fName = sc.next();
		boolean cName = fc.checkName(fName);
		
		String contents = null;
		StringBuilder sb = new StringBuilder();
		if(cName == false) { // 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감
			System.out.print("없는 파일입니다.");
			return;
		} else if (cName == true) {
			// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음 
			do {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				contents = sc.next();
				sb = new StringBuilder(contents);
			} while(contents.equals("ex끝it") != true);
		// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
		fc.fileEdit(fName, sb);
		}
	}
	
} // class end
