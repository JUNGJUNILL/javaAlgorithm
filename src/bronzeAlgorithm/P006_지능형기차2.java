package bronzeAlgorithm;
import java.util.Scanner;

public class P006_지능형기차2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max =0; 
		int tt = 0; 
		
		for(int i=0; i<10; i++){
			int a= sc.nextInt(); //내린 살마 수 
			int b= sc.nextInt(); //탄 사람 수 
			tt = tt-a; 
			//0 = 0-0 =0
			//32=32-3 =29
			//42=42-28=14
			
			tt = tt+b; 
			//0 = 0+32=32
			//29= 29+13=42
			//14= 14+25=39
			
			
			max = Math.max(tt,max); 
			//Math.max(0,32) = 32
			//Math.max(32,42) = 42
			//Math.max(42,39) = 42
			//....
			
		}
		System.out.println(max);

	}

}
