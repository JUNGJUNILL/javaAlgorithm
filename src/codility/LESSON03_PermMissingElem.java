package codility;

import java.util.Arrays;

public class LESSON03_PermMissingElem {

	public static void main(String[] args) {
		/*
		N개의 서로 다른 정수로 구성된 배열 A가 주어집니다. 
		배열에는 [1] 범위의 정수가 포함됩니다.(N + 1)]], 즉, 정확히 하나의 요소가 결측되어 있습니다.

		목표는 누락된 요소를 찾는 것입니다.

		함수 쓰기:

		클래스 솔루션 {public int solution(int[] A); }

		배열 A가 지정되면 결측 요소의 값을 반환합니다.

		예를 들어, 주어진 배열 A는 다음과 같습니다.

		A[0] = 2
		A[1] = 3
		A[2] = 1
		A[3] = 5
		함수는 누락된 요소이므로 4를 반환해야 합니다.

		다음 가정에 대한 효율적인 알고리즘을 작성하십시오.

		N은 [0..] 범위 내의 정수입니다.100,000];
		A의 요소는 모두 구별된다.
		배열 A의 각 요소는 [1] 범위 내의 정수입니다.(N + 1)]
		
		근데 이게.. 시간복잡도 문제란 말이지... 
		중간에 연속되지 않고 하나 빠진 정수가 있는데, 그 빠진 정수가 무엇인지 알아내는 문제이다.. 

		*/
		
		//내가 시도했을 경우 0%
		int[] arr = new int[4]; 
		arr[0]=2;
		arr[1]=3;
		arr[2]=1;
		arr[3]=4;
		Arrays.sort(arr);
		
		int[] newArr = new int[arr.length]; 
		
		for(int j=0; j<arr.length; j++){
			newArr[j] = j+1; 
		}
		
		Arrays.sort(arr); 
		
		for(int i=0; i<newArr.length; i++){
			
			if(arr[i]!=newArr[i]){
				System.out.println(newArr[i]);
			}
			
		}
		
		//100% 
		int temp = arr.length+1; 
		for(int i=0; i<arr.length; i++){
			
			if(i+1 != arr[i]) temp = i+1; 
			
			
		}
		System.out.println(temp);
		
		
	}
	
	
	

}

