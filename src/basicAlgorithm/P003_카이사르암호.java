package basicAlgorithm;

import java.util.Scanner;

public class P003_ī�̻縣��ȣ {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/5598
		
		Scanner sc = new Scanner(System.in); 
		String enter = sc.nextLine();
		
		byte[] arrayByte = new byte[enter.length()]; 
		for(int i=0; i<enter.length(); i++){
			arrayByte[i]=(byte)enter.charAt(i); 
		}

		//ABC 65,66,67 �� ���� +3�� �ϸ� �ǰ�
		//ABC->XYZ
		
		for(int j=0; j<arrayByte.length; j++){
			
			
			switch((char)(arrayByte[j])){
				case 'A' : System.out.print('X');
					break;
				case 'B' : System.out.print('Y');
					break;
				case 'C' : System.out.print('Z');
					break;
				default : 
				System.out.print((char)(arrayByte[j]-3));
					break;
			}
			
		
		}
		
 



		

	}

}
