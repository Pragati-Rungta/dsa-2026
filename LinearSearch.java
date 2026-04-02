//Problem : Perform linear search in an array
// Approach : Traverse the array and compare each element with target
// If found , return index; else return false
// Time complexity : O(n)
// Space complexity : O(1)
//linear search
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3,5,7,9,1};
        int key = 10;
         boolean found = false;
            for(int i=0;i<arr.length;i++) {
                if (arr[i] == key){
                    System.out.println("Element found at index: " + i);
                    found = true;
                }
            }
            if(!found) {
                System.out.println("element not found in the array");
            }
        }
    }  
               
            
            
        
    
