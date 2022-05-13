package Recursion;

public class PrintNNumbersRecursively {

    static void printNumbers(int n){
        if(n==0)
            return;
        else{
            System.out.print(n+" ");
            printNumbers(n-1);
        }
    }

    public static void main(String[] args) {
        printNumbers(100);
    }
}
