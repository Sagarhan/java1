package in.co.polymorphism;

public class trengle1 extends Shape1 {
	int higth;
	static int width;

	public trengle1(int higth, int width) {
		super(getWidth(),color);
		this.higth = higth;
		this.width = width;

	}

	public int getHigth() {
		return higth;
	}

	public static int getWidth() {
		return width;

	}

	@Override
	public double area2() {
		// TODO Auto-generated method stub
		return higth * width;
	}
}
