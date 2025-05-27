package sec01.exam04;


//public class Member extends Object {
public class Member { // 명시적으로 상속받은게 없으면 자동으로 Object를 상속 받음
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개 변수의 타입이 Object 타입으로 모든 객체가 대입 가능하므로
		// 제일 먼저 매개값이 Member 타입인지 확인이 필요
		if (obj instanceof Member) {
			// id 필드에 접근하기 위해 Member 타입으로 강제 타입 변환하고
			Member member = (Member) obj;
			// id 필드값이 동일한지 검사한 후 동일하다면 true를 리턴
			if (id.equals(member.id)) { // 여기서의 equals()는 String에 재정의 된 메소드로 문자열을 비교
				return true;
			}
		}
		
		// 매개값이 Member 타입이 아니거나
		// id 필드값이 다른 경우 false를 리턴
		return false;
	}
	
	@Override
	public int hashCode() {
		// id값이 같으면 동일한 해시코드가 나오도록 함
		return id.hashCode(); // String은 문자열이 같으면 동일한 해시코드가 나오도록 재정의 되어있음
	}
}

