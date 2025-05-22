package sec01.exam03_2.quiz;

public class Point {
	protected int x;
	protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void location() {
        System.out.println("x=" + x + ", y=" + y);
    }
}
