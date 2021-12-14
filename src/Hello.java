import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

import javax.swing.text.Position;

import Algorithm_basic_Top10.DFS;

public class Hello {

	static int temp=0; 
	public static void perm(String[] arr, int pivot, int kind){
		
		if(pivot==kind){
			
			for(int i=0; i<kind; i++){
				System.out.print(arr[i]+" ");
			}
			temp++; 
			System.out.println();
			return; 
		}
		
		for(int i=pivot; i<arr.length; i++){
			swap(arr,i,pivot); 
			perm(arr, pivot+1, kind);
			swap(arr,i,pivot);
		}
		
		
	}
	
	public static void swap(String[] arr,int i , int j){
		String temp=arr[i]; 
		arr[i]=arr[j]; 
		arr[j]=temp; 
	}
	
	
	//3P2
	//3*2
	public static void main(String[] args) {

		String[] arr={"Â¥Àå¸é","Â«»Í","ÅÁ¼öÀ°"}; 
		perm(arr, 0, 3);
		System.out.println(temp);
	}
}
