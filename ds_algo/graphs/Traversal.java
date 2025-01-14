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
        System.out.println(src+ " ");
        List<String> neighbours = adjList.get(src);
        for(String neighbour: neighbours){
            dfsRec(adjList, neighbour);
        }
    }
    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {
        Stack<String> stack = new Stack<>();
        stack.push(src);
        while(stack.size()!=0){
            String node = stack.pop();
            if(node.equals(dst)){
                return true;
            }
            for(String neighbour: graph.get(node)){
                stack.push(neighbour);
            }
        }
        return false;
    }
}
