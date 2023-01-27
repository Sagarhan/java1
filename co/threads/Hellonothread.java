package in.co.threads;

public class Hellonothread implements Runnable {
	String name = "null";
	public Hellonothread(String n) {
		name =n;
	}
	public void run() {
	
	for(int i=0;i<50;i++) {
	System.out.println(i+name);
	
	}
}
}