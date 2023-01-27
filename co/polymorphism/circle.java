package in.co.polymorphism;

public class circle extends Shape {
	int redius;

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return redius;
	}
	
	

}
