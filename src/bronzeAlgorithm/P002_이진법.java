package bronzeAlgorithm;

import java.util.Scanner;

public class P002_������ {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();

	     //�׽�Ʈ(����Ƚ��)
	     String[] binary = new String[n];
	     
	     for(int i=0; i<n; i++){
	    	 int num = sc.nextInt(); 
	    	 String tmp=""; 
	    	 while(num !=1){
	    		 tmp = tmp + num%2; 
	    		 
	    		 num = num /2; 
	    	 }
	    	 tmp = tmp+num; 
	    	 binary[i] = tmp; 
	    	 
	     }
	     
	     
	     for(String tmp : binary){
	    	 
	    	 for(int i=0; i < tmp.length(); i++){
	    		 if(tmp.charAt(i)=='1'){
	    			 System.out.print(i+"");
	    		 }
	    	 }
	     }
	     
	     
	     
	}

}
