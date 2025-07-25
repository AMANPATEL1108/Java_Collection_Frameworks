package map.concurrentskiplistmapdemo;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample1 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> concurrentSkipListMap=new ConcurrentSkipListMap();

        concurrentSkipListMap.put("aman",1);
        concurrentSkipListMap.put("dev",2);
        concurrentSkipListMap.put("as",3);
    }
}
