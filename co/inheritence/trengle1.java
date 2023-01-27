package in.co.inheritence;

public class trengle1 extends Shape1 {
	private int base;
	private int higth;
	public trengle1(int base, int higth,String color,int borderWidth) {
		super(color, borderWidth);
		this.base = base;
		this.higth = higth;
		
	}
	public int getBase() {
		return base;
	}
	public int getHigth() {
		return higth;
	}
	

}
