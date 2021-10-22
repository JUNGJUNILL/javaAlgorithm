package basicAlgorithm;

import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class P002_º°Âï±â {

public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		int a=sc.nextInt();
		for(int i=1; i<=a; i++){
			
			for(int j=a; j>=1; j--){
				
				if(i<j){
					//1<3 true
					//1<2 true 
					
					//2<3 true
					System.out.print(" ");
	
				}else{
					//1<1 false
					
					//2<2 false 
					//2<1 false 
					System.out.print("*");
	
				}
				 
			}
			System.out.println();
			
		}
		
		System.out.println("-----------------------");
		
		
		for(int i=a; i>=1; i--){
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			
		
			System.out.println();
		}
		System.out.println("-----------------------");
	
		for(int i=1; i<=a; i++){
			for(int j=1; j<=a; j++){
				
				if(i<j || i==j){
					System.out.print("*");	
				}else{
					System.out.print(" "); 
				}
			}
			System.out.println();
			
		}
		System.out.println("-----------------------");
		
		for(int i=a,j=1; i>=1; i--, j=j+2){
			for(int k=1; k<=(a*2)-1; k++){
				
				if(k<i){
					System.out.print(" "); 

				}else if(k>=i && k < i+j){
					System.out.print("*"); 
				}else{
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i=a,b=1; i>=1; i--, b++){
			for(int j=1; j<=(a*2)-1; j++){
				if(j<b){
					System.out.print(" ");
				}else if(j>=b && i+a > j){
					System.out.print("*");
				}else{
					break;
				}
				//System.out.print(j + " : "+b +" "+ (j>=b) +"|");
			}		
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int i=1; i<=a; i++){
			
			for(int j=0; j<a-i; j++){
				System.out.print(" ");
			}
			
			
			for(int j=0; j<i*2-1; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int i=a-1; i>=1; i--){
			for(int j=0; j< a-i; j++){
				System.out.print(" ");
			}
			for(int j=0; j<i*2-1; j++){
				System.out.print("*"); 
			}
			System.out.println();
			
		}
		System.out.println("-----------------------");

		
		
		
		
		for(int i=1; i<=(a*2)-1; i++){
			
			if(i<a){
				for(int j=1; j<=(a*2)-1; j++){
					
					if(j<=a){
						System.out.print(" ");

					}else if(j>=a&&j<i+a){
						System.out.print("*");

					}else{
						break;
					}


				} 
				
			}else if(i>a){
				for(int j=1; j<=(a*2)-1; j++){
					System.out.print("B");
				} 
			}else{
				for(int j=1; j<=(a*2)-1; j++){
					System.out.print("*");
				} 
			}
			System.out.println();
			
		}

		
		

		
	}
}
