package serializatioanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readobject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file=new FileInputStream("C:\\Users\\91911\\Documents\\sagar.txt");
		
		ObjectInputStream in=new ObjectInputStream(file);
		marksheet m = (marksheet) in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.math);
		System.out.println(m.phys);
		System.out.println(m.hindi);
		
		in.close();
		file.close();
		
	}

}
