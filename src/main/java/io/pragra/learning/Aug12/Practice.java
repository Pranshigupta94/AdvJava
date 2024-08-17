package io.pragra.learning.Aug12;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Map: Square the numbers
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Distinct: Remove duplicates
        List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5).stream()
                .distinct()
                .collect(Collectors.toList());

        // Count: Count the total numbers in the list
        long count = numbers.stream().count();

        // Min: Find the minimum value
        OptionalInt min = numbers.stream().mapToInt(n -> n).min();

        // Max: Find the maximum value
        OptionalInt max = numbers.stream().mapToInt(n -> n).max();

        // Reduce: Sum of all numbers
        int sum = numbers.stream().reduce(0, Integer::sum);

        // MapToInt: Find the sum of squares
        int sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();

        // FindFirst: Find the first number greater than 5
        OptionalInt firstGreaterThanFive = numbers.stream()
                .mapToInt(n -> n)
                .filter(n -> n > 5)
                .findFirst();

        // AnyMatch: Check if any number is greater than 8
        boolean anyGreaterThanEight = numbers.stream().anyMatch(n -> n > 8);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Squared Numbers: " + squaredNumbers);
        System.out.println("Distinct Numbers: " + distinctNumbers);
        System.out.println("Count: " + count);
        System.out.println("Min: " + (min.isPresent() ? min.getAsInt() : "N/A"));
        System.out.println("Max: " + (max.isPresent() ? max.getAsInt() : "N/A"));
        System.out.println("Sum: " + sum);
        System.out.println("Sum of Squares: " + sumOfSquares);
        System.out.println("First Number Greater Than 5: " + (firstGreaterThanFive.isPresent() ? firstGreaterThanFive.getAsInt() : "NA"));
        System.out.println("Any Number Greater Than 8: " + anyGreaterThanEight);
    }
}
