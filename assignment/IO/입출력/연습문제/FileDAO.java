import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		// 존재하는 파일이 있는지 확인 후 반환
		File f = new File(file); 
		
//		boolean t;
//		if(f.exists()) { // f가 존재하면 파일을 반환
//			t = true;
//		} else {	// f가 없으면 파일 반환X
//			t = false;
//		}
		
		return f.exists(); // 한 줄 버전
	}
	
	public void fileSave(String file, String s) {
		// 매개변수로 받은 파일명을 문자열에 저장
		// 문자저장 ==> Writer
		// 파일에 저장 ==> FileWriter
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		// 매개변수로 받은 파일명을 이용해 저장 되어 있는 데이터 반환
		// 문자읽기 ==> Reader
		// 파일 읽기 ==> FileReader
		StringBuilder sb = null;
		try(BufferedReader bw = new BufferedReader(new FileReader(file))) {

			String temp;// 임시공간
			sb = new StringBuilder();
			while((temp = bw.readLine()) != null) {
				sb.append(temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		// 매개변수로 받은 파일 명에 문자열 저장
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
		// String에 써서 저장하되 이어서 저장될 수 있도록 함 ==>  true
		// 문자저장 ==> Writer
		// 파일에 저장 ==> FileWriter
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
} // class end
