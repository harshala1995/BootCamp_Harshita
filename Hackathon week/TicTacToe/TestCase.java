package TicTacToe;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by marwahh on 7/17/2017.
 */
public class TestCase {
    @Test
    public void checkWinner() {

        int expectedOutput = -1;
        Assert.assertEquals("Wrong output for input 2", expectedOutput , TicTacToeResult.findResult(new int[][]{{-1,-1,-1},{0,-1,0},{1,1,-1}}));
    }
}
