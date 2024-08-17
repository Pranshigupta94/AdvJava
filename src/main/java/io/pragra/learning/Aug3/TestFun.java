package io.pragra.learning.Aug3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFun {
    public static void main(String[] args) {


        Function<String, String> functionEnhancer = name -> name + name;
        String functionEnhancedName = functionEnhancer.apply("Pranshi");


        System.out.println("Function Enhanced Name: " + functionEnhancedName);


//
//        BiFunction<String, String, String> enhancer = (name, name2) -> name + name;
//
//
//        String enhancedName = enhancer.apply("Pranshi", null);
//
//
//        System.out.println("Original Name: " + originalName);
//        System.out.println("Enhanced Name: " + enhancedName);

    }
}
