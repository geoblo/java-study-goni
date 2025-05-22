package sec01.exam03_2.quiz;

public class Point3D extends Point {
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	@Override
	public void location() {
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}
}
