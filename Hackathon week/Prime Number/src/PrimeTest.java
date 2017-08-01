import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by marwahh on 7/17/2017.
 */
public class PrimeTest {
    @Test
    public void checkNumber2() {

        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(2);
        Assert.assertEquals("Wrong output for input 2", expectedOutput , PrimeNumberGenerator.getIntegers(2));
    }
    @Test
    public void checkNumber3() {

        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(2);
        expectedOutput.add(3);
        Assert.assertEquals("Wrong output for input 3", expectedOutput , PrimeNumberGenerator.getIntegers(3));
    }

    @Test
    public void checkNumber14() {

        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(2);
        expectedOutput.add(3);
        expectedOutput.add(5);
        expectedOutput.add(7);
        expectedOutput.add(11);
        expectedOutput.add(13);
        Assert.assertEquals("Wrong output for input 14", expectedOutput , PrimeNumberGenerator.getIntegers(14));
    }
    @Test
    public void checkNumber13() {

        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(13);
        Assert.assertEquals("Wrong output for input 13", expectedOutput.get(0) , PrimeNumberGenerator.getIntegers(13).get(PrimeNumberGenerator.getIntegers(13).size()-1));
    }
    @Test
    public void checkNumber99() {

        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(97);
        Assert.assertEquals("Wrong output for input 97", expectedOutput.get(0) , PrimeNumberGenerator.getIntegers(97).get(PrimeNumberGenerator.getIntegers(97).size()-1));
    }
}
