package oopsConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fileOutputStream;
		
		try {
			
			fileOutputStream = new FileOutputStream("abc.txt");
			String msg = "Insert Message to text file";
			
			byte byteArray[] = msg.getBytes();//converting String to byte Array
			
			fileOutputStream.write(byteArray);
			
			System.out.println("Message was written Successfully");
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}catch(IOException e) {
			System.out.println("IO Exception");
		}
		
		
	}

}
