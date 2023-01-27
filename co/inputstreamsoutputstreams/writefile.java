package in.co.inputstreamsoutputstreams;

import java.io.FileWriter;
import java.io.IOException;

public class writefile {
	public static void main(String[] args) throws IOException {
		FileWriter out=new FileWriter("C:\\Users\\91911\\Documents\\New folder (3)\\write.txt");
		out.write("A");
		out.write("\n");
		out.write("this is one file");
		out.write("this is two file");
		out.close();
		System.out.println("done");
		
	}

}
