package 

import java.util.*;

public class Lists {
	
	public List<String> Planets = new ArrayList<String>();
	public Lists(){
		
	}
	public static void main(String[] args){
		for(int planetListSize = 0; planetListSize < Planets.size(); planetListSize++)
			System.out.println(planetListSize);
	}
}
