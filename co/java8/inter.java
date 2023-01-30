package in.co.java8;
@FunctionalInterface

	public interface inter {
		
		public int add(int a,int b);
		
		
		public default void defmethord() {
			
			System.out.println("i am default methord");
			
			
			
	}
		
		public static void Static(){
			System.out.println("i'm static void");
		}
		
}

