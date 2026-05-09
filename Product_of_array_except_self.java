/*Problem: Product of Array Except Self (LeetCode 238)

Approach:
- We compute the product of all elements except the current index.
- Use prefix and suffix products.

Steps:
1. First pass: store prefix product in the answer array.
   answer[i] contains product of all elements to the left of i.

2. Second pass: maintain a suffix product while traversing from right.
   Multiply the suffix product with the prefix value stored in answer.

3. This avoids using division and runs in O(n) time.

Time Complexity: O(n)
Space Complexity: O(1) extra space*/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];

        answer[0] = 1;
        for(int i=1;i<n;i++) {
            answer[i] = answer[i-1] * nums[i-1];
            }
        int right =1;
        for(int i=n-1;i>=0;i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
            }
        return answer;
    }
}


