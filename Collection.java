package src.com.javaProgram.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection {
	public static void main(String[] args) {
		//Array list
		ArrayList alist= new ArrayList();
		alist.add("780");
		alist.add("Ankita");
		alist.add("false");
		System.out.println("Size of list: "+alist.size());
		alist.add("56.90");
		System.out.println("Size of list: "+alist.size());
		System.out.println("value at index 2 is: "+alist.get(2));
		System.out.println("List: "+alist);
		
		alist.remove(2);
		System.out.println("after deleting 2 index: "+alist);
		System.out.println("Size of list: "+alist.size());
		System.out.println();
		//Hash set
		HashSet<String> setOfNames= new HashSet();
		setOfNames.add("ankita");
		setOfNames.add("vanashri");
		setOfNames.add("jyoti");
		setOfNames.add("riya");
		setOfNames.add("akshara");
		setOfNames.forEach(System.out::println);
		System.out.println();
		//Linked list
		LinkedList<Integer> list= new LinkedList<>();
		list.add(780);
		list.add(90);
		list.add(30);
		System.out.println("Size of list: "+list.size());
		System.out.println("List:"+list);
		list.addFirst(56);
		System.out.println("Size of list: "+list.size());
		System.out.println("value at index 2 is: "+list.get(2));
		System.out.println("List: "+list);
	}

}
