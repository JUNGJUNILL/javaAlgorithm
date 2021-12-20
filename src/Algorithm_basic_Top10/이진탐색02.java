package Algorithm_basic_Top10;

import java.util.Arrays;
import java.util.Scanner;


public class 이진탐색02 {
	
	//시간복잡도 O(logN)
	//1,2,3 
	//이런식으로 이진트리는 생성될 것이다... 
	//    2
	//  1  3
	public static int binarySearch(int[] arr, int key){
		
		int start = 0; 
		int end =arr.length-1;
		
		/*
		 
		 [1, 2, 3]
		 key=1
		 
		 start= 0
		 end  =2
		 mid  =1 
		 
		 while
		 start<=end, 0<=2 true
		 (start+end) / 2 mid=1 
		 key < arr[mid] , 1 < 2 true
		 end = mid-1 
		 end = 0  
		 
		 start<=end, 0<=0 true 
		 (start+end) / 2 mid=0 
		 key < arr[mid] 1 < 1 false 
		 key > arr[]mid 1 > 1 false
		 return mid(0) 
		 
		 
		 key=9 
		 
		 start=0;
		 end =2
		 mid =1 
		 
		 while
		 start<=end, 0<=2 true 
		 (start+end) / 2 =mid=1
		 key < arr[mid], 9 < 2 false 
		 key > arr[mid], 9 > 2 true
		 start = mid+1 
		 
		 start<=end, 2<=2 true 
		 (start+end) / 2 , mid=2 
		 9 < arr[mid] , 9 < 3 false 
		 9 > arr[mid] , 9 > 3 true 
		 start = mid+1 
		 
		 start<=end , 3<=2 false 
		 end of while 
		 return -1
		  
		 */
		
		
		while(start<=end){
			
			int mid = (start+end) / 2; 
			
			if(key < arr[mid]){
				
				end = mid-1; 
				
			}else if(key > arr[mid]){
				
				start = mid+1; 
				
			}else{
				
				//왜 mid값을 반환하는걸까?
				//왜 arr[mid]를 반환하면 안되는 것인가?
				//그 이유는 해당 배열이 {-1,0,1} 이렇듯 
				//음수가 들어올 수 도 있기 때문이다.
				//-1을 찾게되면 -1을 반환하게 되지만
				//mid를 반환하게 되면 mid는 0이므로
				//mid는 최소값이 0이되고 절대로 음수가 
				//나올 수 없는 구조이기 때문이다.
				return mid; 
			}
			
			
		}
		
		//해당 값이 없을 경우 -1을 반환한다.
		return -1; 
	}
	
	//https://www.acmicpc.net/problem/1920
	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt(); 
		
		int[] arr = new int[num]; 
		
		for(int i=0; i<num; i++){
			
			arr[i]=sc.nextInt(); 
		}
		Arrays.sort(arr);
		
		int num02 =sc.nextInt(); 
		StringBuffer sb =new StringBuffer(); 
		
		for(int i=0; i<num02; i++){
			
			if(binarySearch(arr, sc.nextInt()) >= 0 ){
				sb.append(1).append("\n"); 
			}else{
				sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	
	
}
