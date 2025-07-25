package queue.priority;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(20);
        pq.add(10);
        pq.add(25);

        System.out.println(pq);//not sorted
        while (!pq.isEmpty()){
            //sorted print
            System.out.print(pq.poll());
        }
    }
}
