package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FindConnectedComponents {

    /**
     * Returns the list of reachable nodes from the source.
     */
    LinkedList<Integer> findReachableNode(HashMap<Integer, LinkedList<Integer>> graph, int source, int n){
        Queue<Integer> q = new LinkedList<>(); // step 1
        boolean[] visited = new boolean[n]; // step 2


        q.offer(source); // step 3
        visited[source] = true; // step 3

        while(!q.isEmpty()){ // step 4
            int v = q.poll(); // step 4

            LinkedList<Integer> neighbors = graph.get(v); // step 5

            // for loop to go through each of the neighbour
            for(int neighbour: neighbors){
                if(!visited[neighbour]){ //
                    q.offer(neighbour); // step 5
                    visited[neighbour] = true; // step 5
                }
            }
        }

        LinkedList<Integer> reachableNodes = new LinkedList<>();
        for(int i=0; i<n;i++){
            if(visited[i]){
                reachableNodes.add(i);
            }
        }
        return reachableNodes;
    }

}
