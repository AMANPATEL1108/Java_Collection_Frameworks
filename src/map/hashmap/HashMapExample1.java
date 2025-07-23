package map.hashmap;

import java.util.*;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Aman");
        map.put(2,"dev");
        map.put(3,"pov");

        System.out.println(map);



        String name=map.get(3);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("dev"));
        System.out.println(name);


        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer,String>> entries=map.entrySet();

        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey() +"-"+entry.setValue(entry.getValue().toUpperCase()));
        }

        System.out.println(map);
    }
}
