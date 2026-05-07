/*Problem: Find the Middle Index in Array

Approach:
1. Calculate the total sum of the array.
2. Traverse the array while keeping track of the left sum.
3. For each index, calculate the right sum using:
   rightSum = totalSum - leftSum - nums[i]
4. If leftSum == rightSum, return that index.
5. If no such index exists, return -1.

Time Complexity: O(n)
Space Complexity: O(1)*/
  
  class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int totalSum = 0;

        for(int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for(int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
    
