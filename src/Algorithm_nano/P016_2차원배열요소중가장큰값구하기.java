package Algorithm_nano;

public class P016_2�����迭����߰���ū�����ϱ� {

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
