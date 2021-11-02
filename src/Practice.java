import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice {
	
	public static void main(String[] args) throws Exception{
		
		int number = 0; 
		
		for(int i=0; i<8; i++){
			System.out.println(number++);
			if(i==0){
				continue; 
			}
			
		}
		System.out.println("--------------");
		System.out.println(number);
		
	}
}

