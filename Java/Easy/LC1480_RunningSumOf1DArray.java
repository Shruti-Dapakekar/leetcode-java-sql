import java.util.Arrays;
/*
Problem: Running Sum of 1D Array
LeetCode #1480
Difficulty: Easy

Approach:
1. Start from index 1.
2. Add the previous element's running sum to the current element.
3. Store the result back in the same array.
4. Return the modified array.

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
*/

public class LC1480_RunningSumOf1DArray {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}
