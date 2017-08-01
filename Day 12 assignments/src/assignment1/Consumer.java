package assignment1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by marwahh on 8/1/2017.
 */
public class Consumer implements Runnable {
    LinkedBlockingQueue<Integer> linkedBlockingQueue;

    public Consumer(LinkedBlockingQueue<Integer> linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            int j = linkedBlockingQueue.poll();
            System.out.println("i consumed " + j);
        }
    }
}
