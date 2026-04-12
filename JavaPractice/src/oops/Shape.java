package oops;

public class Shape {
	public static void main(String args[]) {
		Rectangle rec1 = new Rectangle();
		rec1.radius = 10;
		System.out.println(rec1.radius);
		rec1.myShapeStyle();
		rec1.shapeDimension();
	}
}
