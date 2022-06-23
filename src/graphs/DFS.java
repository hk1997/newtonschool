package graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class DFS {

    /**
     *
     * @param graph: Adjacency list representation of the graph
     * @param n: number of nodes
     */
    void dfs(HashMap<Integer, LinkedList<Integer>> graph, int n, int source){
        // this function initializes the dfs parameters, and calls the first dfs call.
        boolean[] visited = new boolean[n];
        dfsUtil(graph, visited ,source);
    }

    void dfsUtil(HashMap<Integer, LinkedList<Integer>> graph, boolean[] visited , int source){
        if(visited[source]== true)
            return;

        System.out.println(source);
        visited[source] = true;

        // recursively call all the non visited nodes
        for(Integer v: graph.get(source)){
            dfsUtil(graph, visited, v);
        }
    }

}
