package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Practice {
	public void method1(String song) {
		File file = new File("C:/test/sub/나비야1.dat");
		
		try (OutputStream os = new FileOutputStream(file)) {
			os.write(song.getBytes("UTF-8"));
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2(String song) {
		File file = new File("C:/test/sub/나비야2.dat");
		
		try (OutputStream os = new BufferedOutputStream(new FileOutputStream(file))) {
			os.write(song.getBytes("UTF-8"));
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
