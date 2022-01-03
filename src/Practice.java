
import java.util.*;

public class Practice {

	public static void main(String[] args) {
	
		String str01 ="영일이삼사오육칠팔구십"; 
		
		System.out.println(str01.substring(4));
		System.out.println(str01.substring(1,9));
		
		String str04 = "영일이삼.사오육칠팔구십";
		if(str04.indexOf(".")!=0){
			System.out.println(str04.substring(0,str04.indexOf(".")));
		}

		String str05 ="정 준 일"; 
		String[] str05Array = str05.split(""); 
		StringTokenizer strToken01=new StringTokenizer(str05); 
		while(strToken01.hasMoreTokens()){
			System.out.print(strToken01.nextToken()+" ");
		}
		System.out.println();
	
		
		String str07="정준일-정준일:정준일"; 
		StringTokenizer strToken03=new StringTokenizer(str07,"-:",true); //여러개의 구분자를 이용할 수 있다.
		while(strToken03.hasMoreTokens()){
			System.out.print(strToken03.nextToken()+" ");
		}
		
		
	}
}




