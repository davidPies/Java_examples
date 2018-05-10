package Java_examples;

import java.util.*;

public class Lists {
	
	public static List<String> Planets = new ArrayList<String>(); // the list
	
	public static void addList(String s){ // essentially a command block
		Planets.add(s);
	}
	public static String getListItems(int size){ // essentially a reporter block
		return Planets.get(size);
	}
	public static void main(String[] args){
		addList("ethan");
		addList("david");
		System.out.println("length = "Planets.size()); // tells the list length
		for(int planetListSize = 0; planetListSize < Planets.size(); planetListSize++){
			System.out.println(planetListSize); // tells the the # of the item on the list (length is # of items minus 1)
			System.out.println(getListItems(planetListSize)); // tells the names
		}
	}
}
