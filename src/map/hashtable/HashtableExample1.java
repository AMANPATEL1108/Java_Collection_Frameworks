package map.hashtable;

import java.util.Hashtable;

public class HashtableExample1 {
    public static void main(String[] args) {
        //synchronized-thread safe0
        //not value or key null
        //slower then hashmap

        //only linked-list in collision
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"As");
        hashtable.put(2,"sds");
        hashtable.put(3,"dfdf");
        System.out.println(hashtable);


    }
}
