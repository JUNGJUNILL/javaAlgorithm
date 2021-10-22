package codility;

public class P001_Array {

	public static void main(String[] args) {

		int[] A = new int[5]; 
		A[0]=3;
		A[1]=8;
		A[2]=9;
		A[3]=7;
		A[4]=6;
		
		int[] ACopy=new int[5]; 
		

		for(int i=0; i<3; i++){	
			
			for(int j=0; j<A.length; j++){
				if(j > 0){
					//1 2 3 4
					//0 1 2 3
					ACopy[j]=A[j-1]; 
				}else{
					ACopy[j] = A[A.length-1]; 	
				}
			}
			
			for(int k=0; k<A.length; k++){
				A[k] = ACopy[k]; 
			}
		}
			
			for(int i=0; i<ACopy.length; i++){
				System.out.println(A[i]);	
			}
			
			
			
	
		
	
		
	}

}
