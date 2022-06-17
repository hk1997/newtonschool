package graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FindShortestDistance {

    int[] getDistances(HashMap<Integer, LinkedList<Integer>> graph, int source, int n) {
        Queue<Integer> q = new LinkedList<>(); // step 1
        boolean[] visited = new boolean[n]; // step 2
        int[] dist = new int[n];

        // intitialization, initialize with maximum value so that all nodes are unreachable
        Arrays.fill(dist, Integer.MAX_VALUE);


        q.offer(source); // step 3
        visited[source] = true; // step 3
        // initialize for source
        dist[source] = 0;

        while (!q.isEmpty()) { // step 4
            int v = q.poll(); // step 4 // 2

            LinkedList<Integer> neighbors = graph.get(v); // step 5 // 0 and 1

            // for loop to go through each of the neighbour
            for (int neighbour : neighbors) {
                if (!visited[neighbour]) { //
                    q.offer(neighbour); // step 5
                    visited[neighbour] = true; // step 5
                    dist[neighbour] = dist[v]+1;
                }
            }
        }

        return dist;
    }
}
