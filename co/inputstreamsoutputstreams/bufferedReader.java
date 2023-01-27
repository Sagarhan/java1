package in.co.inputstreamsoutputstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
	public static void main(String[] args) throws IOException {
	FileReader file=new FileReader("C:\\Users\\91911\\write.txt"); 
	bufferedReader in=new bufferedReader();
	
	String line=in.readline();
	while(line !=null);
	System.out.println(line);
	line=in.readline();
		
	}

	private String readline() {
		// TODO Auto-generated method stub
		return null;
	
		
	


	}

}
