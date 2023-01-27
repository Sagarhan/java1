package in.co.threads;

public class runnable {
	public static void main(String[] args) {
		Hellonothread t1 = new Hellonothread("ram");
		Hellonothread t2 = new Hellonothread("shyam");

		t1.run();
		t2.run();

		for (int i = 0; i < 50; i++) {
			System.out.println("sagar");

		}
	}
}
