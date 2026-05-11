/*
Approach:
1. A sorted and rotated array will have at most one place where nums[i] > nums[i+1].
2. Traverse the array and count such breaks.
3. Use modulo (i+1)%n to compare the last element with the first.
4. If the count of breaks is more than 1, the array is not sorted and rotated.
5. Otherwise, return true.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
