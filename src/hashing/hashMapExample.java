package hashing;

import java.io.CharConversionException;
import java.util.HashMap;

public class hashMapExample {

    public static void main(String[] args) {
        // <key, value>
        HashMap<String, Integer> hm = new HashMap<>();

        // suppose you want to put: <Hardik, 90>
        hm.put("hardik", 90);
        hm.put("kartik", 33);
        System.out.println(hm);
        // I want to get the value of "hardik"
        System.out.println(hm.get("hardik"));
        // override values
        hm.put("hardik", 99);
        System.out.println(hm.get("hardik"));
        System.out.println(hm.containsKey("blah blah"));


        HashMap<Character, Integer> hm2= new HashMap<>();
        hm2.put('c', 12);
        hm2.put('d', 1231231);
        System.out.println(hm2);
    }
}
