package in.co.inputstreamsoutputstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import in.co.basic.string;

public class readfromkeybord {
	public static void main(String[] args) throws IOException {
		InputStreamReader isreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isreader);
		
		
		PrintWriter out = new PrintWriter("C:\\Users\\91911\\Desktop\\write.txt");
		
		String line = in.readLine();
		while(!line.equals("quit")){
			out.println(line);
			line=in.readLine();
		}
		out.close();
		in.close();
		
			
		
	
	 
}
}