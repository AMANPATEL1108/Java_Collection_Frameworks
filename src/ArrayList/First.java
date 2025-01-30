package ArrayList;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(100);
        list.add(1);
        list.add(5);
        list.add(80);
        System.out.println(list.size());
        

//        for(int i=0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//            for (int i:list){
//                System.out.println(i);
//            }

//        System.out.println(list.contains(5));
//        System.out.println(list.contains(50));

        list.remove(1);

//        for (int i:list){
//                System.out.println(i);
//            }
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));


//        list.add(1,255);
//        list.set(0,100);
//            for (int i:list){
//                System.out.println(i);
//            }
    }
}
