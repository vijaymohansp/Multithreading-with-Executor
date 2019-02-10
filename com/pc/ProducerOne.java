package com.pc;

import java.util.concurrent.BlockingQueue;

public class ProducerOne implements Runnable {

    BlockingQueue<Product> queue;
    Product product;
    int x=1;
    int y=2;

    public ProducerOne(BlockingQueue<Product>  queue){
        this.queue=queue;
    }
    @Override
    public void run() {

        while(true){
             product=new Product(x,y);
            try{
                queue.put(product);
                System.out.println("ProducerOne X:"+product.getX()+" Y:"+product.getY());
                x++;y++;
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
