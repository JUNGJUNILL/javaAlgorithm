package basicAlgorithm;
import java.util.*;

public class P014_�Ҽ�ã�� {
	
	public static int solution(int[] array){
		
		//����� ���� ���ϴ°� ������ ��Ƴ�; 
		//1,2,3,4 ���� 
		//�� ����� ���� ���ϴ� ������ ������ �ϴµ�... �� �𸣰ڴ� ������,, 
		//��Ģ���� ã��.... ������ �غ���...
		
		//1 = 2,3  6
		//1 = 2,4  7
		//1 = 3,4  8
		
		//2 = 1,3  6
		//2 = 1,4  7
		//2 = 3,4  9
		
		//3 = 1,2  6
		//3 = 1,4  8
		//3 = 2,4  9
		
		//4 = 1,2  7
		//4 = 1,3  8
		//4 = 2,3  9
		
		
		return 0; 
	}
	
	public static boolean isPrime(int num){
		if(num < 2){return false;} //0�� 1�� �Ҽ��� �ƴϴ�. 
		if(num == 2){return true;} //2�� �Ҽ��Դϴ�. 
		
		for(int i=2; i<num; i++){
			if(num%i==0){return false;}
		}
		return true; 
	}
	
	//https://programmers.co.kr/learn/courses/30/lessons/12977
	public static void main(String[] args) {

		int[] array = new int[4]; 
		for(int i=0; i<array.length; i++){
			array[i]=i+1;
		}
		
		boolean check =false; 
		int answer =0; 
		
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
				for(int k=j+1; k<array.length; k++){
				int number = array[i]+array[j]+array[k];	
				
					if(isPrime(number)){
						answer=answer+1; 
					}
				}
				
			 
			}
		}
		
		System.out.println(answer);
		
		
		
	}

}
