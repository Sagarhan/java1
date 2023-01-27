package in.co.inputstreamsoutputstreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriter {
	public static void main(String[] args) throws IOException {
		FileWriter out=new FileWriter("C:\\Users\\91911\\Desktop\\yuvi.txt");
		PrintWriter pw=new PrintWriter(out);
		
		for(int i=0;i<5;i++) {
		pw.println(i+(":sagar hans"));
	}
pw.close();
System.out.println("done");
	}
}

