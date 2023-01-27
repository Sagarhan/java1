package in.co.oop;

public class testautomobile3{ 
	public static void main(String[] args) {
		automobile3 A= new automobile3();
		A.setColor("black");
		A.setMake( "G63");
	    A.setModel( 2023);
		A.setGears(null);
		
		System.out.println(A.getColor());
		System.out.println(A.getMake());
		System.out.println(A.getModel());
		System.out.println(A.getGears(5));
		
		
	}
	 
}



