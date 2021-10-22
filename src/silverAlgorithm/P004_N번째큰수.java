package silverAlgorithm;

public class P004_N번째큰수 {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/2693
		//정렬 하는 방법을 배워야 한다. 
		//selectionSort 
		
		int[] array = {5,4,3,2,1}; 
		selectionSort(array); 

	}
	
	public static void selectionSort(int [] array){
		
		int indexMin=0,temp=0; 
		for(int i=0; i<array.length; i++){
			indexMin=i; 
			for(int j=i+1; j<array.length; j++){
				if(array[j]<array[indexMin]){
					indexMin = j; 
				}
			}
			
			temp=array[indexMin]; 
			array[indexMin]=array[i]; 
			array[i] = temp; 
			
		}
		
		//indexMin= i = 0
			//array[j:1]<array[indexMin:0]
			//4       < 5   true   indexMin = 1 
		    //array[j:2]<array[indexMin:1]
		    //3       < 4   true   indexMin = 2
		    //array[j:3]<array[indexMin:2]
		    //2       < 3   true   indexMin = 3
		    //array[j:4]<array[indexMin:3]
		    //1       < 2   true   indexMin = 4
			
			//temp=array[4] , temp = 1
		    //array[4] = array[0] = 5
		    //array[0] = temp = 1
		    //배열의 형태 {1,4,3,2,5}
		
		
		//indexMin= i = 1
			//array[j:2]<array[indexMin:1]
			//3       < 4   true   indexMin = 2
		    //array[j:3]<array[indexMin:2]
		    //2       < 3   true   indexMin = 3
		    //array[j:4]<array[indexMin:3]
		    //5       < 2   false  indexMin = 3		
		
			//temp=array[3] , temp = 2
		    //array[3] = array[1] = 4
		    //array[1] = temp = 2
		    //배열의 형태 {1,2,3,4,5}
			
		
		//indexMin= i = 2
			//array[j:3]<array[indexMin:2]
			//4       < 3   false   indexMin = 2
		    //array[j:4]<array[indexMin:2]
		    //5       < 3   false   indexMin = 2
	
			//temp=array[2] , temp = 3
		    //array[2] = array[2] = 3
		    //array[2] = temp = 3
		    //배열의 형태 {1,2,3,4,5}
		
		
		//indexMin= i = 3
			//for(int i=4; i<array.length i++){
			//  for문이 실행이 안된다. 
			//}
			//array[j:3]<array[indexMin:2]
			//4       < 3   false   indexMin = 2
		    //array[j:4]<array[indexMin:2]
		    //5       < 3   false   indexMin = 2

			//temp=array[2] , temp = 3
		    //array[2] = array[2] = 3
		    //array[2] = temp = 3
		    //배열의 형태 {1,2,3,4,5}
			
			
		
		
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
	}
	
	
	
	
	
	
	
	

}
