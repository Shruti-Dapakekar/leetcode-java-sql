/*
Problem: Richest Customer Wealth
LeetCode #1672
Difficulty: Easy

Pattern:
2D Array Traversal

Logic:
1. Traverse each customer (row).
2. Calculate the sum of all accounts of that customer.
3. Keep track of the maximum sum found.
4. Return the maximum wealth.

Key Observation:
Each row represents a customer.
Each column represents a bank account.

Time Complexity: O(m × n)
Space Complexity: O(1)
*/
public class LC1672_RichestCUstomerWealth {


    static int accounts[][]={
            {1,5},
            {7,3},
            {3,5}
    };

    public static void main(String[] args){
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){

            int currentCustomertotal = 0;

            for(int j=0;j<accounts[i].length;j++){
                currentCustomertotal= currentCustomertotal + accounts[i][j];
            }

            if (currentCustomertotal>maxWealth){
                maxWealth = currentCustomertotal;
            }
        }
        System.out.println("Maximum Wealth = "+maxWealth);

    }
}
