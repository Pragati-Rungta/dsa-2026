//Problem : find sum of all elements in an array
//Approach : Traverse the array and keep adding elements to a sum variable
// Time complexity : O(n)
//Space complexity : O(1)
public class SumofArray {
    public static void main (String args[]) {
        int arr[] = { 1,1,2,4,99};
        int arr1[] = {3,5,8,9};

        int sum = 0;

       for(int i=0;i<arr.length;i++) {
        sum = sum + arr[i];
       }

       for(int i=0;i<arr1.length;i++) {
        sum = sum + arr1[i]; 
       }

       System.out.println("Total Sum" + sum);
    }
}
