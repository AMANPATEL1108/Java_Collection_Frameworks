package queue.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;

public class BlockingQueueExample {
    public static void main(String[] args) {
        //thread safe queue
        //wait for dequeue to become non empty /wait for space
        //simplify concurrency problems like producer-consumer
        //standard queue->immediately
        //empty ->remove
        //full--> add -not waiting


        //fix size capacity after declaration
        BlockingQueue<Integer> b=new ArrayBlockingQueue<>(10);
        BlockingQueue<Integer> c=new LinkedBlockingQueue<>(10);

        b.add(10);
        b.add(50);
        b.add(100);
        b.add(30);
        b.add(20);

        Thread producer=new Thread(new Producer(b));
//        Thread consumer=new Thread(new Consumer(b));
        producer.start();
//        consumer.start();

    }
}

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value;

    public Producer(BlockingQueue<Integer> qu){
        this.queue=qu;
    }

//    @Override
//    public void run(){
//        while (true){
//            System.out.println("Produced "+value);
//            try {
//                queue.put(value);
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println("Exception"+e);
//            }
//        }
//    }
    @Override
    public void run(){
        while (true){
            System.out.println("consumer "+value);
            try {
                queue.put(value);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception"+e);
            }
        }
    }
}
