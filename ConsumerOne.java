import java.util.concurrent.BlockingQueue;

public class ConsumerOne implements Runnable {

    BlockingQueue<Integer> queue;

    public ConsumerOne(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Queue Size :"+queue.size());
                int value1=queue.take();
                int value2=queue.take();
                System.out.println("Consumed value :"+(value1+value2));
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
