/*
Problem: Combine Two Tables
LeetCode #175
Difficulty: Easy

Approach:
Use LEFT JOIN to combine the Person and Address tables.
LEFT JOIN ensures that all persons are included even if
they do not have an address.

Time Complexity: O(n)
Space Complexity: O(1)
*/

SELECT
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
         LEFT JOIN Address a
                   ON p.personId = a.personId;