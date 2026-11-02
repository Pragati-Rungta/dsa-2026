class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int idx = nums.length / 2;
        int k = 0;
        for (int a : nums){
            k = k + Math.abs(a - nums[idx]);
        }
        return k;
    }
}
    