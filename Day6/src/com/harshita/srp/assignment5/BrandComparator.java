package com.harshita.srp.assignment5;

import java.util.Comparator;

/**
 * Created by marwahh on 7/26/2017.
 */
public class BrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int i= o1.getBrand().compareTo(o2.getBrand());
        return i;
    }
}
