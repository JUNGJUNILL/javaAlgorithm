package basicAlgorithm;

import java.util.Scanner;

public class P013_¾ËÆÄºªÃ£±â {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine(); 
		char[] array = new char[str.length()]; 
		for(int i=0 ; i<str.length(); i++){
			array[i] = str.charAt(i); 
		}
		char empty = 0; 
		
		for(int j=97; j<=122; j++){

			for(int k=0; k<array.length; k++){
	
				if(j==(byte)array[k]){
					System.out.print(k);
					System.out.print(" "); 
					empty=array[k];
					break;
				}

			}
			if(empty==j){
				continue;
			}
			System.out.print(-1);
			System.out.print(" ");
		
			
		
		
		}
		
	}

}
