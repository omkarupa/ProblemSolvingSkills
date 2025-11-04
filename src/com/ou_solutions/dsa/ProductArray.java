package com.ou_solutions.dsa;

public class ProductArray {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		
		
		int arr[] = new int [nums.length];
		
		int product = 1;
		for(int a : nums)
		{
			product = product * a;
			
		}
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = product / nums[i];
		}
		
		System.out.println(product);
		
		for(int a : arr)
		{
			System.out.println(a);
			
		}
	}
}
