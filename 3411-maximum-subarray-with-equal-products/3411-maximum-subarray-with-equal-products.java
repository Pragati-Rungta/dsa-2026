class Solution {

    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int l = 0; l < n; l++){
            long g = nums[l];
            long lc = nums[l];
            double inv = 1.0 / nums[l];

            for (int r = l; r < n; r++){

                if (r > l) {
                    g = gcd(g, nums[r]);
                    lc = lcm(lc, nums[r]);
                    inv /= nums[r];
                }

                if (g * lc * inv > 0.99999999){
                    ans = Math.max(ans, r - l + 1);
                }
            }
        }
        return ans;
    }
    // GCD function
    public long gcd(long a, long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long lcm(long a, long b){
        return (a / gcd(a, b)) * b;
    }
}