package in.co.basic;

public class string {
	public static void main(String[] args) {
		String name="sagar singh hans";
		System.out.println(""+name.length());
		System.out.println(""+name.charAt(6));
		System.out.println(""+name.indexOf("h"));
		System.out.println(""+name.indexOf("hans"));
		System.out.println(""+name.lastIndexOf("a"));
		System.out.println(""+name.replaceAll("s",""));
		System.out.println(""+name.toLowerCase());
	    System.out.println(""+name.startsWith("sagar"));
	    System.out.println(""+name.startsWith("yuvi"));
	    System.out.println(""+name.endsWith("hans"));
	    System.out.println(""+name.substring(0, 11));
	}

}

