package Algorithm_basic_Top10;

import java.util.Arrays;
import java.util.Scanner;


public class ����Ž��02 {
	
	public static int binarySearch(int[] arr, int key){
		
		int start = 0; 
		int end =arr.length-1; 
		
		
		while(start<=end){
			
			int mid = (start+end) / 2; 
			
			if(key < arr[mid]){
				
				end = mid-1; 
				
			}else if(key > arr[mid]){
				
				start = mid+1; 
				
			}else{
				
				//�� mid���� ��ȯ�ϴ°ɱ�?
				//�� arr[mid]�� ��ȯ�ϸ� �ȵǴ� ���ΰ�?
				//�� ������ �ش� �迭�� {-1,0,1} �̷��� 
				//������ ���� �� �� �ֱ� �����̴�.
				//-1�� ã�ԵǸ� -1�� ��ȯ�ϰ� ������
				//mid�� ��ȯ�ϰ� �Ǹ� mid�� 0�̹Ƿ�
				//mid�� �ּҰ��� 0�̵ǰ� ����� ������ 
				//���� �� ���� �����̱� �����̴�.
				return mid; 
			}
			
			
		}
		
		//�ش� ���� ���� ��� -1�� ��ȯ�Ѵ�.
		return -1; 
	}
	
	//https://www.acmicpc.net/problem/1920
	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt(); 
		
		int[] arr = new int[num]; 
		
		for(int i=0; i<num; i++){
			
			arr[i]=sc.nextInt(); 
		}
		Arrays.sort(arr);
		
		int num02 =sc.nextInt(); 
		StringBuffer sb =new StringBuffer(); 
		
		for(int i=0; i<num02; i++){
			
			if(binarySearch(arr, sc.nextInt()) >= 0 ){
				sb.append(1).append("\n"); 
			}else{
				sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	
	
}
