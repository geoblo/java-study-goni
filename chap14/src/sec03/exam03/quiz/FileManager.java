package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	public void deleteFile(File dir) {
		if (dir.exists() && dir.isDirectory()) {
			// dir 폴더에 있는 파일 및 하위 폴더를 File 배열로 리턴
			File[] files = dir.listFiles();
			
			for (File file : files) {
				System.out.print(file + " -> ");
				System.out.println(file.delete() ? "삭제 완료" : "삭제 안됨");
			}
		} else {
			System.out.println("폴더가 아니거나 존재하지 않습니다.");
		}
	}
}
