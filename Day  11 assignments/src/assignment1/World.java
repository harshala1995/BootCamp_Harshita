package assignment1;

/**
 * Created by marwahh on 7/31/2017.
 */
public class World {
    static int i = 0;

    public static void main(String[] args) {

        ValueTask taskA = new ValueTask();
        PrintTask taskB = new PrintTask();

        for (int j = 0; j < 20; j++) {

            Worker1 worker1 = new Worker1(taskA);
            worker1.start();

            Worker2 worker2 = new Worker2(taskB);
            worker2.start();
        }
        System.out.println("Finish");

    }
}
