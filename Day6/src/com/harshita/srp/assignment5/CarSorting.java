package com.harshita.srp.assignment5;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by marwahh on 7/25/2017.
 */
public class CarSorting {
    public static void main(String[] args) {

        Set<Car> cars=new TreeSet<>();
        createCars(cars);
        System.out.println(cars.size());
        for (Car c:cars
             ) {
            System.out.println(c);
        }

        cars=new TreeSet<>(new IdComparator());
        createCars(cars);
        System.out.println(cars.size());
        for (Car c:cars
                ) {
            System.out.println(c);
        }

        cars=new TreeSet<>(new BrandComparator());
        createCars(cars);
        System.out.println(cars.size());
        for (Car c:cars
                ) {
            System.out.println(c);
        }
    }

    private static void createCars(Set<Car> cars) {
        cars.add(new Car(1,2000000,"abc"));
        cars.add(new Car(3,200000,"def"));
        cars.add(new Car(2,20000,"ghi"));
        cars.add(new Car(4,1000000,"jkl"));
        cars.add(new Car(5,230000,"mno"));
        cars.add(new Car(8,204500,"pqr"));
        cars.add(new Car(20,26660000,"stu"));
        cars.add(new Car(6,205500,"vwx"));
        cars.add(new Car(7,20888000,"yz"));
        cars.add(new Car(10,2122000,"aa"));
        cars.add(new Car(9,2023300,"bbc"));
        cars.add(new Car(11,2055000,"cbc"));
        cars.add(new Car(15,20000,"ccbc"));
        cars.add(new Car(14,211000,"aabc"));
        cars.add(new Car(19,2330000,"abbbc"));
        cars.add(new Car(16,2220000,"aabc"));
        cars.add(new Car(17,2880000,"abac"));
        cars.add(new Car(12,440000,"abaac"));
        cars.add(new Car(18,5500000,"abasc"));
        cars.add(new Car(13,6600000,"abcac"));
    }
}
