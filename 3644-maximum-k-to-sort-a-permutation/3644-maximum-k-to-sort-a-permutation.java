class Solution {
    public int sortPermutation(int[] nums) {
    int ans = 0;
    int m = (int) 1e9;
          for (int i = 0; i < nums.length; i++){
            if (nums[i] == i) continue;
            if (ans == 0){
                ans = nums[i];
                continue;
            }
            ans = ans & nums[i];
            m = Math.min(m, ans);
        }

        if (m == (int) 1e9) return 0;
        return m;
    }
}