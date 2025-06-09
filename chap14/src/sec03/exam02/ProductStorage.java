package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// Product가 저장될 List 컬렉션
	private List<Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in); // 키보드 입력 Scanner 생성
	private int counter; // 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	
	public void showMenu() {
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("----------------------------------");
			
			System.out.print("선택: ");
			String selectNo = scanner.nextLine();
			switch (selectNo) {
				case "1":
					// Product 등록
					registerPriduct();
					break;
				case "2":
					// 등록된 모든 Product 정보 보기
					showProducts();
					break;
				case "3":
					return; // 프로그램 종료
			}
		}
	}
	
	public void registerPriduct() {
		try {
			Product product = new Product();
			
			// 상품 번호는 1부터
			product.setPno(++counter);
			
			System.out.print("상품명: ");
			product.setName(scanner.nextLine());
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		} catch (Exception e) { // 문자열을 정수로 바꿀 때 발생 가능한 예외 처리
			System.out.println("등록 에러: " + e.getMessage());
		} 
	}
	
	public void showProducts() {
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
