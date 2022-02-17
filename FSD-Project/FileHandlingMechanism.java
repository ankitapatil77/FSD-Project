package src.com.javaProgram.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileHandlingMechanism {
	public static void main(String[] args) {
		
	     //file operation
		File newFolder=new File("newFolder");
		newFolder.mkdir();//create a directory
		//this line adds a new file into folder: newFolder
		System.out.println("file is created");
		File theFile= new File(newFolder,"first.txt");
		
		try {
			theFile.createNewFile();
			//addanother file into the same folder
			File anotherFile=new File(newFolder,"second.txt");
			anotherFile.createNewFile();
			System.out.println("-----------------");
			//create and write to a file
			PrintWriter writer;
	        try {
				writer= new PrintWriter(new File("some.txt"));
				System.out.println(writer);
			} catch (FileNotFoundException e) {
				System.out.println("some issue: "+ e.getMessage());
			}
	     }catch (Exception e) {
			// TODO: handle exception
		}
	}

}
