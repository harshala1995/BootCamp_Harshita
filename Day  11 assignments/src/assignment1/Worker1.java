package assignment1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by marwahh on 7/31/2017.
 */
public class Worker1 extends Thread {
    ValueTask valueTask;

    public Worker1(ValueTask valueTask) {
        this.valueTask = valueTask;
    }

    public void run() {
                valueTask.run();
    }
}
