package javaOOP;

import java.util.Arrays;
import java.util.Comparator;

public class P010_Comparable_Comparator_Sort {

	public static void main(String[] args) {

		MyInteger02[] arr = new MyInteger02[10]; 
		
		for(int i=0; i<arr.length; i++){
			arr[i] =new MyInteger02((int)(Math.random()*100)); 
		}
		
		System.out.print("정렬 전 ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].value+" ");
		}
		
		System.out.println();
		
		//★
		Arrays.sort(arr,comp1);
		
		System.out.print("정렬 후 ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].value+" ");
		}
		
	}
	
	public static Comparator<MyInteger02> comp1 = new Comparator<MyInteger02>() {
		
		@Override
		public int compare(MyInteger02 o1, MyInteger02 o2) {
			
			//오름차순 정렬
			//return o1.value - o2.value;
			
			//내림차순 정렬
			return o2.value- o1.value;
		}
	};

}


class MyInteger02{
	
	int value; 
	
	public MyInteger02(int value){
		this.value = value;
	}
}

