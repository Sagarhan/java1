package in.co.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public static void main(String[] args) {
		HashSet s = new HashSet();

		s.add("zero");
		s.add("one");
		s.add("three");
		s.add("for");

		Iterator it = s.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}

}
