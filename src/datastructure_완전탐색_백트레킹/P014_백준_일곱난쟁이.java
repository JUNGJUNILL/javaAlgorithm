package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.Arrays;
import java.util.Scanner;

public class P014_����_�ϰ������� {
	


	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in); 
		 int n=9; 
		 int[] a=new int[n]; 
		a[0]=20;
		a[1]=7;
		a[2]=23;
		a[3]=19;
		a[4]=10;
		a[5]=15;
		a[6]=25;
		a[7]=8;
		a[8]=13;
		int sum=0; 
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		 Arrays.sort(a);
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				/*
				 for 9 
					0 for 1~9 8��  
					1 for 2~9 7�� 
					2 for 3~9 6�� 
					3 for 4~9 5��
					4 for 5~9 4��
					5 for 6~9 3��
					6 for 7~9 2��
					7 for 8~9 1�� 
					8 for 9~9 ����ȵ�
				 */
				
				if(sum-a[i]-a[j]==100){ //a[i] , a[j] �̳���� �����̴�.
					for(int k=0; k<n; k++){
						if(i==k || j==k) continue; 
						System.out.println(a[k]);
					}
					break; 
				}
			}
		}
		System.out.println("======================");
		
		boolean check=false; 
		for(int i=0; i<n; i++){
			
			if(check)break; 
			for(int j=0; j<n; j++){
			
				if(i==j) continue; 
				if(sum-(a[i]+a[j])==100){
					for(int k=0; k<n; k++){
						if(i==k || j==k)continue; 
						System.out.println(a[k]);
					}
					check=true; 
					break; 
				}
			}
		}
		System.out.println("======================");

		
		 
	
		 
		
	}

}
