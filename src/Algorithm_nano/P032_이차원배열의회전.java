package Algorithm_nano;

public class P032_이차원배열의회전 {

	public static void main(String[] args) {
		//2차원 배열의 요소를 어떻게 한바퀴 돌릴 수 있을까?
		int[][] array = {{1,2},{3,4}}; 
			
		for(int i=0; i<array.length; i++){
	
			for(int j=0; j<array[i].length; j++){	
				
				
				System.out.print(array[i][j]+" ");
			
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(array[1][0]+" "+array[0][0]+"\n"+
										   array[1][1]+" "+array[0][1]);
		
	}

}
