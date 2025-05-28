package sec01.exam10;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		// Class 객체는 해당 클래스 파일의 경로 정보를 가지고 있음
		// 이를 활용해 다른 리소스 파일의 경로를 얻을 수 있음
		String photo1path = clazz.getResource("photo1.jpg").getPath();
		System.out.println(photo1path); // 현재 클래스가 있는 위치에서 파일을 찾아 절대 경로로 반환
		
		String photo2path = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2path);
	}

}
