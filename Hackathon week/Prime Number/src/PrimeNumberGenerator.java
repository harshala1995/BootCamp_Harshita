/**
 * Created by marwahh on 7/17/2017.
 */

import java.io.Console;
import java.util.*;

public class PrimeNumberGenerator {
    public static void main(String[] args) {

        System.out.println("Eneter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList primes = getIntegers(n);

        print(primes);
    }

    private static void print(ArrayList<Integer> primes) {
        for(int i=0;i<primes.size();i++) {
            System.out.println(primes.get(i));
        }
    }

     static ArrayList getIntegers(int n) {
        Map<Integer, Integer> primeNumbers = new HashMap<Integer, Integer>();
        ArrayList<Integer> primes = new ArrayList<>();

        if(n==1) {
            return primes;
        }
        for(int i = 0; i <= n; i++){
            int j;
            if(!primeNumbers.containsKey(i)) {
                for( j = 2; j <= i; j++) {
                    if(i % j == 0) {
                        break;
                    }
                }
                if(j == i) {
                    primes.add(i);
                    primeNumbers.put(i,1);
                    for(j=1; i+i*j < n; j++) {
                        primeNumbers.put(i+i*j,1);
                    }
                }
            }
        }
        return primes;
    }
}