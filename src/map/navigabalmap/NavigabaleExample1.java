package map.navigabalmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigabaleExample1 {
    public static void main(String[] args) {

        NavigableMap<Integer,String> navigableMap=new TreeMap<>();

        navigableMap.put(1,"One");
        navigableMap.put(10,"Ten");
        navigableMap.put(20,"Twenty");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(11));
    }
}
