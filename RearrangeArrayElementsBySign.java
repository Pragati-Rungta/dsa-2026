/*LeetCode 2149 - Rearrange Array Elements by Sign

Problem:
Given an array containing equal numbers of positive and negative integers,
rearrange the array such that:
1. Positive and negative numbers appear alternately.
2. The array starts with a positive number.
3. The relative order of positive and negative numbers remains the same.

Approach:
1. Create a new array to store the rearranged result.
2. Use two pointers:
   - posIndex for placing positive numbers at even indices (0,2,4...)
   - negIndex for placing negative numbers at odd indices (1,3,5...)
3. Traverse the original array:
   - If the element is positive, place it at posIndex and move posIndex by 2.
   - If the element is negative, place it at negIndex and move negIndex by 2.

Time Complexity: O(n)
Space Complexity: O(n)*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<n;i++) {
          
            if(nums[i]>0) {
                ans[posIndex] = nums[i];
                posIndex = posIndex + 2;
          }
            else {
                ans[negIndex] = nums[i];
                negIndex = negIndex + 2;
            }
         }
             return ans;
        }
      }
