package ����_�˰���_����02_���Ʈ����;

import java.util.Arrays;

public class P001_���Ʈ����1_�ϰ������� {

	
	//http://codeplus.codes/4d5ea4a198e0451cb6c6432825a24b34
	public static void main(String[] args) {
		
		//9���� ������ �߿� 2���� ���ܽ��Ѿ� �Ѵ�. 
		int[] arr = {20,7,23,19,10,15,25,8,13};  
		int[] newArr = new int[9]; 
 
		
		//9���� �����̵��� ���� �ϴ� ���غ���.
		int sum = 0; 
		for(int i : arr){
			sum+=i;
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				
				/*
				0
					1~9 8��
				1
					2~9 7�� 
				2
					3~9 6��
				3
					4~9 5��
				4
					5~9 4��
				5
					6~9 3��
				6
					7~9 2��
				7
					8~9 1��
				8
					9~9 0�� 
				*/
				
				if(sum - arr[i]-arr[j] ==100){					
					for(int k=0; k<arr.length; k++){
						
						
						if(i == k || j== k) continue; //i, j�� �ִ� ����� �����̴�.
						newArr[k]=arr[k]; 
					}	
				}
			}
		}
		
		for(int i : newArr){
			if(i!=0){
				System.out.println(i);	
			}
		}
		
		
		

		
	}
}
