import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) { // file을 매개변수로 받아서 true/false 확인
		// DAO에 매개변수 전달, DAO로부터 전달받은 값을 다시 반환
		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고  
		// 그리고 그 반환 값을 그대로 받아 또 반환해줌 
		boolean t;
		t = fd.checkName(file);
		return t; // true/false
	}
	
	public void fileSave(String file, StringBuilder sb) {
		// 전달받은 매개변수 변경, DAO에 전달
		// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileSave()메소드 매개변수로 
		// file과 String을 넘김
		String nb = sb.toString();
		fd.fileSave(file, nb); 
	}
	
	public StringBuilder fileOpen(String file) {
		// DAO에 매개변수 전달, DAO로부터 전달받은 값을 다시 반환
		StringBuilder f = fd.fileOpen(file);
		return f; 
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		// 전달받은 매개변수 변경, DAO에 전달
		// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileEdit()메소드 매개변수로 
		// file과 String을 넘김 
		String nb = sb.toString(); // toString() : String 계열을 String으로 변경
		fd.fileEdit(file, nb);
		
	}
	
	
} // class end
