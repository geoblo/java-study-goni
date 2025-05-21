package homework;

import java.util.Arrays;

public class Homework7 {

	public static void main(String[] args) {
		String[] report = {"Introduction", "Research", "Conclusion"};
		
        // Arrays.copyOf()를 사용한 배열 복사
        String[] copiedReport = Arrays.copyOf(report, report.length);

        // 복사된 배열의 첫 번째 항목 수정
        copiedReport[0] = "Team Feedback";

        // 출력
        System.out.print("원본 보고서: ");
        for (int i = 0; i < report.length; i++) {
        	if (i > 0) System.out.print(", ");
            System.out.print(report[i]);
        }

        System.out.println();

        System.out.print("복사된 보고서: ");
        for (int i = 0; i < copiedReport.length; i++) {
        	if (i > 0) System.out.print(", ");
            System.out.print(copiedReport[i]);
        }
	}

}
