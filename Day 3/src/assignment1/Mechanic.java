package assignment1;

/**
 * Created by marwahh on 8/1/2017.
 */
abstract class Vehicle {
    int vin;
    int speed;
    String name;

    Vehicle(){}

    Vehicle(int vin,int speed,String name) {
        this.vin = vin;
        this.speed = speed;
        this.name = name;
    }
    void details() {
        System.out.println("vin = " + vin);
        System.out.println("speed = " + speed);
        System.out.println("name = " + name);
    }
    abstract void drive();
    abstract void inspect();
}
class Bike extends Vehicle{
    Bike(int vin,int speed,String name) {
        super(vin,speed,name);
    }
    void drive() {
        System.out.println("In drive of Bike");
    }
    void inspect() {
        System.out.println("In inspect of Bike");
    }
}
class Car extends Vehicle{
    Car(int vin,int speed,String name) {
        super(vin,speed,name);
    }
    void drive() {
        System.out.println("In drive of Car");
    }
    void inspect() {
        System.out.println("In inspect of Car");
    }
}
class Mechanic {
    public static void main(String[] args) {
        Car car = new Car(123,30,"abc");
        Bike bike = new Bike(123,30,"abc");
        car.details();
        car.drive();
        car.inspect();
        bike.details();
        bike.drive();
        bike.inspect();
    }
}
