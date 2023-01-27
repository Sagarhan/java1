package in.co.collection;

import java.util.HashSet;
import java.util.Iterator;

public class set {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("ram");
		hs.add("sonu");
		hs.add(10);
		hs.add("");
		hs.add("rahul");
		hs.add(100);
		System.out.println(hs);

		Iterator it = hs.iterator();
		while (it.hasNext())
			;
		System.out.println(it.hasNext());

	}

}
