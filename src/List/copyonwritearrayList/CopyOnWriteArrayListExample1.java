package List.copyonwritearrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();

//                    called a Arraylist then during loop not add showing exception btu in Copy OnWriter not//
        List<String> shoppinlist=new CopyOnWriteArrayList<>();
        shoppinlist.add("Milk");
        shoppinlist.add("Eggs");
        shoppinlist.add("Bread");
        System.out.println("Inittial list"+shoppinlist);


        for(String item:shoppinlist){
            System.out.println(item);
            if (item.equals("Eggs")){
                shoppinlist.add("Butter");
                System.out.println("Added Buttrt  while reading");
            }
        }

        System.out.println("Updated "+shoppinlist);
    }
}
