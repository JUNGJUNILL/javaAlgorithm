package javaOOP;

import java.util.Arrays;

//Java의 일반적인 정렬기준에 대해 알고가야 할 필요가 있다. 
//대부분의 언어도 마찬가지지만, Java의 정렬은 특별한 정의가 되어있지 않은 한 '오름차순'을 기준으로 한다. 

//예를들어 {1,3,2} 배열이 있다고 가정해 보자. 
//우리가 최종적으로 얻어야할 배열 {1.2.3}을 얻기 위해 정렬 알고리즘을 사용하게 될 것이다. 
//이 때, 정렬을 하기 위해 두 원소를 비교 하게 될 것 아닌가? 정렬 메소드에서 두 수를 비교하기 위해
//index 0 , index 1 원소를 비교한다고 가정 해 보자. 
//선행 원소인 1과 후행 원소인 3의 경우 대소 관계는 1<3이다. 

//앞서 선행 원소와 후행 원소를 비교 할 때, 얼마큼 차이가 나는지를 반환한다고 했다. 
//return o1 - o2 
//return  1  - 3   음수

//이 때, 자바에서는 오름차순을 디폴트 기준으로 삼고 있다고 했다. 이 말은 선행 원소가 후행 원소보다 '작다'는 뜻이다. 
//즉, compareTo(o1) , compare(o1,o2)를 사용하여 객체를 비교 할 경우 "음수가 나오면 두 원소의 위치를 바꾸지 않는다는 것" 이다. 

//index 1, index 2 원소를 비교 해 보자. 
//return 3 > 2   양수 
//이 말은 선행 원소가 후행 원소 보다 크다는 의미이다. 
//즉, compareTo(o1) , compare(o1,o2) 를 사용하여 객체를 비교 할 경우 "양수가 나오면 두 원소의 위치를 바꾼다는 것" 이다. 
//그러면 {1,2,3} 으로 오름차순으로 정렬 될 것이다. 

//★
//음수 일 경우 : 두 원소의 위치를 교환 안함 
//양수 일 경우 : 두 원소의 위치를 교환 함

public class P009_Comparable_Comparator_Sort {

	public static void main(String[] args) {
		
		MyInteger01[] arr = new MyInteger01[10]; 
		
		for(int i=0; i<arr.length; i++){
			arr[i] =new MyInteger01((int)(Math.random()*100)); 
		}
		
		System.out.print("정렬 전 ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].value+" ");
		}
		
		System.out.println();
		Arrays.sort(arr);
		System.out.print("정렬 후 ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].value+" ");
		}
		
		
		

	}

}

class MyInteger01 implements Comparable<MyInteger01>{
	
	int value; 
	
	public MyInteger01(int value){
		this.value = value; 
	}
	
	
	@Override
	public int compareTo(MyInteger01 o) {
		return this.value - o.value;
	}
	
}
