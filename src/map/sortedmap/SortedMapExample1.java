package map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample1 {
    public static void main(String[] args) {
        SortedMap<Integer,String> sortedMap=new TreeMap<>();

        sortedMap.put(91,"Vivek");
        sortedMap.put(45,"aman");
        sortedMap.put(65,"dev");

        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(66));//range
        System.out.println(sortedMap.subMap(60,80));
    }
}
