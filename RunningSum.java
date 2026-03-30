//problem : Running sum of 1D Array
// Approach : cumulative sum using loop
class Solution {
    public int[] runningSum(int[] nums) {

        for(int i =1;i<nums.length;i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
