package in.co.exception;

public class Arthmetic<ArthmeticExeptiion, ArthmeticExeption> {
	public static void main(String[] args) {

	

	int k = 15;
	int i = 0;

	try
	{
		double div = i / k;
		System.out.println("div as" + div);

	}catch(ArithmeticException e){
			System.out.println("divided by zero");
		}

	
}}
