package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.*;


public class P018_����_������ {

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
	    
	    //������ Ȯ���� �����ߴ�. 
	    
	    //���峭 ��ư�� ���ٸ� �׳� ������ �ڸ����� �����ϸ� �ȴ�. 
	    //100�� ���� �׳� 0�� �����ϸ� �ȴ�. 
	    
	    //5457�� ��� 
	    
	    //���峪�� ���� ����
	    //0 1 2 3 4 5 9 
	    
	    //���峪�� ���� ���ڿ� 
	    
	    
	    
	    for(int n : newArr){
	    	System.out.println(n);
	    }
	    
	    
	    //����ä���� 100�̴�.
	    
	    for(int i=0; i<arr.length; i++){
	    	arr[i]=sc.nextInt();
	    }
	    
	    
		
		
	}

}
