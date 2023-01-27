package in.co.basic;

public class args {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Hello" + args[1]);

		} else {
			System.out.println("args name is required");
			for (int i = 0; i < args.length;i++ ) {
				System.out.println(args[i]);
			}
		}
	}
}