package in.co.polymorphism;

public class circle1 extends Shape1 {
	private double radius;

	void radius() {

	}

	public circle1(double radius) {
		super();
		this.radius = radius;

	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area3() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

}
