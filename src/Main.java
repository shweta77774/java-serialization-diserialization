import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
/*	Steps to serialize
 * -------------------------------
 * 1.Object class should implement serializable interface
 * 2.import java.io.serializable;
 * 3.FileOutputStream fileOut= new FileOutputStream(file path)
 * 4.ObjectOutputStream out= new ObjectOutputStream(fileOut);
 * 5.out.writeObject(objectName);
 * 6.out.close(); fileOut();
*/
		
		
		User user= new User();
		user.name="Sheweta";
		user.password="FGSDBJKJ";
		
		
		FileOutputStream fileOut= new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved! :");
		
		
	}

}
