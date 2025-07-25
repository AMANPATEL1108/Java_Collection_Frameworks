package set.copyonWritearrayset;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample1<I extends Number> {
    public static void main(String[] args) {

        //Thread Safe

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet= new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListMap= new ConcurrentSkipListSet<>();

        for(int i=0;i<=5;i++){
            copyOnWriteArraySet.add(i);
            concurrentSkipListMap.add(i);
        }

        System.out.println("INitia "+copyOnWriteArraySet);
        System.out.println("Initial"+concurrentSkipListMap);


    }
}
