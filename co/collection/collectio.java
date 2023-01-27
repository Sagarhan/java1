package in.co.collection;

import java.util.ArrayList;

public class collectio {
	public static void main(String[] args) {	
		
		ArrayList list=new ArrayList();
		 		
		list.add(2);
		list.add( "sagar");
		list.add( 12.12);
		
		System.out.println(list);
		System.out.println(list.get( 1));

		 ArrayList l = new ArrayList();
       l.add( "sagar singh");
       l.add( 34.6);
       l.add(null);
		 
       
       System.out.println(l.get(1));
       System.out.println(list);
      
		 boolean as=l.contains("sagar singh");
		 System.out.println(as);
		 System.out.println(l.size());
		 System.out.println(l.remove(list));
//		 System.out.println(l.retainAll());
		 System.out.println(l.remove(l));
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
