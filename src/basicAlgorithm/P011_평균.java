package basicAlgorithm;

import java.util.Scanner;

public class P011_ЦђБе {

	public static void main(String[] args) {
		

	Scanner in = new Scanner(System.in);

	int input = in.nextInt();
	double[] array = new double[input];
	double maxValue =0.0; 
	double temp     =0.0;
	
	for(int i=0; i<input; i++){
		array[i]=in.nextDouble(); 
	}
		
	for(int j=0; j<array.length; j++){
		maxValue = array[j] > maxValue ? array[j] : maxValue; 
	}
	
	for(int k=0; k<array.length; k++){
		temp = temp+((array[k]/maxValue)*100.0); 
	}
	System.out.println(temp / input);
	
	
	
	}

}
