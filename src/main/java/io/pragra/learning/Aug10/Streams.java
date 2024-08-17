package io.pragra.learning.Aug10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,66,55,44,66,88,99,77));
        List<Integer> streamCheck = numbers.stream().filter(x->x%2==0).filter(x->x%11==0).distinct().collect(Collectors.toList());

        System.out.println(streamCheck);
    }
}
