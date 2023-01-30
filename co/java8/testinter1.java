package in.co.java8;

public class testinter1 {
	public static void main(String[] args) {
		inter t = (a, b) -> {
			return a + b;
		};

		int t1 = t.add(20, 40);
		System.out.println(t1);

		inter tr = (a,b) ->{
			return a*b;
			
		};
		int t2= tr.add(20, 3);
		System.out.println(t2);
			
		

	}

}
