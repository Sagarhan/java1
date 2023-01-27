package in.co.polymorphism;

public class rectengle1 extends Shape1 {
	
	int length;
	int width ;
	public rectengle1(int length, int width) {
		super();
		this.length = length;
		this.width = width;
		
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public double area1() {
	
		return length*width;
	}

}
