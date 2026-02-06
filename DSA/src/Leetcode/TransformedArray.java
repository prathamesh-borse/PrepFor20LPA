package Leetcode;

import java.util.Arrays;

public class TransformedArray {
    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 1};
        int[] ans = constructTransformedArray(arr);
        System.out.println(Arrays.toString(ans));
    }

/*
1. whenever there is circular array use % modulo to be in the bounds of the array
then it will go out of bound => use % modulo

2. jitna step move karna hai utna already calculate karke lena hai.

if the abs(nums[i]) value becomes negative then add n to it

if i + n becomes out of bound then % n to reduce it and it should be in within the boundary
*/

    private static int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // if nums[i] value is greater than the array length, then reduce it to be within the array boundary
            int shift = nums[i] % nums.length;

            // if nums[i] become negative with (i + (-nums[i])) it will become negative only then do modulo to be within the array boundary
            int newIndex = (i + shift) % nums.length;

            if (newIndex < 0) {
                newIndex += nums.length;
            }

            result[i] = nums[newIndex];
        }
        return result;
    }
}
