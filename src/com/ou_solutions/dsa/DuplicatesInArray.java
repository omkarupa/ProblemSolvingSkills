package com.ou_solutions.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		
		int arr [] = {1,3,4,5,6,4,3};
		
		arr = duplicates(arr).stream().mapToInt(i -> i).toArray();
		
		Arrays.toString(arr);
		
		
		
	}
	
	public static List<Integer> duplicates(int arr [])
	{
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> duplicates = new ArrayList<Integer>();
		
		for(int num : arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > 1)
			{
				duplicates.add(entry.getKey());
			}
		}
		
		return duplicates;
		
	}

}
