package main.java;

public class PallindromeString {
	
	public static void main(String[] args) {
		String str = "omo";
		
		System.out.println(isPallindrome(str));
		
	}

	private static boolean isPallindrome(String str) {
		
		int len = str.length();
		int l = 0;
		int r = str.length()-1;
		
		if (len < 2) return true;
		
		while(l < r  )
		{
			if(str.charAt(l) != str.charAt(r))
			{
				return false;
			}
			
			l++;
			r--;
		}
		
		
		
		return true;
	}

}
