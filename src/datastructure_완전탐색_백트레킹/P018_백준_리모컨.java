package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.*;


public class P018_����_������ {

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
				//�������
				if(arr[i]==disArr[j]){
					disabledNum=arr[i];
					break;
				}
				
				
			}
			
			hello++;
		}
		
		System.out.println(hello+" : "+disabledNum);
	
		
		
		
	    
	    //������ Ȯ���� �����ߴ�. 
	    
	    //���峭 ��ư�� ���ٸ� �׳� ������ �ڸ����� �����ϸ� �ȴ�. 
	    //100�� ���� �׳� 0�� �����ϸ� �ȴ�. 
	    
	    //5457�� ��� 
	    
	    //���峪�� ���� ����
	    //0 1 2 3 4 5 9 

	    
	   
		
	}

}
