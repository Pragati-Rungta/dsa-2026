//Problem : check if number is Palindrome
// Approach : reverse the number and compare with original
// if both are same : Palindrome
// Time complexity : O(n) (based on number of digits)
// Space complexity : O(1)
   class Solution {
    public boolean isPalindrome(int x) {
     if(x < 0) {
        return false;
     }
     int original = x;
     int rev = 0;

     while(x!=0) {
        int digit = x % 10;
        rev = rev * 10 + digit;
        x = x / 10;
     }
        return original == rev;
    }
  }

