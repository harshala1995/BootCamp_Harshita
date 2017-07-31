package assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by marwahh on 7/27/2017.
 */
public class FileDemo {
    public static void main(String[] args) {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\marwahh\\IdeaProjects\\Assignments\\Day 8 Assignments\\src\\Data.txt");

            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException f) {
                System.out.println(f.toString());
            }
        }
    }
}
