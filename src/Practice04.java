import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Vector;

public class Practice04 {
	
	public static void func1(int num1, int num2, int num3){
		
		int min = (60*num1)+num2; 
		min+=num3; 
		
		int hour = (min / 60) %24; 
		int minute = min % 60; 
		
		System.out.println(hour + " " + minute);
		
	}
	
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
	
	
	public static void main(String[] args) {


		int num1 = 17; 
		int num2 = 59; 
		int num3= 125; 
		func1(num1,num2,num3); 
		func2(num1,num2,num3); 
	  
      
	}
}
