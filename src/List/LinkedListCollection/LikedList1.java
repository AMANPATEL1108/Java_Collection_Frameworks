package List.LinkedListCollection;


import java.util.Arrays;
import java.util.LinkedList;

public class LikedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.removeIf(x->x%2==0);


        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalstormemove=new LinkedList<>(Arrays.asList("Bee","Dog"));

        animals.removeAll(animalstormemove);
        System.out.println(animals);

    }
}
