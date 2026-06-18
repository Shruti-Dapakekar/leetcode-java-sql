
/*
Problem: Employees Earning More Than Their Managers
LeetCode #181
Difficulty: Easy

Pattern:
Self Join

Logic:
1. Join Employee table with itself.
2. One alias (e) represents employees.
3. Another alias (m) represents managers.
4. Match employee's managerId with manager's id.
5. Select employees whose salary is greater than their manager's salary.

Key Observation:
The manager information exists in the same table,
so a Self Join is required.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT e.name AS Employee
FROM Employee e
         JOIN Employee m
              ON e.managerId = m.id
WHERE e.salary > m.salary;