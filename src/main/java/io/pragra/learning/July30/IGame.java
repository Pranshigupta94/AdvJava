package io.pragra.learning.July30;

@FunctionalInterface
// which has only one abstract method.
public interface IGame {

    int a=10;

    void play();


    static void playing(){
        System.out.println("Playing from static method");
    }

    default void display(){

        System.out.println("Playing from display");
    }

    default void work(){

        System.out.println("Playing from work");
    }

}
