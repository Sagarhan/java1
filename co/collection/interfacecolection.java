package in.co.collection;

import java.util.ArrayList;

public class interfacecolection {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(0);
		list.add( 0, "sagar");
		System.out.println(list);
		System.out.println(list.get( 0));
		
		ArrayList l=new ArrayList();
		
		System.out.println(l.add( 1));
		System.out.println(l.addAll(list));
		System.out.println(l.contains(null));
		System.out.println(l.containsAll(l));
		System.out.println(l.isEmpty());
		System.out.println(l.iterator());
		System.out.println( l.remove(args));
		System.out.println(l.removeAll(list));
	System.out.println(l.retainAll(l));
		System.out.println(l.size());
	}

}
