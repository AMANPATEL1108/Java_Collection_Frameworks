package map.linkedHashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMapExample1 {
    public static void main(String[] args) {

        //linked hash map order insertion
        //return recent data use or get at last to ordering
        //Not Thread Safe
        //remoev eldest for to clear caching memory
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();

        //not order insertion
        HashMap<String,Integer> hashMap=new HashMap<>();

        hashMap.put("Orage",1);
        hashMap.put("Mango",2);
        hashMap.put("as",3);


        for(Map.Entry<String ,Integer> antry:hashMap.entrySet()){
            System.out.println(antry.getKey()+":"+antry.getValue());
        }

    }
}
