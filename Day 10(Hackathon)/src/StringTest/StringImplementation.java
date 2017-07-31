package StringTest;

import org.junit.Test;

/**
 * Created by marwahh on 7/22/2017.
 */
public class StringImplementation {
    public static void main(String[] args) {
        String name = new String("cdk");
        String name1 = name.intern();
        String name2 = "cdk";
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 == name2);
    }
}
