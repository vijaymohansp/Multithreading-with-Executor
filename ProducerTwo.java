import sun.awt.windows.ThemeReader;

import java.util.concurrent.BlockingQueue;

public class ProducerTwo implements Runnable {

    BlockingQueue<Integer> queue;

    public ProducerTwo(BlockingQueue<Integer>  queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        int value=1;
        while(true){
            try{
                queue.put(value);
                System.out.println("ProducerTwo :"+value);
                value++;
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
