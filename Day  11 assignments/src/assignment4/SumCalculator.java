package assignment4;

/**
 * Created by marwahh on 8/1/2017.
 */

import java.util.concurrent.*;

class SumCalculator {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                int sum = 0;
                for (int j = 1; j <= 500; j++)
                    sum = sum + j;
                System.out.printf("SUM is %s%n", sum);
            });
        }
    }
}

