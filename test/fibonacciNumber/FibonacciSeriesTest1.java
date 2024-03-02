package fibonacciNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSeriesTest1 {

    @Test
    public void testThatFibonacciSeriesCanCollectANumberAndReturnSeriesOfNumberTest(){
       double number = 12.5;
       double[] nums = FibonacciSeries1.collectNumber(number);
       assertEquals(13, nums.length);
       assertEquals(0.0, nums[0]);
       assertEquals(1.0, nums[1]);
       assertEquals(1.0, nums[2]);
       assertEquals(2.0, nums[3]);
       assertEquals(3.0, nums[4]);
       assertEquals(5.0, nums[5]);
       assertEquals(8.0, nums[6]);
       assertEquals(13.0, nums[7]);
       assertEquals(21.0, nums[8]);
       assertEquals(34.0, nums[9]);
       assertEquals(55.0, nums[10]);
       assertEquals(89.0, nums[11]);
       assertEquals(144.0, nums[12]);
    }

    @Test
    public void testThatFibonacciSeriesCanCollectANumberAndReturnSeriesOfNumberAndReturnTheLargestNumberTest(){
       double[]number = {0.0,1.0,1.0,2.0,3.0,5.0,8.0,13.0,21.0,34.0,55.0,89.0,144.0};
       double nums = FibonacciSeries1.checkTheLargestNumber(number);
       assertEquals(5, nums);
    }

}