import java.util.concurrent.BlockingQueue;

public class ProducerOne implements Runnable {

    BlockingQueue<Integer> queue;

    public ProducerOne(BlockingQueue<Integer>  queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        int value=1;
        while(true){
            try{
                queue.put(value);
                System.out.println("ProducerOne :"+value);
                value++;
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
