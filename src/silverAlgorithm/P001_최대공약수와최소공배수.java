package silverAlgorithm;

import java.util.Scanner;

public class P001_�ִ��������ּҰ���� {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2609
		// �ִ�������, https://calcproject.tistory.com/225
		// �ּҰ������, https://ko.khanacademy.org/math/cc-sixth-grade-math/cc-6th-factors-and-multiples/cc-6th-lcm/a/least-common-multiple-review

		//��������, ����� ���� �� �־����. 
		
		Scanner sc  = new Scanner(System.in);
//		int a =sc.nextInt();//24;
//		int b =sc.nextInt();//18;  
		int a =24;
		int b =  18;
		String aa=""; 
		String bb=""; 

		//a�� ��� 
		for(int i=1; i<=a; i++){
			if(a % i ==0){
			aa = aa+Integer.toString(i)+","; 
			}
		}
		String[] Aarray=aa.split(","); 
		
		//b�� ��� 
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
		//�ִ� ����� 
		System.out.println(Integer.parseInt(abc));
		
		//�ּ� ����� 
		//�ּҰ���� = 0�� �ƴ� �� ���� �� / �� ���� �ִ����� 
		System.out.println((a*b) / Integer.parseInt(abc));


		}
}
