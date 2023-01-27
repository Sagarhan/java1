package in.co.inputstreamsoutputstreams;

import java.io.FileWriter;
import java.io.IOException;

public class writeafile {
	public static void main(String[] args) throws IOException {
		
		FileWriter out=new FileWriter("C:\\Users\\91911\\Documents\\New folder\\write.txt");
		out.write( 'a');
		out.write('\n');
		out.write("thise is file run");
		out.write( "thise line two");
		out.close();
		System.out.println("done");
	}

}
