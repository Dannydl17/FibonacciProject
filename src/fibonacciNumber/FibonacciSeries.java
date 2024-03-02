package fibonacciNumber;

import java.util.ArrayList;

public class FibonacciSeries {

//    public static void main(String[] args) {
//        Scanner keyBoardInput = new Scanner(in);
//        System.out.println("Enter the value of n:  ");
//        int nums = keyBoardInput.nextInt();
//
//
//        System.out.println("The largestNumber is  " + checkLargestNumber(collectNumber(nums)));
//    }
    public static int[] collectNumber(int number){
        ArrayList<Integer> list = new ArrayList<>();
         int numberZero = 0;
         int sum = 0;
         int numberOne = 1;
        for (int count = 0; count <= number; count++) {
             list.add(numberZero);
            System.out.println(numberZero);
             sum = numberZero + numberOne;
             numberZero = numberOne;
             numberOne = sum;
        }

        return convertToAnArray(list);
    }

    private static int[] convertToAnArray(ArrayList<Integer> list){
        System.out.println(list);

        int[] results = new int[list.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = list.get(index);
        }
        return results;
    }

    public static int checkTheLargestNumber(int[] nums){
        int largestNumber = nums[0];

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
