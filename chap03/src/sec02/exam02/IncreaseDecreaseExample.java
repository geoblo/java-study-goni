package sec02.exam02;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++; // x = x + 1; => 11
		++x; // x = x + 1; => 12
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		y--; // y = y - 1; => 9
		--y; // y = y - 1; => 8
		System.out.println("y=" + y);
		
		// 다른 연산자와 같이 쓸 때
		System.out.println("--------------------");
		z = x++; // z = x; x = x + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		z = ++x; // x = x + 1; z = x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++; // x = x + 1; z = x + y; y = y + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// 가독성을 고려하여 명확하게 작성하는 것도 좋은 방법
		++x;
		z = x + y;
		y++;
	}

}
