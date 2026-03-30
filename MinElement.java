//Problem : Find minimum element in an array
// Approach : Traverse the array and keep updating minimum value
// Time Complexity : O(n)
// Space Complexity : O(1)
public class prg5 {
    public static void main(String[] args) {

        int arr[] = {9,7,8,-10,5};
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
          if(arr[i] < min){
            min = arr[i];
        }
    }
        System.out.println("minimum element"  +  min);
     }
  }

        
    
