class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int m = 1, a = 1;

        // Increasing subarray
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i - 1])
                a++;
            else
               a = 1;
          m = Math.max(m, a);
        }
        a = 1;

        // Decreasing subarray
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < nums[i - 1])
                a++;
            else
                a = 1;
            m = Math.max(m, a);
        }
        return m;
    }
}