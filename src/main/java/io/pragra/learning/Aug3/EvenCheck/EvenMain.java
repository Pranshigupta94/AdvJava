package io.pragra.learning.Aug3.EvenCheck;

public class EvenMain {
    public static void main(String[] args) {


        IFunc funlambda = x-> {
            if (x%2 ==0)
            {
                return true;

            }else {
                return false;
            }
        };
        System.out.println(funlambda.even(57));
    }
}
//....design patterns imp
//creational
//behavioral
//abstract factory
//builder - creational design pattern
//facade
//selectional
//structural //singleton and more



//refactoring guru
//builder - inner static class