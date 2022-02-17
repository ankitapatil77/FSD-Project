package com.javaProgram;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StudentRecordFileHandling {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String option,choice = "y";        
		while( choice.equalsIgnoreCase("y") ) {        	
			System.out.println("Student Information System \n\n");
			System.out.println("1 ===> Add New Student Record ");
			 System.out.println("2 ===> View All Student Record ");	
			 System.out.println("3 ===> Update Specific Record of Student ");	        
			System.out.println("\n");
			 System.out.println("Enter your choice(1/2/3): ");
				option = scan.next();
					if( option.equals("1") ) {
						try {
							AddRecord();
						} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						    } else if(option.equals("2") ) {
						        		try {
											ViewAllRecord();
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
						    
						        }	else if( option.equals("3") ) {
						        		try {
											updateRecordbyID();
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
						        }	
							        	
						        System.out.println("Do you want to continue? Y/N");
						        choice = scan.next();
						       	
					        }

					}
		
	public static void AddRecord() throws IOException {
		BufferedWriter bw = new BufferedWriter( new FileWriter("Studentsrecords.txt",true) );
		Scanner str = new Scanner(System.in);
		
		String ID, name,Sclass, age, addr,mob_no;
		
		System.out.print("Enter the Student ID: ");
		ID = str.next();
		
		System.out.print("Enter the Student Name: ");
		name = str.next();
		System.out.print("Enter the Student Age: ");
		age = str.next();
		
		System.out.print("Enter the Student Address: ");
		addr = str.next();
		
		System.out.print("Enter the Student mobile number: ");
		mob_no = str.next();  
   		
		bw.write(ID+","+name+","+age+","+addr+","+mob_no);
		bw.flush();
		bw.newLine();
		bw.close();	
        }
public static void ViewAllRecord() throws IOException {
	BufferedReader br = new BufferedReader( new FileReader("Studentsrecords.txt") );
	
	String Srecord;
		
	System.out.println(" ------------------------------------------------------------- ");
	System.out.println("|   ID   Name     Age   Address     Mobile Number 	  |");
	System.out.println(" ------------------------------------------------------------- ");
		
	while( ( Srecord = br.readLine() ) != null ) {
			
		StringTokenizer st = new StringTokenizer(Srecord,",");
			
		System.out.println("   "+st.nextToken()+"   "+st.nextToken()+"     "+st.nextToken()+"   "+st.nextToken()+"     "+st.nextToken());

	}
	
	
	System.out.println("|	                                            	          |");
	System.out.println(" ------------------------------------------------------------- ");
	br.close();    		
		
}

public static void updateRecordbyID() throws IOException {
	String newName, newAge,newAddr, record, ID, record2;
	
	File thefile = new File("Studentsrecords.txt");
	File tempfile = new File("Studentsrecords_temp.txt");
	
	BufferedReader br = new BufferedReader( new FileReader(thefile) );
	BufferedWriter bw = new BufferedWriter( new FileWriter(tempfile) );
	    		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\t\t Update Students Record\n\n");   
/**/		
	System.out.println("Enter the Student ID: ");
		ID = sc.next();	    		
		System.out.println(" ------------------------------------------------------------- ");
		System.out.println("|	ID		 Name 	   	Age			Address       |");
		System.out.println(" ------------------------------------------------------------- ");
		
		while( ( record = br.readLine() ) != null ) {
			
			StringTokenizer st = new StringTokenizer(record,",");
			if( record.contains(ID) ) {
				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
			}
			
		}	   


		System.out.println(" ------------------------------------------------------------- ");
		
	     br.close();
/**/    	   
	System.out.println("Enter the new Name: ");
	newName = sc.next();    		
	System.out.println("Enter the new Age: ");
	newAge = sc.next();
	
	System.out.println("Enter the new Address: ");
	newAddr = sc.next(); 
	BufferedReader br2 = new BufferedReader( new FileReader(thefile) );
	
	while( (record2 = br2.readLine() ) != null ) {    			
		if(record2.contains(ID)) {
			bw.write(ID+","+newName+","+newAge+","+newAddr);
		} else {
		
			bw.write(record2);	
		}    			
		bw.flush();
		bw.newLine();
	}
	
	bw.close();
	br2.close();    		
	thefile.delete();    		
	boolean success = tempfile.renameTo(thefile);    		
	System.out.println(success);    		
	
}


}





	
					