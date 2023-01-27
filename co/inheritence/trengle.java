package in.co.inheritence;

public class trengle extends Shape { 
	int base;
	int higth;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHigth() {
		return higth;
	}
	public void setHigth(int higth) {
		this.higth = higth;
	}
	 
	public void area() {
		System.out.println(base*higth);
		
	}
	

}
