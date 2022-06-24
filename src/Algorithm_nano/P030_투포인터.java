package Algorithm_nano;

public class P030_투포인터 {

	//정수 a가 주어졌다. 
	//배열 요소의 합이 a 인 경우가 있으면 true 없으면 false를 반환하는 함수를 작성하시오.
	// {1,2,3,4,5}; 
	// https://hongjuzzang.github.io/cs/two_pointers/
	public static boolean func001(int[] arr, int a){
		
		int left=0; 
		int right = arr.length-1; 
		
		while(left < right){
			
			if(arr[left] + arr[right] == a){
				return true; 
			
			}else if(arr[left] + arr[right] > a){
				right--; 
				
			}else{
				left++;
				
			}
			
			
		}
		
		//a가 9로 주어졌다면..
		
		// 0 < 4 true 
		// arr[0] (1) + arr[4] (5) (6) false 
		// arr[0] (1) + arr[4] (5) > (6) false 
		// left++; 
		
		// 1< 4 true 
		// arr[1] (2) + arr[4] (5) (7) false 
		// arr[1] (2) + arr[4] (5) > (7) false 
		// left++; 
		
		// 2 < 4 true 
		// arr[2] (3) + arr[4] (5) (8) false 
		// arr[2] (3) + arr[4] (5) false (8) false 
		// left++; 
		
		// 3 < 4 true 
		// arr[3] (4) + arr[4] (5) true  
 
		return false; 
	}
	
	
	public static int func002(int[] arr, int a){

	}
	
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5}; 
		System.out.println(func001(arr,9));
	 
		
		

		
	}

}
