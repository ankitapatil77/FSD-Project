package src.com.javaProgram.Assignment;

import java.util.Scanner;

public class LinearSearchAlgorithm {
	public static void main(String[] args) {
		int[] array = {100,240,530,740,590};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int searchElement = scan.nextInt();
            int result = (int) linearing(array,searchElement);

            if(result== -1){

                System.out.println("Entered Element not in the array");
            } else {

                System.out.println("Entered Element found at "+result+"th index  and the search key is "+array[result]);
            }


        }




public static int linearing(int array[], int n) {

    int arrlength = array.length;
    for (int i = 0; i < array.length - 1; i++) {

        if (array[i] == n) {

            return i;

         }
     }

            return -1;

   }



	}


