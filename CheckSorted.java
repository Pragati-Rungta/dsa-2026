//Problem : check if array is sorted in ascending order
//Approach : traverse the array and compare adjacent elements
// if any element is greater than next -> not sorted
// Time complexity : O(n)
// Space complexity : O(1)

public class sortedArray {
    
        static boolean isSorted(int arr[]) {
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {6,7,8,9,2};
        if(isSorted(arr)) {
            System.out.println("sorted array");
        }
        else {
            System.out.println("array is not sorted");
        }
    }
}
       

    
    

