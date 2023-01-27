package in.co.compereblecompatereter;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		ArrayList m=new ArrayList();
		m.add( new marsheet("r1",  "sagar",  "singh",   50));
		m.add( new marsheet("r2",  "aman",   "shri",    70));
		m.add( new marsheet("r3",  "sumit",  "sharma",  60));
		m.add( new marsheet("r4",  "rohit",  "rajput",  90));
		
		Collections.sort(m,new orderbycondition());
		for(Object o: m) {
			System.out.println(o);
		}
	}

}
