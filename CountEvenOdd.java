//Problem : count even and odd numbers in an array
//Approach : Traverse array and check each number using modulo operator
// if number % 2 == 0 -> even , else odd
// Time complexity : O(n)
// Space complexity : O(1)
public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {15,6,7,8,10,11};
        int evencount = 0;
        int oddcount = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("even numbers" +evencount);
        System.out.println("odd numbers" +oddcount);
        }
        
    }
    


