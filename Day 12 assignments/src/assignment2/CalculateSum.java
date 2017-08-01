package assignment2;

import java.util.concurrent.*;

/**
 * Created by marwahh on 8/2/2017.
 */
public class CalculateSum {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future1 = executor.submit(new PrimeSumTask(1));
        Future<Integer> future2 = executor.submit(new PrimeSumTask(101));
        Future<Integer> future3 = executor.submit(new PrimeSumTask(201));
        Future<Integer> future4 = executor.submit(new PrimeSumTask(301));
        Future<Integer> future5 = executor.submit(new PrimeSumTask(401));

        int sum = 0;

        try {
            if (!future1.isCancelled()) {
                int rs = future1.get();
                sum += rs;
                System.out.printf("Result : %d%n", rs);
            }
            if (!future2.isCancelled()) {
                int rs = future2.get();
                sum += rs;
                System.out.printf("Result : %d%n", rs);
            }
            if (!future3.isCancelled()) {
                int rs = future3.get();
                sum += rs;
                System.out.printf("Result : %d%n", rs);
            }
            if (!future4.isCancelled()) {
                int rs = future4.get();
                sum += rs;
                System.out.printf("Result : %d%n", rs);
            }
            if (!future5.isCancelled()) {
                int rs = future5.get();
                sum += rs;
                System.out.printf("Result : %d%n", rs);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted!!!");
        } catch (ExecutionException e) {
            System.out.println("Task can not be executed!!!");
        } catch (CancellationException e) {
            System.out.println("Task already got cancelled!!!");
        }
        System.out.println("Sum = " + sum);
    }
}
