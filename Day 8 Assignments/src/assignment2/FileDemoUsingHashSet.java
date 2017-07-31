package assignment2;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by marwahh on 7/27/2017.
 */
public class FileDemoUsingHashSet implements Serializable {
    public static void main(String[] args) {
        HashSet<String> cars= new HashSet();
        createSet(cars);
        Iterator iter = cars.iterator();

        FileOutputStream fos = null;
        OutputStreamWriter os= null;
        try {
            fos = new FileOutputStream("C:\\Users\\marwahh\\IdeaProjects\\Assignments\\Day 8 Assignments\\src\\Data.txt");
            os=new OutputStreamWriter(fos);
            while(iter.hasNext()){
                String s = (String)iter.next()+'\n';
                System.out.println(s);
                os.write(s);
            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
                fos.close();
            } catch (IOException f) {
                System.out.println(f.toString());
            }
        }


    }

    private static void createSet(HashSet<String> cars) {
        cars.add("Alto");
        cars.add("Dezire");
        cars.add("Etios");
        cars.add("Maruti");
    }
}
