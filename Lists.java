// package Java_examples; //not used for test compilation
// use  https://www.compilejava.net/  for compilation

import java.util.*; // imports the sources

public class Lists { // creates the file name
	
	public static List<String> Names = new ArrayList<String>(); // the list (length starts at 0)
	
	public static void addList(String s){ // essentially a command block
		Names.add(s);
	}
	public static boolean checkSize(int size){ // essentially a predicate block
		if(size < 0){
		    return false; // returns a false boolean if the list length is less than 0
		}	
		return true; // returns a true boolean otherwise of the previous boolean check
	}
	public static String getListItems(int size){ // essentially a reporter block
		if(checkSize(size)){
		    return Names.get(size);
		}else{
			return null;
		}
	}
	public static void main(String[] args){ // public static void main(String[] args){} is where the code is detected by Java to be executed 
		addList("ethan"); // adds an item to the list at position 0
		addList("david"); // adds an item to the list at position 1
		System.out.println("length = " + Names.size()); // tells the list length
		for(int nametListSize = 0; nametListSize < Names.size(); nametListSize++){
			System.out.println("item " + nametListSize + " of list"); // tells the the # of the item on the list
			System.out.println(getListItems(nametListSize)); // tells the names

		}
    }
}
