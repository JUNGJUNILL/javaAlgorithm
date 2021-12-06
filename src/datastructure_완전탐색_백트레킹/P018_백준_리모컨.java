package datastructure_완전탐색_백트레킹;

import java.util.*;


public class P018_백준_리모컨 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int N=sc.nextInt(); 
		int count=sc.nextInt(); 
	    int[] arr = new int[10]; 
	    for(int i=0; i<arr.length; i++){
	    	arr[i]=i; 
	    }
	    
	    for(int i=0; i<count; i++){
	    	int index = sc.nextInt(); 
	    	arr[index]=10; 
	    }
	    


	    Stack<Integer> q=new Stack<Integer>(); 
	    
	    int temp=0; 
	    while(N>0){
	    	int index = N % 10; 
	    	q.push(index); 
	    	N /=10; 
	    	temp++; 
	    }
	    
	    int[] newArr=new int[temp]; 
	    for(int i=0; i<temp; i++){
	    	newArr[i]=q.pop(); 
	    }
	    
	    //문제는 확실히 이해했다. 
	    
	    //고장난 버튼이 없다면 그냥 숫자의 자리수를 리턴하면 된다. 
	    //100인 경우는 그냥 0을 리턴하면 된다. 
	    
	    //5457인 경우 
	    
	    //고장나지 않은 숫자
	    //0 1 2 3 4 5 9 
	    
	    //고장나지 않은 숫자와 
	    
	    
	    
	    for(int n : newArr){
	    	System.out.println(n);
	    }
	    
	    
	    //현재채널을 100이다.
	    
	    for(int i=0; i<arr.length; i++){
	    	arr[i]=sc.nextInt();
	    }
	    
	    
		
		
	}

}
