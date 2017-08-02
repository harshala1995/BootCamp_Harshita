package assignment2;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by marwahh on 8/2/2017.
 */
public class CalculateSum {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        ArrayList<Future> futures = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            futures.add(executor.submit(new PrimeSumTask(i*100+1)));
        }

        int sum = 0;

        while(true){
            for (int i = 0; i < futures.size(); i++) {
                if(futures.get(i).isDone()){
                    int rs = 0;
                    try {
                        rs = (int)((futures.get(i)).get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    sum += rs;
                    System.out.printf("Result : %d%n", rs);
                    futures.remove(i);
                }
            }
            if(futures.size() == 0)
                break;
        }
        System.out.println("Sum = " + sum);
    }
}
