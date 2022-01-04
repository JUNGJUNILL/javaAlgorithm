package programmers_level01;

public class P001_Çà·ÄÀÇµ¡¼À {

	 public static int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer =new int[arr1.length][arr1[0].length]; 
	        
	        for(int i=0; i<arr1.length; i++){
	        	for(int j=0; j<arr1[i].length; j++){
	        		answer[i][j]=arr1[i][j] + arr2[i][j]; 
	        	}
	        }
	        
	        
	        return answer;
	}
	
	public static void main(String[] args) {
		
		int[][] arr1={{1},{2}};
		int[][] arr2={{3},{4}};
		
		
		
		//solution(arr1,arr2);
		
		for(int i=0; i<solution(arr1,arr2).length; i++){
			for(int j=0; j<solution(arr1,arr2)[i].length; j++){
				System.out.print(solution(arr1,arr2)[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
