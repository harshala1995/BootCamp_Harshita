package assignment1;

/**
 * Created by marwahh on 7/31/2017.
 */
public class PrintTask implements Runnable{
    @Override
    public void run() {
        System.out.println(assignment1.World.i);
    }
}
