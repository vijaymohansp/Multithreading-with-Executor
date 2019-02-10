package com.pc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorServiceDemo {
    public static void main(String[] args) {

        BlockingQueue<Product> queue=new LinkedBlockingQueue<>(4);
        ExecutorService executorService= Executors.newFixedThreadPool(3);

         ProducerOne producerOne= new ProducerOne(queue);
         ProducerTwo producerTwo= new ProducerTwo(queue);
         ConsumerOne consumerOne= new ConsumerOne(queue);

        // new Thread(producerOne).start();
        // new Thread(producerTwo).start();
        // new Thread(consumerOne).start();
        executorService.execute(producerOne);
        executorService.execute(producerTwo);
        executorService.execute(consumerOne);

    }
}
