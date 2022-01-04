
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		int[][] array = new int[0][2]; 
		
		System.out.println();
		array[0][0]=1;
		array[0][1]=2; 
		
		
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.println(array[i][j]);
			}
		}
		
		
	}
}




