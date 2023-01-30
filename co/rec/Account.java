package in.co.rec;


public class Account {
	
	private int balence = 0;
	
	public synchronized void deposit (String msg,int amt) {
		int bal=getBalence();
		bal=bal+amt;
		setBalence(bal);
		System.out.println(msg+"new balence"+bal);
	}
	

	public int getBalence() {
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return balence;
	}

	public void setBalence(int balence)  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balence = balence;
		
	}
	
	
}