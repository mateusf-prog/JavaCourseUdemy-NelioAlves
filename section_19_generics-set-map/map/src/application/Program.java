package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        
        //   key -- value
        Map<String, String> cookies = new TreeMap<>();
        
        // insert data
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "22554466");

        // delete key and value 
        cookies.remove("email");

        // overwrote the value of the previous "phone" key
        cookies.put("phone", "087945");

        // verify if in the 'cookies' contains the 'phone' key 
        System.out.println("contains 'phone' key: " + cookies.containsKey("phone"));

        // returns the value contained in the 'phone' key
        System.out.println("Phone number: " + cookies.get("phone"));

        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}