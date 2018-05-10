// package Java_examples; //not used for test compilation
// use  https://www.compilejava.net/  for compilation

import java.util.*;

public class Lists {
	
	public static List<String> Names = new ArrayList<String>(); // the list
	
	public static void addList(String s){ // essentially a command block
		Names.add(s);
	}
	public static boolean checkSize(int size){ // essentially a predicate block
		if(size < 0){
		    return false;
		}	
		return true;
	}
	public static String getListItems(int size){ // essentially a reporter block
		if(checkSize(size)){
		    return Names.get(size);
		}else{
			return null;
		}
	}
	public static void main(String[] args){
		addList("ethan");
		addList("david");
		System.out.println("length = " + Names.size()); // tells the list length
		for(int nametListSize = 0; nametListSize < Names.size(); nametListSize++){
			System.out.println("item " + nametListSize + " of list"); // tells the the # of the item on the list
			System.out.println(getListItems(nametListSize)); // tells the names

		}
    	}
}
