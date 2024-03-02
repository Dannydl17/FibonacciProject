package fibonacciNumber;

import java.util.ArrayList;

public class FibonacciSeries1 {

//    public static void main(String[] args) {
//        Scanner keyBoardInput = new Scanner(in);
//        System.out.println("Enter the value of n:  ");
//        int nums = keyBoardInput.nextInt();
//
//
//        System.out.println("The largestNumber is  " + checkLargestNumber(collectNumber(nums)));
//    }
    public static double[] collectNumber(double number){
        ArrayList<Integer> list = new ArrayList<>();
        double numberZero = 0.0;
        double sum = 0;
        double numberOne = 1.0;
        for (int count = 0; count <= number; count++) {
             list.add((int) numberZero);
            System.out.println(numberZero);
             sum = numberZero + numberOne;
             numberZero = numberOne;
             numberOne = sum;
        }

        return convertToAnArray(list);
    }

    private static double[] convertToAnArray(ArrayList<Integer> list){
        System.out.println(list);

        double[] results = new double[list.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = list.get(index);
        }
        return results;
    }

    public static double checkTheLargestNumber(double[] nums){
        double largestNumber = nums[0];

        for (int count = 0; count < nums.length; count++) {
             if (count > largestNumber){
                 largestNumber = count;
             }
        }
        return largestNumber;
    }








//     while (numberZero <= number) {
//        System.out.println(numberZero);
//        int sum = numberZero + numberOne;
//        numberZero = numberOne;
//        numberOne = sum;
//    }
}
