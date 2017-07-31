package assignment1;

import org.junit.Test;

/**
 * Created by marwahh on 7/28/2017.
 */
public class Demo {
    public static void main(String[] args) {
        DoCalculate d1=new DoCalculate();

        d1.Calculation(2,3,(double n1,double n2)->{
            System.out.println("Sum = " +(n1+n2));
        });


        d1.Calculation(2,3,(double n1,double n2)->{
            System.out.println("Difference = " +(n1-n2));
        });d1.Calculation(2,3,(double n1,double n2)->{
            System.out.println("Multiplication = " +(n1*n2));
        });d1.Calculation(2,3,(double n1,double n2)->{
            System.out.println("Division = " +(n1/n2));
        });
    }
}
