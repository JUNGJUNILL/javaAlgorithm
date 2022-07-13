package Algorithm_nano;

import java.util.ArrayList;
import java.util.List;

public class P030_투포인터 {

	//정수 a가 주어졌다. 
	//배열 요소의 합이 a 인 경우가 있으면 true 없으면 false를 반환하는 함수를 작성하시오.
	// {1,2,3,4,5}; 
	// https://hongjuzzang.github.io/cs/two_pointers/
	public static boolean func001(int[] arr, int a){
		
		int left=0; 
		int right = arr.length-1; 
		int result=0; 
		while(left < right){
			
			if(arr[left] + arr[right] == a){
				return true; 
			
			}else if(arr[left] + arr[right] > a){
				right--; 
				
			}else{
				left++;
				
			}
			
			
		}
		
		//{1,2,3,4,5}; 
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
		System.out.println(result);
		return false; 
	}
	
	
	//수열
	//슬라이딩 윈도우
	//https://www.acmicpc.net/problem/2559
	public static int func002(int[] arr, int b){
		// a : 4 
		// b : 2 
		// {1,2,3,4}
		
		int a = arr.length;
		
		int start =0; 
		int end=b; 
		
		int sum=0; 
		int ans =0; 
		
		for(int i=0; i<end; i++){
			sum+=arr[i]; 
			
		}
		
		ans =sum; 
		// 3
		
		while(end<a){
			
			sum=sum-arr[start++]; 
			sum=sum+arr[end++]; 			
			ans = Math.max(sum, ans); 
			
		}		
		//1,2,3,4
		//right <  a (2 < 4 true)
		//sum = 3-arr[left++] (1) left=1, sum=2 
		//sum = 2+arr[right++] (3) right=3 , sum=5
		//ans= 5 
		
		//right < a (3 < 4 true)
		//sum = 5-arr[left++] (2) left=2, sum=3 
		//sum = 3+arr[right++] (4) right=4, sum=7
		//ans = 7 
		
		//4 < 4 false;
		
		return ans;
	}

	
	//수들의 합2 
	//특정한 합을 가지는 부분 연속 수열 찾기 
	//https://www.acmicpc.net/problem/2003
	public static int func003(int[] arr, int a){
		
		//start, end index를 0으로 초기화 시킨다.
		int start=0; 
		int end=0;  
		
		
		int sum=0; 
		int count=0; 
		
		while(true){
			
			if(sum>=a){ //sum이 a보다 크거나 같으면 start를 1 증가시킨다. 
				sum=sum-arr[start++]; 
				
			}else if(end==arr.length){ //모두 순회했으면 break로 while문을 벗어난다.
				break;
				
			}else{ //sum이 a보다 작거나 같으면 end를 1 증가시킨다.
				sum=sum+arr[end++]; 				
				
			}
			
			//sum이 a와 같다면 카운트 한다.
			if(sum==a){
				count++; 
			}
			
		}
		
	
		
		//arr = 1,1,1,1  a=2
		//첫번째 while else
		//sum = sum+arr[0] end=1 , sum=1 
		
		//두번째 while if
		//sum = sum+arr[1] end=2 , sum=2 count++ (1)
		
		//세번재 while if
		//sum = sum-arr[0] start=1, sum=1 
		
		//네번째 while else 
		//sum = sum+arr[2] end=3 , sum=2 count++ (2)
		
		//다섯번째 while  if
		//sum = sum-arr[1] start=2, sum=1 
		
		//여섯번째 while 
		//sum = sum+arr[3] end=4, sum=2 count++ (3) 
		
		//일곱번째 while 
		//end == arr.length break;
		
		
		
		
		return count;
	}
	
	
	
	//구간 합 빠르게 계산하기
	//{10,20,30,40,50} 
	public static int func004(int[] arr, int left, int right){
		int summary=0; 
		List<Integer> list = new ArrayList<>();  
		list.add(0); 
		
		for(int i : arr){
			summary+=i; 
			list.add(summary); 
		}

		int count = list.get(right) - list.get(left-1); 
		
		return count;
	}
	
	
	//투포인터를 활용하여 문자열 바꾸기
	public static void func005(char[] s){
		int start=0; 
		int end=s.length-1; 
		
		while(start<end){
			
			char first = s[start]; 
			s[start] = s[end]; 
			s[end] = first; 
			
			start++;
			end--;
		}
		
		for(char c : s){
			System.out.print(c);
		}
		
	}

	
	
	public static void main(String[] args) {
//		
		int[] arr={1,2,3,4}; 
//		System.out.println(func002(arr,2));
//		
//		
//		int[] arr1={1,1,1,1}; 
//		int[] arr2 ={1,2,3,2,5};
//		System.out.println(func003(arr1,2));
		
		//특정한 합을 가지는 부분 연속 수열의 갯수 
		int[] arr2={1,2,3,2,5}; 
		System.out.println(func003(arr2,5));
		
		//구간합 
		int[] arr3 ={10,20,30,40,50}; 
		System.out.println(func004(arr3,1,3));

		
		String str = "정준일"; 		
		func005(str.toCharArray()); 
		
		
	}

}
