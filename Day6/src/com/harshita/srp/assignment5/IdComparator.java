package com.harshita.srp.assignment5;

import java.util.Comparator;

/**
 * Created by marwahh on 7/25/2017.
 */
public class IdComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int i= (int) (o1.getId() - o2.getId());
        return i;
    }
}
