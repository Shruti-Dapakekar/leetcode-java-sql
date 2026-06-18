/*
Problem: Fizz Buzz
LeetCode #412
Difficulty: Easy

Pattern:
Simulation / Conditional Logic

Logic:
1. Traverse numbers from 1 to n.
2. If divisible by both 3 and 5, add "FizzBuzz".
3. If divisible by 3, add "Fizz".
4. If divisible by 5, add "Buzz".
5. Otherwise, add the number as a string.

Key Observation:
Check divisibility by both 3 and 5 first.
Otherwise multiples of 15 will be incorrectly classified.

Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.*;

public class LC412_FizzBuzz {

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.fizzBuzz(15));
    }
}

class Solution {

    public List<String> fizzBuzz(int n) {
// 1. Create an empty list to store our answers
        List<String> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++) {

            if(i % 3 == 0 && i % 5 == 0)
                answer.add("FizzBuzz");
            else if(i % 3 == 0)
                answer.add("Fizz");
            else if(i % 5 == 0)
                answer.add("Buzz");
            else
                answer.add(Integer.toString(i));
        }

        return answer;
    }
}
