package assignment2;

/**
 * Created by marwahh on 7/31/2017.
 */

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.io.InputStream;

public class ReadFileThread {
    public static void main(String[] args) {
        TaskA taskA  = new TaskA();
        TaskB taskB  = new TaskB();

        Thread threadA = new Thread(taskA);
        threadA.start();

        Thread threadB = new Thread(taskB);
        threadB.start();
    }
}
