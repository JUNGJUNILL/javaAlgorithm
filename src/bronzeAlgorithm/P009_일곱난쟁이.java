package bronzeAlgorithm;

import java.util.Arrays;

public class P009_일곱난쟁이 {

	public static void main(String[] args) {

		int[] arr =   {20,7,23,19,10,15,25,8,13}; 
		int sum = 0;  //140
		boolean check= false; 
		
		for(int i=0; i<arr.length; i++){
			sum= sum+arr[i]; 
		}
		
		for(int i=0; i<arr.length; i++){
			if(check)break; 
			
			for(int j=0; j<arr.length; j++){
				if(i==j)continue; 
				if(sum-arr[j]-arr[i] == 100){
					System.out.println("정답== "+arr[i]+ " : " + arr[j]);
					arr[i]=0;
					arr[j]=0;
					check=true;
					break;
				}
				//true인 경우 continue가 실행되어 continue 하단 코드가 실행이 안됨 
				//{20,7,23,19,10,15,25,8,13}
				//i     j
				//0 <-> 1,2,3,4,5,6,7,8
				//140 -20-7      =113
				//140 -20-23     =93
				//140 -20-19     =101
				//140 -20-10     =110
				//140 -20-15     =105
				//140 -20-25     =95
				//140 -20-8      =112
				//140 -20-13     =107
			
				
				//1 <-> 0,2,3,4,5,6,7,8
				//....
				
				
				//3 <-> 0,1,2,4,5,6,7,8
				//....
				
				//정답....
				//i=5 , j=6
				//140 -15-25 == 100 
				
			}
			
		}
		
		Arrays.sort(arr);
		for(int i =0;i<9;i++) {
			if(arr[i]!=0){
				System.out.println(arr[i]);
			}
		}
		
	}

}
