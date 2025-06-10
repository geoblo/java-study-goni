package homework.homework03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileDAO {
	public boolean checkName(String file) { 
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌 
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환 
		File fileObj = new File(file);
		return fileObj.exists();
	}
	
	public void fileSave(String file, String s) { 
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고 
		// String에 써서 저장 
		try (Writer writer = new FileWriter(file)) {
			writer.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		StringBuilder sb = new StringBuilder();
		try (Reader reader = new FileReader(file)) {
			int readCharNum;
			
			// 방법1
//			while ((readCharNum = reader.read()) != -1) {
//				sb.append((char) readCharNum);
//			}
			
			// 방법2: char 배열 사용
			char[] buffer = new char[10];
			while ((readCharNum = reader.read(buffer)) != -1) {
				sb.append(buffer, 0, readCharNum); // 정확히 읽은 문자만 추가
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb; 
	}
	
	public void fileEdit(String file, String s) { 
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
		// String에 써서 저장하되 이어서 저장될 수 있도록 함
		try (Writer writer = new FileWriter(file, true)) {
			writer.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
