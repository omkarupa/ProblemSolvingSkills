package com.ou_solutions.dsa;

public class SubArrayMaxSum {
	
	
	public static void main(String[] args) {
		int[] nums = {1,-2,5};
		
		System.out.println(maxSumSubArray(nums));
	}
	
	public static int maxSumSubArray(int [] nums)
	{
		int maxSum = 0;
		int curSum = 0;
		
		for(int i = 0;i<nums.length;i++)
		{
			curSum = curSum + nums[i];
			
			if(curSum > maxSum)
			{
				maxSum = curSum;
			}
			
			if(curSum < 0)
			{
				curSum = 0;
			}
			
		}
		
		return maxSum;
	}

}
