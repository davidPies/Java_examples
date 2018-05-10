package Java_examples;

import java.util.*;

public class Lists {
	
	public static List<String> Planets = new ArrayList<String>();
	public Lists(){
	}
	public static void addList(String s){ // essentially a command block
		Planets.add(s);
	}
	public static String addList(String s){ // essentially a reporter block
		return s;
	}
	public static void main(String[] args){
		addList("name_1");
		for(int planetListSize = 0; planetListSize < Planets.size(); planetListSize++)
			System.out.println(planetListSize);
	}
}
