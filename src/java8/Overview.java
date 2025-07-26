package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Overview {
    public static void main(String[] args) {
        //minimal code,stream,Date-Time functional programming,lambda expression

        //lamdaexample
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });

        //predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        //function
        Function<Integer,Integer> doubleIt=x->2*x;
        System.out.println(doubleIt.apply(100));

    }
}
