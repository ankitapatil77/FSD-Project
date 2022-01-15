package com.javaProgramming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LongesIncreasingtSequence {

	    /*Function which prints the longest increasing subsequence */
	    public static int lengthOfLongestIncreasingSequence(int[] num) {
	    	
//	        /*array d which computes length of longest increasing sequence for all elements in num including that element*/
	    	
	        int[] arr = new int[num.length];
	        Arrays.fill(arr, 1); //initialize d with 1 since lis for each element is initially 1

	      
			/*Check is num[j] is less than num[i] if yes then compute arr[i] as max(arr[i],arr[j]+1 */
	        for(int i = 0;i<num.length;i++){
	            for(int j = 0;j<i;j++){
	                if(num[j]<num[i]){
	                    arr[i] = Math.max(arr[i],arr[j]+1);
	                }
	            }
	        }
	        int largest = 0; //variable used to find the max value in array d
	        for(int i=0;i<num.length;i++){
	          
				if(arr[i]>largest){
	                largest = arr[i];
	            }
	        }
	        int tmp = largest;
	        ArrayList<Integer> sub=  new ArrayList<Integer>(num.length); //Arraylist which prints the longest increasing subsequence
	        for (int i = arr.length -1;i>=0;i--){
	            if (arr[i] == tmp){
	                sub.add(num[i]);
	                tmp--;
	            }
	        }

	        Collections.reverse(sub);
	        System.out.println("Longest Increasing Subsequence is: "+sub);
	        return largest;
	    }
	    public static void main(String args[]){
	        Scanner Sc  = new Scanner(System.in);

	        /*Take array length and elements as input*/
	        System.out.println("Enter length of array:");
	        int n = Sc.nextInt();
	        int [] num = new int[n];
	        System.out.println("Enter elements in array:");
	        for (int i=0; i<n;i++){
	            num[i] = Sc.nextInt();
	        }

	        /*call lengthOfLIS function and print the length of longest common subsequence*/
	        int lis  = lengthOfLongestIncreasingSequence(num);
	        System.out.println("Length of LIS is: "+lis);

	    }
	}

