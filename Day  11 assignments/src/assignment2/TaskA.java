package assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by marwahh on 7/31/2017.
 */

class TaskA implements Runnable {

    public void run() {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\marwahh\\IdeaProjects\\Assignments\\Day  11 assignments\\src\\assignment2\\abc.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.println((char) b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
