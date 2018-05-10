package Java_examples;

import java.util.*;

public class Lists {
	
	public static List<String> Planets = new ArrayList<String>();
	public Lists(){
	}
	public static addList(String s){
		Planets.add(s);
	}
	public static void main(String[] args){
		addList("name_1");
		for(int planetListSize = 0; planetListSize < Planets.size(); planetListSize++)
			System.out.println(planetListSize);
	}
}
