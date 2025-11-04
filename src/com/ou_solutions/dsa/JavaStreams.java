package com.ou_solutions.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
	
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5, 6};
		
		List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		
		List<String> names = Arrays.asList("java", "stream", "api");
		
		names.stream().map(String :: toUpperCase).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n * n).forEach(System.out::println);
		
		
		List<String> namesList = Arrays.asList("Omkar", "Amit", "Ravi", "Arun", "Akash");
		
		namesList.stream().filter(n-> n.startsWith("A")).sorted().forEach(System.out::println);
		
		List<Integer> num1s = Arrays.asList(2, 4, 6, 8);
		
		int sum = num1s.stream().reduce(0, Integer::sum);
		
		System.out.println(sum);
		
		List<Integer> num2s = Arrays.asList(2, 3, 4);
		
		int product = num2s.stream().reduce(1,(a,b) -> a * b);
		
		System.out.println(product);
		
		
		
		
	}

}
