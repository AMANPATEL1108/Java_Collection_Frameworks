package ArrayListCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        System.out.println(list.get(2));
//        System.out.println(list.size());

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

//        for(int x:list){
//            System.out.println(x);
//        }

//        System.out.println( list.contains(5));
//        System.out.println( list.contains(1));
//        list.remove(2);
//        for(int y:list){
//            System.out.println(y);
//        }



//        list.add(2,50);

        list.set(2,150);

        System.out.println(list);

    }
}
