package bronzeAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P004_�ּ��ִ� {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int[] arr = new int[num]; 
	        
	        for(int i=0; i<arr.length; i++){
	        	arr[i]=sc.nextInt(); 
	        }
	        
	        //�迭�� ������������ ���� �� �ִ� �޼���
	        Arrays.sort(arr);
	        System.out.print(arr[0]+" "+arr[arr.length-1]);
		
	}

}
