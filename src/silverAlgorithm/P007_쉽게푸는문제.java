package silverAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class P007_쉽게푸는문제 {

	public static void main(String[] args) {

	
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		//[1,2,2,3,3,3]
		
		
		int num = 1; 
		int count = 0; 
		
		for(int i=0; i<1000; i++){
			arr.add(num); 
			count = count+1; 
			
			
			//1==1 true  [1]
			//2==1 false [1,2]
			//2==2 true  [1,2,2] 
			//3==1 false [1,2,2,3]
 			//3==2 false [1,2,2,3,3]
			//3==3 true  [1,2,2,3,3,3]
			//4==1 false [1,2,2,3,3,3,4]
			//4==2 false [1,2,2,3,3,3,4,4]
			//4==3 false [1,2,2,3,3,3,4,4,4]
			//4==4 true  [1,2,2,3,3,3,4,4,4,4]
			//5==1 false [1,2,2,3,3,3,4,4,4,4,5]
			//......
			if(num==count){
				num=num+1;
				//num=2 
				//num=3
				//num=4
				//num=5
				
				count = 0;
				//count =0;
				//count =0;
				//count =0;
				//count =0; 
			}
			
		}
		
		//2 4  == 7 
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0; 
		
		for(int i=num1-1; i<=num2-1; i++){
			//for int i=1 i<3; i++
			sum = sum+arr.get(i); 
			
		}
		
		System.out.println(sum);
		
		
		
	}



}
