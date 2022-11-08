package Algorithm_nano;

import java.util.ArrayList;

public class P004_�Ҽ��Ǻ� {
	
	public static void isPrime(int x){
		
		//0�� 1�� �Ҽ��� �ƴմϴ�.
		if(x < 2)return; 
		if(x == 2){System.out.println("2�� �Ҽ��Դϴ�.");return;}
	
		for(int i=2; i<x; i++){
			if(x % i == 0){
				return; 
			}
		}
		
		System.out.println("�Ҽ� �Դϴ�.");
	}
	
	//�����佺�׳׽��� ä
	//�Ҽ��� ������� �Ҽ��� �ƴϴ� ��� ������ �̿�. 
	static ArrayList<Integer> list=new ArrayList<>(); 
	static int isPrime02(int x){
		
		int[] array=new int[x+1];
		
		int count=0; 
		
		for(int i=2; i<=x; i++){
			
			if(array[i]==0){
				
				for(int j=2; j*i<=x; j++){
					array[i*j]=j; 
				}
				list.add(i); 
				count++; 
			}
		}
		
		return count;
		
		
	}

	
	public static void main(String[] args) {

		isPrime(3);
		
		int isPrimeCount=isPrime02(1000); 
		System.out.println("�Ҽ��� ����="+isPrimeCount);
		for(int i : list){
			System.out.println(i);
		}
		
		
	}
}
