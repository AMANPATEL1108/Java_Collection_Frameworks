package map.concurrenthashmap;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample1 {
    public static void main(String[] args) {
//        java-7
//        segment based locking mini-parts - 16 segments-smaller hashmaps
//        only read and write only lock not all
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
        map.put("aman",1);
        map.put("dev",3);
        map.put("pt",5);
        map.put("sd",6);

//        java-8
//        resizing or collision no locking expect

    }
}
