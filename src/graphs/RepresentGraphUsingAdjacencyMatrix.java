package graphs;


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

public class RepresentGraphUsingAdjacencyMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n is the number of nodes
        int n = sc.nextInt();
        int[][] adj = new int[n][n];
        // default the array is initialized with 0
        // initalizing all elements to -1 except diagonal elements
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(i==j)
                    adj[i][j] = 0;
                else
                    adj[i][j] = -1;
            }
        }
        System.out.println("Matrix after initialization");
        printMatrix(adj, n);
        int m = sc.nextInt();

        for(int i=0; i<m;i++){
            int source = sc.nextInt();
            int dest = sc.nextInt();
            adj[source][dest] = 1;
        }

        System.out.println("Matrix after edges");
        printMatrix(adj, n);

    }

    static void printMatrix(int[][] adj, int n){
        for(int i=0; i< n; i++){
            for(int j=0; j<n;j++)
                System.out.print(adj[i][j]+" ");
            System.out.println();
        }

    }
}
