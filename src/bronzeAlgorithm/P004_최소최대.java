package bronzeAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P004_최소최대 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int[] arr = new int[num]; 
	        
	        for(int i=0; i<arr.length; i++){
	        	arr[i]=sc.nextInt(); 
	        }
	        
	        //배열을 오름차순으로 정렬 해 주는 메서드
	        Arrays.sort(arr);
	        System.out.print(arr[0]+" "+arr[arr.length-1]);
		
	}

}
