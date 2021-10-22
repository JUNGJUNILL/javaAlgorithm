package basicAlgorithm;

import java.util.Scanner;

public class P004_카이사르암호 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		char[] cae = new char[input.length()]; 
		
		for(int i=0; i<cae.length; i++){
			
			if(input.charAt(i)-3 < 'A'){
				cae[i] = (char)(input.charAt(i)+23);
			}else{
				cae[i] = (char)(input.charAt(i)-3);
			}
		}
		
		
		for(int j=0; j<cae.length; j++){
			System.out.print(cae[j]);
		}
		
	}

}
