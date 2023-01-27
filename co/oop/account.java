package in.co.oop;

public class account {

	private String name;
	private int number;
	private String accounttype;
	private double balence;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	public double diposte(double amount) {
		int amout = 0;
		if(amout<0) {
			System.out.println("please diposit only +velue");

		}else {
			System.out.println("please gretor than =0");
		}
		return amout;
	}
	
	
	
}
