package Algorithm_nano;

public class P024_���������������ϱ� {

	//hint 
	//���� ���� �� �迭�� index ���� ���ؾ� �Ѵ�. 
	
	//https://programmers.co.kr/learn/courses/30/lessons/12935
	public static void main(String[] args) {
		
		
		
		
		

		
		
		int[] array={1,4,2,3}; 
		
		int minIndex=0; 
		for(int i=0; i<array.length; i++){
			if(array[minIndex] > array[i]){
				minIndex=i; 
				
			}
			
		}
		
		int[] newArray=new int[array.length-1]; 
		int count=0; 
		for(int i=0; i<array.length; i++){
			if(array[minIndex]==array[i]) continue; 
			newArray[count]=array[i];
			count++; 
		}
		
		for(int i : newArray){
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
