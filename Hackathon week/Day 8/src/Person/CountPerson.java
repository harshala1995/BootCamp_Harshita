package Person;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marwahh on 7/20/2017.
 */
public class CountPerson {
    static void count(ArrayList<Person> a) {
        HashMap<String ,Integer> stringCount = new HashMap<String,Integer>();
        for (int i = 0; i < a.size(); i++) {
            if(stringCount.containsKey(a.get(i).getName())){
                String name = a.get(i).getName();
                Integer count = stringCount.get(a.get(i).getName());
                stringCount.put(name,count+1);
            }
            else {
                stringCount.put(a.get(i).getName(),1);
            }
        }
        System.out.println(stringCount);
    }
}
