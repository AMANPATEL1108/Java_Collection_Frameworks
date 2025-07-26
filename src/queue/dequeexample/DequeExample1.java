package queue.dequeexample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeExample1 {
    public static void main(String[] args) {
    //double ended queue
        //insertion delete both side
        //queue and stack functionality

        Deque<Integer> q=new ArrayDeque<>(); //faster iteration
        //no-need to element on insertion deletion just  head-tail shift
        q.add(10);
        q.add(30);
        q.add(20);
        System.out.println(q);
        System.out.println(q.getFirst());
        System.out.println(q.getLast());

        Deque<Integer> q2=new LinkedList<>(); // deletion in middle then
        q2.add(150);
        q2.add(200);
        q2.add(175);
        System.out.println(q2);

    }
}
