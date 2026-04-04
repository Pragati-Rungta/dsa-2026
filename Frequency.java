// Problem : count frequency of elements in an array
// Approach : use nested loops to count how many times each element appears
// Step 1 : Traverse each element
// Step 2 : count occurence by comparing with rest of array
// Step 3 : Print element with its frequency
// Note : Avoid printing duplicate elements multiple times
// Time complexity : O(n^2)
// Space complexity : O(1)
// This is brute force approach and can be optimized using HashMap (O(n))
public class FrequencyArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 1, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            // Skip already counted elements
            if (arr[i] == -1)
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // mark as visited
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}
