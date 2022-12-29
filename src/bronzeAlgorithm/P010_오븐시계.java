package bronzeAlgorithm;

import java.util.Scanner;

public class P010_¿Àºì½Ã°è {
	
	public static void func1(int num1, int num2, int num3){
		
		int min = (60*num1)+num2; 
		min+=num3; 
		
		int hour = (min / 60) %24; 
		int minute = min % 60; 
		
		System.out.println(hour + " " + minute);
		
	}
	
	//³»°¡ Ç¬°Å
	//Æ²·È´Ù´Âµ¥ ¹Ý·Ê¸¦ ¸øÃ£°Ú´Ù.
	public static void func2(int num1, int num2, int num3){
		 	int hour =num3 / 60; 
	        int minutes=num3 % 60;

			num1+=hour; 
			num2+=minutes;
			
			if(num2>=60){
				int h = num2 / 60; 
				int m = num2 % 60;
				
				num1+=h; 
				num2=m; 
				
				if(num1>=24){
					num1 = num1 % 24; 
				}
			}
			
			System.out.println(num1+" "+num2);
	}

	//https://www.acmicpc.net/problem/2525

	public static void main(String[] args) {
//	 	Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt(); 
//        
//        int num3 = sc.nextInt(); 
		
		
		
		int num1 = 23; 
		int num2 = 59; 
		int num3 = 2; 
		func1(num1,num2,num3); 
		func2(num1,num2,num3); 
   	}

}
