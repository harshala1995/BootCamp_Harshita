package com.harshita.srp.assignment5;

/**
 * Created by marwahh on 7/25/2017.
 */
public class Car implements Comparable{
    private int id;
    private double price;
    private String brand;

    public Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getPrice() == ((Car) obj).getPrice()) {
            if (this.getBrand().equals(((Car) obj).getBrand())) {
                if (this.getId() == ((Car) obj).getId())
                    return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        int i= (int) (((Car)o).getPrice() - this.getPrice());
        return i;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
