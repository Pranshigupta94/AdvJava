package io.pragra.learning.Aug3.EvenChecker;

import java.util.function.Predicate;

public class Pred {
    public static void main(String[] args) {
        mathCheck(57, x -> x%2 ==0);
        mathCheck(34, x -> x%2 ==0);


    }
    public static void mathCheck(int number, Predicate<Integer> evenChecker) {
        if (evenChecker.test(number)) {
            System.out.println( number + " is even " );
        } else {
            System.out.println( number +" is odd " );
        }
    }
}
