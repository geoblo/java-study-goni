package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김재현";
		String strVar2 = "김재현";
		
		// 번지(주소값)을 비교 => 동일한 객체인지 비교
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");			
		}
		
		// 순수 문자열 비교
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("김재현");
		String strVar4 = new String("김재현");
		
		// 번지(주소값)을 비교 => 동일한 객체인지 비교
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");			
		}
		
		// 순수 문자열 비교
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		
		
		
		
		
		
		
		
	}

}
