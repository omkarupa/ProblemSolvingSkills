package main.java;

import java.util.LinkedHashMap;

public class NonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str = "o";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for(char c : str.toCharArray())
		{
			if(map.get(c) == 1)
			{
				System.out.println(c + " first non repeating character");
				return;
			}
		}
		
		 
		
	}

}
