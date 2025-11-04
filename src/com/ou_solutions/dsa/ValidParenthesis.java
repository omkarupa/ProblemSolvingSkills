package com.ou_solutions.dsa;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String parenthesis = "{{[]}}";
		
		
		System.out.println(isValidParenthesis("{ }{{}}"));
		
	}

	
	public static boolean isValidParenthesis(String s)
	{
		
		Stack<Character> stack =  new Stack<Character>();
		
		
		
		for(char ch : s.toCharArray())
		{
			if(ch ==  ' ') continue;
			if(ch == '{' || ch == '[' || ch == '(')
			{
				stack.push(ch);
			}
			else if (ch == '}' || ch == ']' || ch == ')')
			{
				if (stack.isEmpty()) return false;
				stack.pop();
			}
		}
		
		
		return stack.isEmpty();
	}
}
