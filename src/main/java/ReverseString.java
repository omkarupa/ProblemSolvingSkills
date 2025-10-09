package main.java;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "java is cool";
		StringBuilder rev = new StringBuilder();
		String [] strArray = str.split(" ");
		for(int i = strArray.length - 1;i>=0;i--)
		{
			rev.append(strArray[i]);
			rev.append(" ");
		}
		
		System.out.println(rev.toString());
		
	}

}
