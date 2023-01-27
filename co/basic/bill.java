package in.co.basic;

public class bill {
	public static void main(String[] args) {
		
		var discount_1=500;
		var discount_2=1000;
		var totalbill=1500;
		
		
		if( totalbill>=discount_1){
			System.out.println("10%");				
			}
		else if(totalbill>=discount_2) {
			System.out.println("20%");
		}
		else {
			System.out.println("no discont");
		}
	}

}
