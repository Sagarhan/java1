
package in.co.collection;

import java.util.LinkedList;

public class queue {
	public static void main(String[] args) {
		
		LinkedList q=new LinkedList();
	   q.offer( "ram");
	   q.offer( "shyam");
	   q.offer( "ramu");
	   q.offer( "karan");
	   
	    System.out.println(q.poll());
	    System.out.println(q.poll());
	    System.out.println(q.poll());
	    System.out.println(q.poll());
	}

}
