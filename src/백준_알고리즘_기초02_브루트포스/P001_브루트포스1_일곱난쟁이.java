package 백준_알고리즘_기초02_브루트포스;

import java.util.Arrays;

public class P001_브루트포스1_일곱난쟁이 {

	
	//http://codeplus.codes/4d5ea4a198e0451cb6c6432825a24b34
	public static void main(String[] args) {
		
		//9명의 난쟁이 중에 2명을 제외시켜야 한다. 
		int[] arr = {20,7,23,19,10,15,25,8,13};  
		int[] newArr = new int[9]; 
 
		
		//9명의 난쟁이들의 합을 일단 구해보자.
		int sum = 0; 
		for(int i : arr){
			sum+=i;
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				
				/*
				0
					1~9 8번
				1
					2~9 7번 
				2
					3~9 6번
				3
					4~9 5번
				4
					5~9 4번
				5
					6~9 3번
				6
					7~9 2번
				7
					8~9 1번
				8
					9~9 0번 
				*/
				
				if(sum - arr[i]-arr[j] ==100){					
					for(int k=0; k<arr.length; k++){
						
						
						if(i == k || j== k) continue; //i, j에 있는 놈들이 범인이다.
						newArr[k]=arr[k]; 
					}	
				}
			}
		}
		
		for(int i : newArr){
			if(i!=0){
				System.out.println(i);	
			}
		}
		
		
		

		
	}
}
