package map.enummap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

enum  Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumMapExample {

    //Sorted,no hashing,original index use,faster then hashmap
    public static void main(String[] args) {
        Map<Day,String> map=new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        map.put(Day.SUNDAY,"Fafda");
        map.put(Day.MONDAY,"Office");

        System.out.println(map);
    }
}
