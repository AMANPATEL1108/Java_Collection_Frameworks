package queue.OverView;

import java.util.LinkedList;
import java.util.Queue;

//add last
//remove first
//peek first

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(50);
        list.add(15);
        System.out.println(list.peek());

        System.out.println(list);
    }
}
