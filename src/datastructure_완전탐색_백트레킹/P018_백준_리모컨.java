package datastructure_완전탐색_백트레킹;

import java.util.*;


public class P018_백준_리모컨 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int N=5457;//sc.nextInt(); 
		int count=3;//sc.nextInt(); 
		int temp=0; 
		Stack<Integer> stack=new Stack<>(); 
		while(N>0){
			int index =N%10; 
			stack.push(index); 
			N/=10; 
			temp++; 
		}
		
		int[] arr=new int[temp]; 
		for(int i=0; i<arr.length; i++){
			arr[i]=stack.pop(); 
		}
		
		int[] disArr={6,7,8}; //new int[count]; 
//		for(int i=0; i<disArr.length; i++){
//			disArr
//		}
		int disabledNum=0; 
		int hello=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<disArr.length; j++){
				//고장검증
				if(arr[i]==disArr[j]){
					disabledNum=arr[i];
					break;
				}
				
				
			}
			
			hello++;
		}
		
		System.out.println(hello+" : "+disabledNum);
	
		
		
		
	    
	    //문제는 확실히 이해했다. 
	    
	    //고장난 버튼이 없다면 그냥 숫자의 자리수를 리턴하면 된다. 
	    //100인 경우는 그냥 0을 리턴하면 된다. 
	    
	    //5457인 경우 
	    
	    //고장나지 않은 숫자
	    //0 1 2 3 4 5 9 

	    
	   
		
	}

}
