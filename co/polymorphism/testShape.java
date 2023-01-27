
package in.co.polymorphism;

public class testShape {
	public static void main(String[] args) {

		rectengle s = new rectengle();
		s.setLength(25);
		s.setWidth(25);
		System.out.println(s.area());

		trengle t = new trengle();
		t.setBase(20);
		t.setHigth(30);
		System.out.println(t.area());
		
		circle c=new circle();
		c.setRedius( 3000);
		
		System.out.println(c.area2());

	}

}
