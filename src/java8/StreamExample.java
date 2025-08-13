package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(num.stream().filter(x -> x % 2 == 0).count());

        //creating stream
        //-collections
        //-arrays
        //-stream-of
        //infinite streams
        //

        List<String > str=Arrays.asList("aman","dev","asd","Dsa");

        Stream<String> filterstream=str.stream().filter(s->s.startsWith("a"));
        long a=str.stream().filter(x->x.startsWith("a")).count();
        System.out.println(a );
    }
}
