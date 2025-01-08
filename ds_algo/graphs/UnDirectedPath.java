package ds_algo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnDirectedPath {

    public static boolean hasPath(List<List<String>> edges, String src, String dst){
        Map<String, List<String>> graph = createGraph(edges);
        return false;
    }

    private static Map<String, List<String>> createGraph(List<List<String>> edges) {
        Map<String,List<String>> graph = new HashMap<>();
        for(List<String> pair: edges){
            String a = pair.get(0);
            String b = pair.get(1);
            if(!graph.containsKey(a)){
                graph.put(a,new ArrayList<>());
            }
            if(!graph.containsKey(b)){
                graph.put(b, new ArrayList<>());
            }
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return graph;
    }

    public static void main(String[] args) {

    }
}
