package assignment1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by marwahh on 8/1/2017.
 */
public class Producer implements Runnable {
    LinkedBlockingQueue<Integer> linkedBlockingQueue;

    public Producer(LinkedBlockingQueue<Integer> linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            linkedBlockingQueue.offer((int) (Math.random() * 1000));
        }
    }
}

