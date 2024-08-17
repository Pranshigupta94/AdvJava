package io.pragra.learning.Aug6;

import java.util.function.Consumer;

public class MortgageCal {

    public void mortgageRenewal(Integer year, Double rateOfInterest, ICalculate calc, Consumer<Integer> consumer,  Consumer<Integer> consumer1){

        consumer.accept(year);
        consumer1.accept(year);

        Double result = calc.calculate(year, rateOfInterest);

        System.out.println("Renewal quote : " +result);

    }
}
// refer to the method without invoking it, make our code cleaner and readable. it is used in the place of lambda expression
