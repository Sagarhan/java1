
package in.co.exception;

public class Multiplecatch {
	public static void main(String[] args) {

		String name = "sagar singh";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(11));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("name chhota h");
		} catch (NullPointerException e) {

			System.out.println("ok thx");

		} finally {
			System.out.println("abcdefghijklmnopqrstuvwxyz");
		}

	}

}
