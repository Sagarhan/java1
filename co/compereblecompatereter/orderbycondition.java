package in.co.compereblecompatereter;

import java.util.Comparator;

public class orderbycondition implements Comparator<marsheet> {

	@Override
	public int compare(marsheet m1, marsheet m2) {
		// TODO Auto-generated method stub
		if(m1.fristname.equals(m2.fristname)) {
			return 	m1.lastname.compareTo( m2.lastname);
		}else {
		return m1.fristname.compareTo( m2.fristname);
	
		}
		
	}}
