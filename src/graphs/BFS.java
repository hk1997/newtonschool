package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    /**
     * 0-> 1,5
     * 1 -> 0,4,2
     * 2 -> 1,4,3
     * 3 -> 4,2
     * 4 -> 5,1,2,3
     * 5 -> 0, 4
     */
    void bfs(HashMap<Integer, LinkedList<Integer>> graph, int source, int n){
        Queue<Integer> q = new LinkedList<>(); // step 1
        boolean[] visited = new boolean[n]; // step 2


        q.offer(source); // step 3
        visited[source] = true; // step 3

        while(!q.isEmpty()){ // step 4
            int v = q.poll(); // step 4

            System.out.println("Element explored in bfs "+ v);


            LinkedList<Integer> neighbors = graph.get(v); // step 5

            // for loop to go through each of the neighbour
            for(int neighbour: neighbors){
                if(!visited[neighbour]){ //
                    q.offer(neighbour); // step 5
                    visited[neighbour] = true; // step 5
                }
            }
        }
    }

}
