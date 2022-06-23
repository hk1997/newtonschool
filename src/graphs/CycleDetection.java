package graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class CycleDetection {

    boolean isCycle(HashMap<Integer, LinkedList<Integer>> graph, int n){
        /**
         * 0-> un-visited node
         * 1 -> dfs for node is in progress
         * 2 -> dfs for node has ended
         */
        int[] visited = new int[n];

        boolean isCycle = false;

        for(int i=0; i<n;i++){
            isCycle = isCycle || dfsUtil(graph, visited, i);
        }
        return isCycle;
    }

    boolean dfsUtil(HashMap<Integer, LinkedList<Integer>> graph, int[] visited, int source){

        // dfs for this has completed, hence we will ignore and no cycle
        if(visited[source] == 2)
            return false;
        // dfs for this node is in progress, hence edge exist between 2 nodes in progress state
        else if(visited[source] == 1){
            return true;
        }
        // node is unvisited, let's apply dfs
        else{
            // mark current node in progress state
            visited[source] = 1;
            boolean isCycle = false;
            for(int v: graph.get(source)){
                isCycle = isCycle || dfsUtil(graph, visited, source);
            }

            // mark the node to be in visited state
            visited[source] = 2;
            return isCycle;
        }
    }


}
