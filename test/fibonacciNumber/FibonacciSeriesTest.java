package fibonacciNumber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

    @Test
    public void testThatFibonacciSeriesCanCollectANumberAndReturnSeriesOfNumberTest(){
       int number = 5;
       int[] nums = FibonacciSeries.collectNumber(number);
       assertEquals(6, nums.length);
       assertEquals(0, nums[0]);
       assertEquals(1, nums[1]);
       assertEquals(1, nums[2]);
       assertEquals(2, nums[3]);
       assertEquals(3, nums[4]);
       assertEquals(5, nums[5]);
    }

    @Test
    public void testThatFibonacciSeriesCanCollectANumberAndReturnSeriesOfNumberAndReturnTheLargestNumberTest(){
       int[]number = {0,1,1,2,3,5,};
       int nums = FibonacciSeries.checkTheLargestNumber(number);
       assertEquals(5, nums);
    }

}