package in.co.polymorphism;

public class trengle extends Shape {
	int higth;
	int base;

	public int getHigth() {
		return higth;
	}

	public void setHigth(int higth) {
		this.higth = higth;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return higth * base;
	}

}
