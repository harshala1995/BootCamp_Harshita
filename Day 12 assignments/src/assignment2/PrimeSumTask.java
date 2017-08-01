package assignment2;

import java.util.concurrent.Callable;

/**
 * Created by marwahh on 8/1/2017.
 */
public class PrimeSumTask implements Callable {
    int number;

    public PrimeSumTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 100; i++,number++) {
            int j;
            for (j = 2; j < number; j++) {
                if (number == 1)
                    continue;
                else {
                    int n = number % j;
                    if (n == 0) {
                        break;
                    }
                }
            }
            if (number == j) {
                //System.out.print("  " + i);
                sum+=number;
            }
        }
        return sum;
    }
}
