package main.java;

import java.util.Arrays;

public class ArraySumTarget {

	public static void main(String[] args) {
		int arr [] = {2,3,9,5,6,7};
		int target = 6;
		
		for(int i : sumTarget(arr, target)) {
			System.out.println(i);
		}

	}
	
	public static int [] sumTarget(int arr[],int target)
	{
		Arrays.sort(arr);
		int index = 0;
		int diff = target - arr[index];
				
		for(int i = index+1;i<arr.length;i++)
		{
			if(diff < arr[i])
			{
				throw new RuntimeException("Target Value not found");
			}
			if(diff == arr[i] && index != i)
			{
				return new int[] {index,i};
			}
		}
		
		return null;
	}
}
