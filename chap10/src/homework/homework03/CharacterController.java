package homework.homework03;

public class CharacterController {
	public CharacterController() {
	}
	
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException 발생, 에러 메시지는 출력 값 참고
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); 
			if (c == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			} else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				count++;
			}
		}
		return count;
	}
}
