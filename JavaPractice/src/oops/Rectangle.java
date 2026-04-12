package oops;

public class Rectangle implements ShapeInterface {
	int radius;
	
	@Override
	public void myShapeStyle() {
		System.out.println("I am the Circle");
		
	}

	@Override
	public void shapeDimension() {
		System.out.println("My radius is: " + radius + " m");
		
	}
}
