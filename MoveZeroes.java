//Program: Move all zeroes to the end of the array
//Approach: Nested loops with swapping
//Time Complexity: O(n^2)
//Space Complexity: O(1)
 public class Movezeroes {
    public static void main (String [] args) {
        int arr[] = {0,0,7,8,6,5,4};
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]!=0) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
            }
        }
    }
}
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
       }
   }
}
