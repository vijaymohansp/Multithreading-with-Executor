package com.pc;

import java.util.concurrent.BlockingQueue;

public class ConsumerOne implements Runnable {

    BlockingQueue<Product> queue;

    public ConsumerOne(BlockingQueue<Product> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Queue Size :"+queue.size());
                Product value1=queue.take();
                Product value2=queue.take();
                System.out.println("Consumed value X:"+(value1.getX()+value2.getX()));
                System.out.println("Consumed value Y:"+(value1.getY()+value2.getY()));
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
