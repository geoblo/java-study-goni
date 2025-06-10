package homework.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Practice {
	public long method1(String path) {
		File file = new File(path);
		
		long start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(file)) {
			// 파일 크기만큼 바이트 배열 생성
            byte[] data = new byte[(int) file.length()];
            is.read(data); // 전체 바이트 읽기

            // UTF-8 디코딩
            String result = new String(data, "UTF-8");
            System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
        return end - start;
	}
	
	public long method2(String path) {
		File file = new File("C:/test/sub/나비야2.dat");
		
		long start = System.nanoTime();
		
		try (InputStream is = new BufferedInputStream(new FileInputStream(file))) {
			// 파일 크기만큼 바이트 배열 생성
            byte[] data = new byte[(int) file.length()];
            is.read(data); // 전체 바이트 읽기

            // UTF-8 디코딩
            String result = new String(data, "UTF-8");
            System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
        return end - start;
	}
}
