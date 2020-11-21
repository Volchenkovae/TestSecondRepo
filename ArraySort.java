package MethodPractice;

import java.util.Arrays;

public class ArraySort {

    public int[] ArrayNums (int[] nums){
        Arrays.sort(nums);

        int[] result = new int[3];
        result[0]= nums[nums.length - 1];
        result[1]= nums[0];
        int sum = 0;

        for (int num : nums){
            sum+=num;

        }
        int average = sum/nums.length;
        result[2] = average;
        return result;
    }

    public static void main(String[] args) {
        ArraySort as = new ArraySort();
        int[] nums = {8, 2, 5, 9, 17, 6};
        int[] values = as.ArrayNums(nums);
        System.out.println(Arrays.toString(values));

    }

}
