package com.ou_solutions.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {
	
	static Map<String, List<String>> graph = new HashMap<>();
	
	private static Set<String> visited = new HashSet<>();
	
	public static void addEdge(String fromNode, String toNode) {
	    graph.computeIfAbsent(fromNode, k -> new ArrayList<>()).add(toNode);
	    graph.computeIfAbsent(toNode, k -> new ArrayList<>()).add(fromNode); // undirected
	}
	
	
	//DFS we use stack or recursion
	public static void dfs(String currentNode)
	{
		if(visited.contains(currentNode))
		{
			//System.out.println("Already visited " + currentNode + ", skipping...");
	        return;
		}
		
		visited.add(currentNode);
		System.out.println("Visiting node: " + currentNode);
		
		List<String> connectedNodes = graph.get(currentNode);
		
		if (connectedNodes == null) {
	      //  System.out.println("No connections found for " + currentNode);
	        return;
	    }
		
		for (String nextNode : connectedNodes) {
	     //   System.out.println(" → From " + currentNode + " go to " + nextNode);
	        dfs(nextNode);  // Recursively visit the next node
	    }
		
		
		 // System.out.println("Backtracking from " + currentNode);
	}
	
	public static void bfs(String startNode)
	{
		visited.clear();
		Queue<String> queue = new LinkedList<String>();
		
		queue.add(startNode);
		visited.add(startNode);
		
		while(!queue.isEmpty())
		{
			String currentNode = queue.poll();
			System.out.print(currentNode + " "); // visit node
			
			for(String nextNode : graph.get(currentNode))
			{
				if(!visited.contains(nextNode))
				{
					queue.add(nextNode);
					visited.add(nextNode);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		addEdge("A", "B");
        addEdge("A", "C");
        addEdge("A", "D");
        addEdge("B", "E");
        addEdge("B", "F");
        
        dfs("A");
        
        bfs("A");
	}
	
	
	//BFS we use queue

}
