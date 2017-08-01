package assignment1;

/**
 * Created by marwahh on 8/1/2017.
 */

import java.util.concurrent.LinkedBlockingQueue;

public class World {


    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>();
        new Thread(new Producer(linkedBlockingQueue)).start();
        new Thread(new Consumer(linkedBlockingQueue)).start();
    }
}
