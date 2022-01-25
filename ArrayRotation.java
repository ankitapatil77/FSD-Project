package src.com.javaProgram.Assignment;

public class ArrayRotation {

	public static void main(String[] args) {
		ArrayRotation rotat = new ArrayRotation();
		int arr[] = { 10, 22, 34, 64, 95, 86, 67 }; 
		rotat.rotate(arr, 5); 
		for(int i=0;i<arr.length;i++){
    			System.out.print(arr[i]+" ");
		}
	}
		public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < k; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			result[i] = nums[j];
        			j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
 }
} 



