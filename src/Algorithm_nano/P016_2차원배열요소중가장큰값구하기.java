package Algorithm_nano;

public class P016_2차원배열요소중가장큰값구하기 {

	public static void main(String[] args) {

		
		int[][] arr={{99},{2},{3},
					 {4},{5},{6},
				      {7},{8},{9}};

		int ans=0; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(ans<arr[i][j]){
					ans = arr[i][j]; 
				}
			}
		}
		System.out.println(ans);
		
	}

}
