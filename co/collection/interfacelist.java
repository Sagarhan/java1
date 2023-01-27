package in.co.collection;

import java.util.ArrayList;

public class interfacelist {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		 		list.add(0, "sagar");
		list.add(0);
		
		System.out.println(list.remove(0));
		System.out.println(list.set(0,"sagar"));
		System.out.println(list.indexOf("sagar"));
		System.out.println(list.lastIndexOf(0));
		System.out.println(list.subList(0,0));
	}

}
