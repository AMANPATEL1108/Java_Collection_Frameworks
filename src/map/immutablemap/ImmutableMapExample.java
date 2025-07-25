package map.immutablemap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        Map<String ,Integer> map2=Collections.unmodifiableMap(map);
        System.out.println(map2);
//        map2.put("C",3);-throewss exception
        // only10 key value parirs
        Map<String ,Integer> map3= Map.of("Ap",45,"Dev",33);
        //more then 10 then  use Map.ofEntries
//        map3.put("De",88);
    }
}
