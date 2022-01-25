package src.com.javaProgram.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram {
	public static void main(String[] args) {
		//treemap
		TreeMap<String, Integer> map= new TreeMap<>();
		
		map.put("Ankita", 567800);
		map.put("Anku", 587800);
		map.put("Riya", 57800);
		map.put("Akshara", 67800);
		
		map.forEach((k,v)-> System.out.println("key "+k+" value "+v));
		System.out.println("----------------");
		//hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	}

  }
}
