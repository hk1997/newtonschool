package graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class TopologicalSort {

    LinkedList<Integer> topologicalSort(HashMap<Integer, LinkedList<Integer>> graph, int n){
        // this function initializes the dfs parameters, and calls the first dfs call.
        boolean[] visited = new boolean[n];
        LinkedList<Integer> order = new LinkedList<>();

        // apply dfs to all nodes of the graph
        for(int key: graph.keySet()){
            dfsUtil(graph, visited, order, key);
        }

        return  order;

    }

    void dfsUtil(HashMap<Integer, LinkedList<Integer>> graph,boolean[] visited, LinkedList<Integer> order, int source){
        if(visited[source]==true)
            return;

        visited[source] = true;

        // make recursive calls to adjacent nodes
        for(int v: graph.get(source)){
            dfsUtil(graph, visited,order, v );
        }

        // store the result after recursive call ends
        // store the result in a addFirst manner
        order.addFirst(source);
    }

}
