import java.io.*;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException{
		// TODO Auto-generated method stub
/*
 *1. Declare your object no instatiation
 *2. class should implement serializable interface
 *3. Add import java.io.serializable;
 *4. FileInputStream fileIn = new FileInputStream(file path)
 *5. ObjectInputStream in= new ObjectInptStream(fileIn)
 *6.objectName=(class) in.readObject();
 *7. in.close();
 *8. fileIn.close();
 */
		User user= null;
		FileInputStream fileIn = new FileInputStream("C:\\Users\\dell\\.eclipse\\Serialization\\UserInfo.ser");
		ObjectInputStream in= new ObjectInputStream(fileIn);
		user =(User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();		
		

	}

}