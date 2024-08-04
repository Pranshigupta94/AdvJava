package io.pragra.learning.Aug3.EvenChecker;

public class Main {
    public static void main(String[] args) {
        mathCheck(57, x -> x%2 ==0);
        mathCheck(34, x -> x%2 ==0);


    }
    public static void mathCheck(int number, IEvenChecker evenChecker) {
        if (evenChecker.isEven(number)) {
            System.out.println( number + " is even " );
        } else {
            System.out.println( number +" is odd " );
        }
}}
