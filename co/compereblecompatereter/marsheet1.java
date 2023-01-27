package in.co.compereblecompatereter;

import colect.marksheet1;

public class marsheet1 implements Comparable< marsheet1
> {
	
	String rollno;
	String fristname;
	String lastyname;
	int marks;
	public marsheet1(String rollno, String fristname, String lastyname, int marks) {
		super();
		this.rollno = rollno;
		this.fristname = fristname;
		this.lastyname = lastyname;
		this.marks = marks;
		
	}
	public String getRollno() {
		return rollno;
	}
	public String getFristname() {
		return fristname;
	}
	public String getLastyname() {
		return lastyname;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(marsheet1 m) {
		// TODO Auto-generated method stub
		return m.rollno.compareTo(m.rollno);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno+","+fristname+","+lastyname+"," +marks+",";
	}
	

}
