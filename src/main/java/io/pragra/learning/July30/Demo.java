package io.pragra.learning.July30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> cred = new HashMap<>();
        cred.put(null, "nav");
        cred.put("Pranshi@gmail.com", "Pranshi");
        cred.put("Rohit@gmail.com", "null");
        cred.put("Ruhi@gmail.com", "Ruhi");
        cred.put(null, null);

        System.out.println(cred);

        System.out.println(cred.get("Pranshi@gmail.com"));

        Set<String> keySet = cred.keySet();
        System.out.println(keySet);

        Set<Map.Entry<String, String>> entries = cred.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
