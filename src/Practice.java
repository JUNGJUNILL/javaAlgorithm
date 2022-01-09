
import java.util.*; 


public class Practice {

	public static void main(String[] args) {
		
		int[][] arr1={{1,4},
					   {3,2},
					   {4,1}};
	
		int[][] arr2={{3,3},
					   {3,3}}; 
		
		int[][] answer = new int[arr1.length][arr2[0].length]; 
		
		for(int i=0; i<arr1.length; i++){			
			for(int j=0; j<arr2[0].length; j++){
			
				int temp=0; 
				for(int k=0; k<arr2.length; k++){
					temp+=arr1[i][k] * arr2[j][k]; 
				}
				answer[i][j] = temp; 
				
			}
		}
		
		
		for(int i=0; i<answer.length; i++){
			for(int j=0; j<answer[i].length; j++){
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}