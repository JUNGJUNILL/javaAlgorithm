package leetCode.Arrays;

import java.util.Arrays;

//Merge Sorted Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
public class P005_어렵 {

	
	public static void merge(int[] nums1, int m, int[] nums2, int n) { 
		
		for(int i=0; i<n; i++){
			nums1[i+m] = nums2[i];
		}
		Arrays.sort(nums1);
		
		
		
		
		
		
		
		for(int i : nums1){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	public static void func001(int[] nums1, int m, int[] nums2, int n){
		
		int j=0; 		
		for(int i=0; i<nums1.length; i++){
			
			if(m==0){
				nums1[j] = nums2[i]; 
				j++; 
			}
			// nums1 = {0} , m=0
			// nums2 = {1} , n=1 일 경우 
			
			if(m!=0 && i>=m){
				nums1[i] = nums2[j];
				j++; 
			}
			
			
			
			

		}
		 Arrays.sort(nums1);	
		 

		 
		 
		
		for(int i : nums1){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {

		int[] arr1={1,2,3,0,0,0};
		int[] arr2={2,5,6};
		//원하는 값 
		//1 2 3 2 5 6
		
		//merge(arr1,3,arr2,3); 
		func001(arr1,3,arr2,3); 
		
		
	}

}
