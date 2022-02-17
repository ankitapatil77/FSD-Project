package src.com.javaProgram.Assignment;

public class SortingProgram {
	public static void main(String[] args) {
		int arr[] = { 44, 53, 24, 61 };
		 
        // Outer loop
        for (int index = 0; index < arr.length; index++) {
 
            // Inner nested loop pointing 1 index ahead
            for (int j = index + 1; j < arr.length; j++) {
 
                // Checking elements
                int temp = 0;
                if (arr[j] < arr[index]) {
 
                    // Swapping
                    temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }
            }
 
            // Printing sorted array elements
            System.out.print(arr[index] + " ");
        }
	}

}
