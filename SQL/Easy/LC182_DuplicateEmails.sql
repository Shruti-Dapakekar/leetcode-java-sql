/*
Problem: Duplicate Emails
LeetCode #182
Difficulty: Easy

Pattern:
GROUP BY + HAVING

Logic:
1. Group records by email.
2. Count occurrences of each email.
3. Return emails appearing more than once.

Key Observation:
HAVING is used to filter grouped data.

Time Complexity: O(n)
Space Complexity: O(n)
*/

SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;