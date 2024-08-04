package io.pragra.learning.Aug3.NameChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NameChecker {

    public void namecheck(String name, Predicate<String> checker) {
        if (checker.test(name)) {
            System.out.println(name + " is approved");
        } else {
            System.out.println(name + " is invalid");
        }
    }

    public static void main(String[] args) {
        NameChecker checker = new NameChecker();


        List<String> names = new ArrayList<>(Arrays.asList("Ankush", "Bavneet", "Divyesh","Nav", "Pranshi"));


       // Predicate<String> isLengthAtLeast4 = name -> name.length() >= 4;


        for (String name : names) {
          //  checker.namecheck(name, isLengthAtLeast4);
            checker.namecheck(name, n -> n.length() >= 4);

        }
    }
}

