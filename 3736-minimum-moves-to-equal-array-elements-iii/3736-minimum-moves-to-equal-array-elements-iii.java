class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        for(int a:nums){
            s = s + Math.abs(a - nums[nums.length - 1]);
        }
        return s;
    }
}