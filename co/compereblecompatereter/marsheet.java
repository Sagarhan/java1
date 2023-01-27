package in.co.compereblecompatereter;

public class marsheet  implements Comparable<marsheet>{
	
	String rollno;
	String fristname;
	String lastname;
	int marks;
	public marsheet(String rollno, String fristname, String lastname, int marks) {
		super();
		this.rollno = rollno;
		this.fristname = fristname;
		this.lastname = lastname;
		this.marks = marks;
		
	}
	public String getRollno() {
		return rollno;
	}
	public String getFristname() {
		return fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(marsheet m) {
		// TODO Auto-generated method stub
		return m.rollno.compareTo(m.rollno);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno+","+fristname+","+lastname+","+marks+",";
		
	}
	
	

}
