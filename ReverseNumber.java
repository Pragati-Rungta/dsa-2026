// Problem : Reverse a number
// Approach : Extract digits one by one and build the reversed number
// Step 1 : get last digit using num % 10
// Step 2 : Add digit to reversed number (rev = rev * 10 + digit)
// Step 3 : Remove last digit from original number (num = num / 10)
// Step 4 : Repeat until number becomes 0
// Time complexity : O(d) (where d = number of digits)
// Space complexity : O(1)
// note : this works for positive integers
import java.util.*;
public class Reverse {
    
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
      
        System.out.print("enter a number");
        int num = sc.nextInt();

        int rev = 0;
        while (num!=0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + rev);
        

    }
}
