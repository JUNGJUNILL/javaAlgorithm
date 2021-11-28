import java.util.*;


public class Practice {
	
	static int[] solution(int[] array, int[][] commands){
		int[] answer=new int[commands.length]; 
		int[] newArray;
		
		for(int i=0; i<commands.length; i++){
			
			int arrayLength=commands[i][1]-(commands[i][0]-1); 
			newArray=new int[arrayLength]; 
			for(int j=commands[i][0]-1,k=0; j<commands[i][1]; j++,k++){
				newArray[k]=array[j]; 
			}
			Arrays.sort(newArray);
			
			for(int a=0; a<newArray.length; a++){
				if(commands[i][2]-1==a){
					answer[i]=newArray[a]; 
				}
			}
				
			
		}
		
		return answer; 
	}
	
	public static void main(String[] args) {
		
		int[] array={1,5,2,6,3,7,4};
		int[][] commands={{2,5,3},{4,4,1},{1,7,3}}; 
		int i=2; 
		int j=5;
		int k=3; 
		
//		int arrayLength=j-(i-1); 
//		int[] newArr = new int[arrayLength];
//		
//		for(int s=i-1,l=0; s<j; s++,l++){
//			newArr[l]=array[s]; 
//			
//		}
//		Arrays.sort(newArr);
//		for(int a=0; a<newArr.length; a++){
//			
//			if(k-1==a){
//				System.out.println(newArr[a]);
//			}
//			
//		}
		

		for(int n : solution(array,commands)){
			System.out.println(n);
		}
		
		
		
	}
}




