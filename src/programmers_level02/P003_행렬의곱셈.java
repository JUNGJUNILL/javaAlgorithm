package programmers_level02;

public class P003_Çà·ÄÀÇ°ö¼À {
	
    static int[][] solution(int[][] arr1, int[][] arr2) {

    	int[][] matrix = new int[arr1.length][arr2[0].length];
    	
    		for(int i=0; i<arr1.length; i++){			
    			for(int j=0; j<arr2[0].length; j++){
    				
    				int temp=0; 
    				for(int k=0; k<arr2.length; k++){
    					temp+=arr1[i][k] * arr2[j][k]; 	
    				}
    				
    				matrix[i][j]=temp; 
    				
    			}
    			
    		}		
    	
        
        
        return matrix;
    }

    
    //https://programmers.co.kr/learn/courses/30/lessons/12949
	public static void main(String[] args) {
		
		int[][] a={{1,4},{3,2},{4,1}};
		int[][] b={{3,3},{3,3}}; 

		
		

	}
}
