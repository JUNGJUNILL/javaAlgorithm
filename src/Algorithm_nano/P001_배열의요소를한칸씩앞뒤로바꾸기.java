package Algorithm_nano;

public class P001_배열의요소를한칸씩앞뒤로바꾸기 {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5}; 
		

		
		int K = 2;
		
		//K칸씩 뒤로 밀어보자
		
		//K=1;
		//{2,3,4,5,1} 
		
		//K=2;
		//{3,4,5,1,2}
		int[] newArray01 = new int[array.length]; 	

		//K번 배열의 마지막 요소를 앞 요소로 바꿔보자.
		
		//k=1;
		//{5,1,2,3,4}
		
		//k=2;
		//{4,5,1,2,3}
		int[] newArray02 = new int[array.length]; 
		
		for(int i=0; i<array.length; i++){
			
			int index = (K+i) % array.length; 
			newArray01[i] = array[index];
			newArray02[index]=array[i]; 
			
		}
		
		for(int n : newArray01){
			System.out.print(n);
		}
		System.out.println();
		System.out.println("======================");
		
		
		for(int n : newArray02){
			System.out.print(n);
		}
		
	}
}
