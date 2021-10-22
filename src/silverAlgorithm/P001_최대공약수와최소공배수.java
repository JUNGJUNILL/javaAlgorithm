package silverAlgorithm;

import java.util.Scanner;

public class P001_최대공약수와최소공배수 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2609
		// 최대공약수란, https://calcproject.tistory.com/225
		// 최소공배수란, https://ko.khanacademy.org/math/cc-sixth-grade-math/cc-6th-factors-and-multiples/cc-6th-lcm/a/least-common-multiple-review

		//선행지식, 약수를 구할 수 있어야함. 
		
		Scanner sc  = new Scanner(System.in);
//		int a =sc.nextInt();//24;
//		int b =sc.nextInt();//18;  
		int a =24;
		int b =  18;
		String aa=""; 
		String bb=""; 

		//a의 약수 
		for(int i=1; i<=a; i++){
			if(a % i ==0){
			aa = aa+Integer.toString(i)+","; 
			}
		}
		String[] Aarray=aa.split(","); 
		
		//b의 약수 
		for(int i=1; i<=b; i++){
			
			if(b % i ==0){
				bb = bb+Integer.toString(i)+","; 
			}	
			
		}
		
		String[] Barray=bb.split(",");
		String cc=""; 
		
		for(int i=0; i<Aarray.length; i++){
			
			for(int j=0; j<Barray.length; j++){
				if(Aarray[i].equals(Barray[j])){
					cc=cc+Barray[j]+",";
				}
			}
			
		}
		
		String abc =cc.split(",")[cc.split(",").length-1]; 
		//최대 공약수 
		System.out.println(Integer.parseInt(abc));
		
		//최소 공배수 
		//최소공배수 = 0이 아닌 두 수의 곱 / 두 수의 최대공약수 
		System.out.println((a*b) / Integer.parseInt(abc));


		}
}
