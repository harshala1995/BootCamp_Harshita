package HashSetImplementation;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

import java.util.*;

/**
 * Created by marwahh on 7/21/2017.
 */
public class HashSetImplementation {
        public static void main(String args[]){
            //Creating HashSet and adding elements
            HashSet<String> set=new HashSet<String>();
            set.add("Harshita");
            set.add("Harshi");
            set.add("Harsh");
            set.add("Har");
            //Traversing elements
            Iterator<String> itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }

    @Test
    public void test1() {

    }
}
