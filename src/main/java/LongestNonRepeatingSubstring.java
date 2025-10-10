package main.java;

import java.util.HashMap;

//Given a string, find the length of the longest substring without repeating chars.
public class LongestNonRepeatingSubstring {

	public static void main(String[] args) {
		 System.out.println(lengthOfLongestSubstring("abcabcdbb")); // 3
		 System.out.println(longestSubstring("abcabcdbb")); 

	}

	private static  int lengthOfLongestSubstring(String s) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int max = 0;
		for(int left = 0,right = 0;right < s.length() -1;right++ )
		{
			char c = s.charAt(right);
			if(map.containsKey(c))
			{
				left = Math.max(map.get(c) + 1,left);
			}
			
			map.put(c, right);
			max = Math.max(max, right - left +1);
		}
		return max;
	}
	
	private static String longestSubstring(String s) {
	    if (s == null || s.isEmpty()) return "";

	    HashMap<Character, Integer> map = new HashMap<>();
	    int maxLen = 0;
	    int start = 0;      // start index of current window
	    int maxStart = 0;   // start index of longest substring

	    for (int left = 0, right = 0; right < s.length(); right++) {
	        char c = s.charAt(right);

	        if (map.containsKey(c)) {
	            // move left pointer to avoid duplicates
	            left = Math.max(map.get(c) + 1, left);
	        }

	        // store or update character position
	        map.put(c, right);

	        // check for new max length
	        if (right - left + 1 > maxLen) {
	            maxLen = right - left + 1;
	            maxStart = left;  // store new start index
	        }
	    }

	    // extract the substring using maxStart and maxLen
	    return s.substring(maxStart, maxStart + maxLen);
	}

}
