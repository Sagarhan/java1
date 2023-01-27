package in.co.basic;

public class stringbuffer {
	public static void main(String[] args) {
		StringBuffer sagar =new StringBuffer("vijay");
		sagar.append("dinanath chauhan");
		/*
		 * System.out.println(" "+sagar.length());
		 * System.out.println(" "+sagar.capacity());
		 * System.out.println(" "+sagar.charAt(6));
		 * System.out.println(""+sagar.replace(0,5,""));
		 */
        System.out.println(""+sagar.reverse() );
	}

}
