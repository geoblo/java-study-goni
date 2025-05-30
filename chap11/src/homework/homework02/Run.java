package homework.homework02;

public class Run {

	public static void main(String[] args) {
		String[] addressArr = new String[4];
		addressArr[0] = "서울특별시 금천구 구로디지털2로 95";
		addressArr[1] = "서울특별시 서대문구 연희로 248";
		addressArr[2] = "울산광역시 남구 돋질로 233";
		addressArr[3] = "경상북도 구미시 송정대로 55";
		
		for (String address : addressArr) {
			System.out.println(takeState(address));
		}
	}

	public static String takeState(String address) {
		String[] arr = address.split(" ");
		for (String str : arr) {
			if (str.endsWith("구")) {
				return str;
			}			
		}
		
		return null;
	}
}
