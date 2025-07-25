package set.setoverview;

import java.util.HashSet;
import java.util.Set;

public class OverViewExample1 {
    public static void main(String[] args) {
        //set can nor store duplicates
        //faster oprations
        //set-hashset,linkedhashset,treeset,enumset

        //undorders

        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(250);
        set.add(12);
        System.out.println(set);
    }
}
