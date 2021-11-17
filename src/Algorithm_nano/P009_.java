package Algorithm_nano;

import java.util.Arrays;

public class P009_ {

	public static void main(String[] args) {
		
		String num ="345982"; 
		char[] charArr = num.toCharArray(); 
		Arrays.sort(charArr);
		for(int i=0; i<charArr.length; i++){
			System.out.println(charArr[i]);
		}
		
	}

}
