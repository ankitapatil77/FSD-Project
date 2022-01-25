package src.com.javaProgram.Assignment;
class AccessSpecifiers
{ 
  void show() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
 

//public class

 public int legCount;

 // public method
 public void display() {
     System.out.println("I am an animal.");
     System.out.println("I have " + legCount + " legs.");
 }
 class Animal {
	    // protected method
	    protected void input() {
	        System.out.println("I am an animal");
	    }
	}
public void input() {
	System.out.println("I am an animal");
	
}

}
public class AccessModifier {
	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		AccessSpecifiers obj = new AccessSpecifiers(); 
		obj.show();
		System.out.println();
		
		System.out.println("public access speifier");
        obj.display();
        System.out.println();
        
        System.out.println("protected access specifier");
        obj.input();

	}
	
}


