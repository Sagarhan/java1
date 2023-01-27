package in.co.oop;

public class testaccount {
	public static void main(String[] args) {
		
		account ac = new account();
		
		ac.setName( "sagar singh");
		ac.setNumber( 1234);
		ac.setAccounttype( "saving ");
		ac.setBalence( 1000);
		  
		System.out.println(ac.getName());
		System.out.println(ac.getNumber());
		System.out.println(ac.getAccounttype());
		System.out.println(ac.getBalence());
		System.out.println(ac.diposte( 999));
	}
	

}
