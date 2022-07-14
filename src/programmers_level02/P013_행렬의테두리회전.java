package programmers_level02;

public class P013_행렬의테두리회전 {
	
	
    public static int[] solution(int rows, int columns, int[][] queries) {
    	
    	
    	
    	
    	
    	
    	
    	
        int[] answer = {};
        return answer;
    }

	public static void main(String[] args) {

		//2차원 배열의 요소를 어떻게 한바퀴 돌릴 수 있을까?
		int[][] array = {{1,2},{3,4}}; 
		System.out.println(array[1][0]+" "+array[0][0]+"\n"+
											array[1][1]+" "+array[0][1]);
		int k=1; 
		for(int i=0; i<array.length; i++){
	
			for(int j=0; j<array[i].length; j++){

			
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
