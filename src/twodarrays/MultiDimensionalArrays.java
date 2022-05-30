package twodarrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        int n = 5;
        int m = 6;

        int[][] arr = new int[n][m];
        // initialize array elements with value 2
        for(int i=0; i< n ; i++){ // O(n) time
            for(int j=0; j<m ; j ++){ // O(m) time
                arr[i][j] = 2;
            }
        }
        // Time complexity: O(n*m)

    }
}
