package bronzeAlgorithm;
import java.util.*;

public class P008_일곱난쟁이 {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/2309
		//브루스포스 : 완전탐색 
		
		//Scanner input  = new Scanner(System.in);
		int N =9; 
		int[] arr = {20,7,23,19,10,15,25,8,13};  
		int sum= 0; 
		boolean check =false; 
		
		for(int i=0; i<N; i++){
			//arr[i] = input.nextInt(); 
			sum = sum +arr[i];
		}
		
		for(int i=0; i<N; i++){
			
			if(check)break; 
			for(int j=0; j<N; j++){
				if(i==j) continue; 
				
				if(sum-(arr[j]+arr[i]) == 100){
					arr[i]=0;
					arr[j]=0;
					check=true;
					break;
				}
			}
			
		}
		
		System.out.println("---------------------------------------");
		Arrays.sort(arr);
		for(int i =0;i<9;i++) {
			if(arr[i]!=0){
				System.out.println(arr[i]);
			}
		}
		

		
	}

}
