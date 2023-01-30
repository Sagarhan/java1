package in.co.rec;

public class testrace {
	public static void main(String[] args) {
		recondionthread t1=new recondionthread("aman");
		recondionthread t2=new recondionthread( "sumit");
		
t1.start();
t2.start();
		
	}

}
