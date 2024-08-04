package io.pragra.learning.Aug3.NameChecker;

public class NameProcessor {
    public String enhance(String name, NameEnhancer enhancer) {

        return enhancer.enhancer(name);
    }

    public static void main(String[] args) {
        NameProcessor processor = new NameProcessor();


        NameEnhancer doubleNameEnhancer = name -> name.concat("Pranshi");



        String result = processor.enhance("Pranshi", doubleNameEnhancer);

        System.out.println(result);
    }
}
