package Algorithm_nano;

import java.util.ArrayList;
import java.util.List;

public class P030_�������� {

	//���� a�� �־�����. 
	//�迭 ����� ���� a �� ��찡 ������ true ������ false�� ��ȯ�ϴ� �Լ��� �ۼ��Ͻÿ�.
	// {1,2,3,4,5}; 
	// https://hongjuzzang.github.io/cs/two_pointers/
	public static boolean func001(int[] arr, int a){
		
		int left=0; 
		int right = arr.length-1; 
		int result=0; 
		while(left < right){
			
			if(arr[left] + arr[right] == a){
				return true; 
			
			}else if(arr[left] + arr[right] > a){
				right--; 
				
			}else{
				left++;
				
			}
			
			
		}
		
		//{1,2,3,4,5}; 
		//a�� 9�� �־����ٸ�..
		
		// 0 < 4 true 
		// arr[0] (1) + arr[4] (5) (6) false 
		// arr[0] (1) + arr[4] (5) > (6) false 
		// left++; 
		
		// 1< 4 true 
		// arr[1] (2) + arr[4] (5) (7) false 
		// arr[1] (2) + arr[4] (5) > (7) false 
		// left++; 
		
		// 2 < 4 true 
		// arr[2] (3) + arr[4] (5) (8) false 
		// arr[2] (3) + arr[4] (5) false (8) false 
		// left++; 
		
		// 3 < 4 true 
		// arr[3] (4) + arr[4] (5) true  
		System.out.println(result);
		return false; 
	}
	
	
	//����
	//�����̵� ������
	//https://www.acmicpc.net/problem/2559
	public static int func002(int[] arr, int b){
		// a : 4 
		// b : 2 
		// {1,2,3,4}
		
		int a = arr.length;
		
		int start =0; 
		int end=b; 
		
		int sum=0; 
		int ans =0; 
		
		for(int i=0; i<end; i++){
			sum+=arr[i]; 
			
		}
		
		ans =sum; 
		// 3
		
		while(end<a){
			
			sum=sum-arr[start++]; 
			sum=sum+arr[end++]; 			
			ans = Math.max(sum, ans); 
			
		}		
		//1,2,3,4
		//right <  a (2 < 4 true)
		//sum = 3-arr[left++] (1) left=1, sum=2 
		//sum = 2+arr[right++] (3) right=3 , sum=5
		//ans= 5 
		
		//right < a (3 < 4 true)
		//sum = 5-arr[left++] (2) left=2, sum=3 
		//sum = 3+arr[right++] (4) right=4, sum=7
		//ans = 7 
		
		//4 < 4 false;
		
		return ans;
	}

	
	//������ ��2 
	//Ư���� ���� ������ �κ� ���� ���� ã�� 
	//https://www.acmicpc.net/problem/2003
	public static int func003(int[] arr, int a){
		
		//start, end index�� 0���� �ʱ�ȭ ��Ų��.
		int start=0; 
		int end=0;  
		
		
		int sum=0; 
		int count=0; 
		
		while(true){
			
			if(sum>=a){ //sum�� a���� ũ�ų� ������ start�� 1 ������Ų��. 
				sum=sum-arr[start++]; 
				
			}else if(end==arr.length){ //��� ��ȸ������ break�� while���� �����.
				break;
				
			}else{ //sum�� a���� �۰ų� ������ end�� 1 ������Ų��.
				sum=sum+arr[end++]; 				
				
			}
			
			//sum�� a�� ���ٸ� ī��Ʈ �Ѵ�.
			if(sum==a){
				count++; 
			}
			
		}
		
	
		
		//arr = 1,1,1,1  a=2
		//ù��° while else
		//sum = sum+arr[0] end=1 , sum=1 
		
		//�ι�° while if
		//sum = sum+arr[1] end=2 , sum=2 count++ (1)
		
		//������ while if
		//sum = sum-arr[0] start=1, sum=1 
		
		//�׹�° while else 
		//sum = sum+arr[2] end=3 , sum=2 count++ (2)
		
		//�ټ���° while  if
		//sum = sum-arr[1] start=2, sum=1 
		
		//������° while 
		//sum = sum+arr[3] end=4, sum=2 count++ (3) 
		
		//�ϰ���° while 
		//end == arr.length break;
		
		
		
		
		return count;
	}
	
	
	
	//���� �� ������ ����ϱ�
	//{10,20,30,40,50} 
	public static int func004(int[] arr, int left, int right){
		int summary=0; 
		List<Integer> list = new ArrayList<>();  
		list.add(0); 
		
		for(int i : arr){
			summary+=i; 
			list.add(summary); 
		}

		int count = list.get(right) - list.get(left-1); 
		
		return count;
	}
	
	
	//�������͸� Ȱ���Ͽ� ���ڿ� �ٲٱ�
	public static void func005(char[] s){
		int start=0; 
		int end=s.length-1; 
		
		while(start<end){
			
			char first = s[start]; 
			s[start] = s[end]; 
			s[end] = first; 
			
			start++;
			end--;
		}
		
		for(char c : s){
			System.out.print(c);
		}
		
	}

	
	
	public static void main(String[] args) {
//		
		int[] arr={1,2,3,4}; 
//		System.out.println(func002(arr,2));
//		
//		
//		int[] arr1={1,1,1,1}; 
//		int[] arr2 ={1,2,3,2,5};
//		System.out.println(func003(arr1,2));
		
		//Ư���� ���� ������ �κ� ���� ������ ���� 
		int[] arr2={1,2,3,2,5}; 
		System.out.println(func003(arr2,5));
		
		//������ 
		int[] arr3 ={10,20,30,40,50}; 
		System.out.println(func004(arr3,1,3));

		
		String str = "������"; 		
		func005(str.toCharArray()); 
		
		
	}

}
