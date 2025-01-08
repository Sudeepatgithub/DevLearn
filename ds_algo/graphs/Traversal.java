package ds_algo.graphs;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of(
                "f", List.of("g", "i"),
                "g", List.of("h"),
                "h", List.of(),
                "i", List.of("g", "k"),
                "j", List.of("i"),
                "k", List.of()
        );
        dfsIterative(graph,"f");
        System.out.println();
        dfsRec(graph, "f");
        System.out.println();
        bfsIterative(graph, "f");
    }

    public static void dfsIterative(Map<String, List<String>> adjList, String root){
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            String node = stack.pop();
            System.out.print(node+" ");
            for(String neighbour: adjList.get(node)) {
                stack.push(neighbour);
            }
        }
    }

    public static void bfsIterative(Map<String, List<String>> adjList, String root){
        Queue<String> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            String node = queue.remove();
            System.out.print(node+" ");
            for(String neighbour: adjList.get(node)) {
                queue.add(neighbour);
            }
        }
    }

    public static void dfsRec(Map<String, List<String>> adjList, String src){
        System.out.print(src+ " ");
        List<String> neighbours = adjList.get(src);
        for(String neighbour: neighbours){
            dfsRec(adjList, neighbour);
        }
    }
}
