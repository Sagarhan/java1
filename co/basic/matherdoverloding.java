package in.co.basic;

public class matherdoverloding {
	public static void main(String[] args) {
		add(300, 600);
		add("aman", 600);
		add("rohit", "rahul");
		add("ram", 20, "sagar", 40);

	}

	private static void add(String string, int i, String string2, int j) {
		System.out.println(string + i + string2 + j);

	}

	private static void add(String string, String string2) {
		System.out.println(string + string2);

	}

	private static void add(String string, int j) {

		System.out.println(string + j);

	}

	private static void add(int i, int j) {
		System.out.println(i + j);

	}

}
