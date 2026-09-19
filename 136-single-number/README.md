# Single Number

<h2><a href="https://leetcode.com/problems/single-number">Single Number</a></h2>

<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />

<hr>

### Question

Given a non-empty array of integers `nums`, every element appears **twice** except for one. Find that single element.

The solution must have **O(n) time complexity** and **O(1) extra space**.

### Examples
```text
Input:  nums = [2,2,1]
Output: 1

Input:  nums = [4,1,2,1,2]
Output: 4

Input:  nums = [1]
Output: 1
```

## <h2><a href="https://leetcode.com/problems/single-number">Single Number</a></h2>

<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />

### Concepts

#### 1. Brute Force — 2 Loops
- Take each `val = nums[i]`.
- Count its occurrences using another loop.
- If `count == 1`, return `val`.
- Time: `O(n²)`
- Space: `O(1)`

#### 2. HashMap
- Store each element with its frequency.
- Return the element whose frequency is `1`.
- Time: `O(n)`
- Space: `O(n)`

#### 3. Hash Array
- Use the element as an index.
- Increment its frequency using `hash[nums[i]]++`.
- Find the index where frequency is `1`.
- Time: `O(n)`
- Space: `O(range of values)`

#### 4. XOR — Optimal
- `x ^ x = 0`
- `x ^ 0 = x`
- Duplicate elements cancel each other.
- The remaining value is the single number.
- Time: `O(n)`
- Space: `O(1)`

### Solution

```java
class Solution {
    public int singleNumber(int[] nums) {
        int x = nums[0];

        for (int i = 1; i < nums.length; i++) {
            x ^= nums[i];
        }

        return x;
    }
}
