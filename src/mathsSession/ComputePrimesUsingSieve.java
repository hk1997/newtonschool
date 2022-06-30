package mathsSession;

import java.util.Arrays;

public class ComputePrimesUsingSieve {

    public boolean[] computePrimesSieve(int n){
        boolean[] primes = new boolean[n+1];

        // initially setting all the numbers to be prime in the array
        Arrays.fill(primes, true);

        // 0 and 1 are not prime number
        primes[0] = primes[1] = false;

        for(int i=2; i<= (int)Math.sqrt(n) ; i++){

            if(primes[i]){
                // put all multiples of this number to be false
                for(int j=2; i*j <=n ; j++){
                    primes[i*j] = false;
                }
            }
        }
        return primes;
        // Time Complexity: O(nloglogn)
        // Computation: https://www.geeksforgeeks.org/how-is-the-time-complexity-of-sieve-of-eratosthenes-is-nloglogn/
    }


    public static void main(String[] args) {
        ComputePrimesUsingSieve ob = new ComputePrimesUsingSieve();

        boolean[] arr = ob.computePrimesSieve(30);


        // print prime numbers that are returned.
        for (int i=2; i<arr.length;i++){
            if(arr[i])
                System.out.println(i+" is prime:"+arr[i]);
        }
    }


}
