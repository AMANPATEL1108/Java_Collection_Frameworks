package map.identityhash;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        String key1=new String("key");
        String key2=new String("key");
        Map<String,Integer> map=new HashMap<>();
        map.put(key1,1);
        map.put(key2,3);
        System.out.println(map);
    }
}
