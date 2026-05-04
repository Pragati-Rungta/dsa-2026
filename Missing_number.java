// LeetCode 268 - Missing Number
// Approach: Sum Formula

// The array contains n distinct numbers from the range [0, n]
// One number is missing. We calculate the expected sum of numbers
// from 0 to n using the formula n(n+1)/2 and subtract the actual
// sum of the array elements to find the missing number.

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for(int i = 0; i < n; i++){
            actualSum += nums[i];
        }
        
        return expectedSum - actualSum;
    }
}
