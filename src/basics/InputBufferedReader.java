package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferedReader {
    /**
     * 1
     * 2
     * 3
     * 4
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.valueOf(s);
        s = br.readLine();
        double d = Double.valueOf(s);
    }
}
