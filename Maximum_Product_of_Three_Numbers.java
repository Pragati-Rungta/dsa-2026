/*
Approach:
1. Sort the array.
2. The maximum product can be obtained in two ways:
   - Product of the three largest numbers.
   - Product of the two smallest numbers (possibly negative) 
     and the largest number.
3. Return the maximum of the two products.

Time Complexity: O(n log n) due to sorting
Space Complexity: O(1)
*/

import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
      
        int p = nums[n-3]*nums[n-2]*nums[n-1];
        int q = nums[0]*nums[1]*nums[n-1];
      
        return Math.max(p,q);
        
    }
}
