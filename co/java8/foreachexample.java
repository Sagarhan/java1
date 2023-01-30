package in.co.java8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class foreachexample {
	public static void main(String[] args) {
	List l=new ArrayList();
	l.add("one");
	l.add("two");
	l.add("three");
	l.add("foar");
	l.forEach(li->System.out.println(li));
	}

}