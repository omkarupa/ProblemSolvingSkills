package com.ou_solutions.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MazeSolver {
	
	private Map<String, List<String>> maze = new HashMap<>();
	
	public MazeSolver() {
        // Build the maze connections (Adjacency List)
        maze.put("A", Arrays.asList("B", "C"));
        maze.put("B", Arrays.asList("D", "E"));
        maze.put("C", Arrays.asList("F"));
        maze.put("E", Arrays.asList("F"));
        maze.put("F", Arrays.asList("G"));
        maze.put("D", new ArrayList<>()); // dead end
        maze.put("G", new ArrayList<>()); // exit
    }
	
	public List<List<String>> findAllPaths(String startRoom, String exitRoom)
	{
		System.out.println("Starting DFS from " + startRoom + " to reach " + exitRoom);
		List<String> currentPath = new ArrayList<String>();
		
		List<List<String>> finalPath = new ArrayList<List<String>>();
		
		dfs(startRoom,exitRoom,currentPath,finalPath);
		
		return finalPath;
		
	}

	private void dfs(String currentRoom, String exitRoom, List<String> path, List<List<String>> finalPath) {
		
		 
		
		path.add(currentRoom);
		
		//System.out.println("Entered room: " + currentRoom + " | Current path: " + path);
		
		if(currentRoom.equals(exitRoom)) {
			finalPath.add(path);
			System.out.println("Path found" + path);
		}
		
		List<String> connectedRooms = maze.getOrDefault(currentRoom, new ArrayList<String>());
		
		for(String nextRoom : connectedRooms)
		{
			dfs(nextRoom, exitRoom, new ArrayList<String>(path), finalPath);
		}
		
		
	}
	
	 public static void main(String[] args) {
		 MazeSolver mazeSolver = new MazeSolver();
	       List<List<String>> path =  mazeSolver.findAllPaths("A", "G");
	       
	       path.forEach(System.out::println);
	    }

}
