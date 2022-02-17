package src.com.javaProgram.Assignment;

public class StringProgram {

	public static void main(String[] args) {
		String str = new String("Ankita");
		
		System.out.println(str);
		
		String otherStr;
		
		otherStr = new String("Namrata");
		
		System.out.println(otherStr);
	
		String myStr = "Vanashri";
		
		System.out.println(myStr);//vanashri
		
		myStr = "Riya";
		System.out.println();
		
		String anotherStr = "Riya";
		
		System.out.println(anotherStr);//Riya
		
		System.out.println();
		anotherStr = anotherStr.toUpperCase();
		
		System.out.println(anotherStr);//RIYA
		System.out.println();
		anotherStr = anotherStr.toLowerCase();
		
		System.out.println(anotherStr);//riya
		System.out.println();
		anotherStr = anotherStr.concat(" patil");
		
		System.out.println(anotherStr);
		System.out.println();
		
		anotherStr += " R";
		
		System.out.println(anotherStr);
		System.out.println();
		
		System.out.println(anotherStr.substring(4));
		System.out.println();
		System.out.println(anotherStr.substring(4, 9));
		System.out.println();
		
		
		String []values = anotherStr.split(" ");
		
		System.out.println("Splitted strings are :");
		
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println(anotherStr.charAt(6));

	}

}
