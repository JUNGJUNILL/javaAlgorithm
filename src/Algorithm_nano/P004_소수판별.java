package Algorithm_nano;

import java.util.ArrayList;

public class P004_소수판별 {
	
	public static void isPrime(int x){
		
		//0과 1은 소수가 아닙니다.
		if(x < 2)return; 
		if(x == 2){System.out.println("2는 소수입니다.");return;}
	
		for(int i=2; i<x; i++){
			if(x % i == 0){
				return; 
			}
		}
		
		System.out.println("소수 입니다.");
	}
	
	//에라토스테네스의 채
	//소수의 배수들은 소수가 아니다 라는 명제를 이용. 
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
		System.out.println("소수의 개수="+isPrimeCount);
		for(int i : list){
			System.out.println(i);
		}
		
		
	}
}
