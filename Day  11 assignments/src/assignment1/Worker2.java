package assignment1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by marwahh on 7/31/2017.
 */
public class Worker2 extends Thread {
    PrintTask printTask;

    public Worker2(PrintTask printTask) {
        this.printTask = printTask;
    }

    public void run() {
                printTask.run();
    }
}
