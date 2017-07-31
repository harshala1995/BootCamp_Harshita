package assignment1;

/**
 * Created by marwahh on 7/31/2017.
 */
public class ValueTask implements Runnable {


    @Override
    public void run() {
           World.i++;
    }
}