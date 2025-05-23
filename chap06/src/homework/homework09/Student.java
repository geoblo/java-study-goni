package homework.homework09;

public class Student {
	// 방법1
	private static int noCounter = 1;
    private final int studentNo; // 수정 불가능한 학번
    // 방법2
//	private static int studentNo = 0; // static만 썼을 경우 내부에서는 수정 가능
	
    private String studentName;
	private String className;
	
	public Student() {
		// 방법1
		studentNo = noCounter++;
		
		// 방법2
//		studentNo++;
	}

	// 학번은 setter 없음
	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
