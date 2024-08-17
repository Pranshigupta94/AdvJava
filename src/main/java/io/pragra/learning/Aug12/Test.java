package io.pragra.learning.Aug12;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        Optional<String> name = getName(1);
//        if(name.isPresent()) {
//            System.out.println(name.get());
//        }

        //name.ifPresent(x-> System.out.println(x));
      //  name.ifPresent(System.out::println);

       // String nameNotPresent = name.orElse("NA"); //if name is present then give name or else give NA

      //  String nameNotPresent = name.orElseGet(()->"NA");

      //  String nameNotPresent = name.orElseThrow(()-> new NoSuchElementException());

        String nameNotPresent = name.orElseThrow(NoSuchElementException::new);

        System.out.println(nameNotPresent);




    }
    private static Optional<String> getName(int id){
        //get from db
        //String name = "Pranshi";
        //return Optional.of(name); // if value is null then it return null pointer exception
       // String name = null;
       // return Optional.ofNullable(name); // if value is null then it return empty optional instance(nothing)
        return Optional.empty();
    }
}
