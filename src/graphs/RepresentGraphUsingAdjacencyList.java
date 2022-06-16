package graphs;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Question:
 * Consider a unweighted directed graph of n nodes [0,1,2......n-1]
 *
 * Input format:
 * First line of input contains n, number of nodes
 *
 * Next line of input contains m, number of edges
 *
 * Next m lines of input contains 2 integers each:
 * first integer is source second integer is destination node
 *
 * Output:
 * Adjaceny matrix
 *
 * example:
 * 5 // number of nodes
 * 7 // number of edges
 * 1 0 // edge from 1 to 0
 * 1 4
 * 1 2
 * 0 2
 * 3 1
 * 4 1
 * 4 3
 */
public class RepresentGraphUsingAdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of nodes
        HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();

        // initialize the nodes
        for(int i=0; i<n;i++)
            graph.put(i, new LinkedList<Integer>());

        System.out.println("Graph during initialization");
        System.out.println(graph);

        int m = sc.nextInt();
        for(int i=0; i<m;i++){
            int source = sc.nextInt();
            int dest = sc.nextInt();
            graph.get(source).add(dest);
        }
        System.out.println("Graph after taking input");
        System.out.println(graph);

    }
}
