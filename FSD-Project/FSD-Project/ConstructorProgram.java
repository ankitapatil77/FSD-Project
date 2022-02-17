package src.com.javaProgram.Assignment;


class Student{
	int regNumber;
	String studentName;
	String address;
	long phone_no;
	//constructor 
	Student(int reg_no,String name,String address,long number){
		this.regNumber=reg_no;
		this.studentName=name;
		this.address=address;
		this.phone_no=number;
	}
}
public class ConstructorProgram {
	public static void main(String[] args) {
		Student[] arr;
		arr=new Student[3];
		
		arr[0]=new Student(2134,"Ankita","Karad",111111);
		arr[1]=new Student(2135,"Vanshri","Shirala",122111);
		arr[2]=new Student(2136,"Siddhi","Mumbai",11134556);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Students with registration number "+ arr[i].regNumber+" is: "+ arr[i].studentName);
			
		}
	}
	

}
