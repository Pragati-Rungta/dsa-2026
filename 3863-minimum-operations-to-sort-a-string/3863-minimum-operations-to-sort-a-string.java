
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        for (int i = 1; i < n; i++){
            if (s.charAt(i) < s.charAt(i - 1)){
                sorted = false;
                break;
            }
        }

        if (sorted)
         return 0;
        if (n == 2)
            return -1;
        char minP = s.charAt(1);
        char maxP = s.charAt(1);
        for (int i = 2; i < n - 1; i++) {
            minP = (char) Math.min(minP, s.charAt(i));
            maxP = (char) Math.max(maxP, s.charAt(i));
        }
        if (s.charAt(0) <= s.charAt(n - 1)
                && (minP >= s.charAt(0) || maxP <= s.charAt(n - 1)))
            return 1;

        return s.charAt(n - 1) < minP && s.charAt(0) > maxP ? 3 : 2;
    }
}
