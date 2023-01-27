package in.co.inheritence;

public class circle1 extends Shape1{
private int radius;

public circle1(int radius,String color,int borderWidth) {
	super( color, borderWidth);
	this.radius = radius;
	
}

public int getRadius() {
	return radius;
}

	
}
