package homework.homework01;

public class Run {
	
	public static void main(String[] args) {
		// 참고 - 배보다 배꼽이 더 크다.
		// BufferedOutputStream은 대량 데이터 처리에서 성능 향상이 뚜렷하게 나타남
		// 하지만 현재 코드처럼 데이터 크기가 작고 실행 시간 측정 단위가 나노초 수준일 경우,
		// 버퍼 사용 자체에도 비용이 들기에 오히려 버퍼 사용이 더 느리게 나올 수도 있음
		// 즉, 데이터가 너무 작아 버퍼링의 이점이 없음
		
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		Practice practice = new Practice();
		
		long start1 = System.nanoTime();
		practice.method1(song);
		long end1 = System.nanoTime();
		System.out.println("method1(버퍼 미사용): " + (end1 - start1) + "ns");

		long start2 = System.nanoTime();
		practice.method2(song);
		long end2 = System.nanoTime();
		System.out.println("method2(버퍼 사용): " + (end2 - start2) + "ns");
	}
	
}
