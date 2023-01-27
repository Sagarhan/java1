package in.co.inputstreamsoutputstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copybinary {
	public static void main(String[] args) throws IOException {
		String source="";
		String target="";
		
		FileInputStream in=new FileInputStream("source");
		
		FileOutputStream out=new FileOutputStream("target");
		int ch=in.read();
		while(ch !=-1) {
		out.write(ch);
		ch=in.read();
	}
     in.close();
     out.close();
     System.out.println("done");
}
}