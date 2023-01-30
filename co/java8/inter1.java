package in.co.java8;
@FunctionalInterface
public interface inter1 {
	public void add(int a,int b);
	 
	public default  void defmethord() {
		System.out.println("i'm default methord");
	
	}
	public static void Static() {
		System.out.println("i'm static methord");
		
	}
}
