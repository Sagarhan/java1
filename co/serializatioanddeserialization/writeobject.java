package serializatioanddeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeobject {
	public static void main(String[] args) throws IOException {
		 FileOutputStream file=new FileOutputStream("C:\\Users\\91911\\Documents\\sagar.txt");
		 
		 ObjectOutputStream out=new ObjectOutputStream( file);
		 marksheet m=new marksheet();
		 m.name="sagar";
		 m.phys=89;
		 m.math=56;
		 m.hindi=67;
		 out.writeObject( m);
		 out.close();
		 file.close();
		 

		 
		 
		 
	}

}
