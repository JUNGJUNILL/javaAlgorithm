
import java.util.*;

public class Practice {

	public static void main(String[] args) {
	
		String str01 ="�����̻�����ĥ�ȱ���"; 
		
		System.out.println(str01.substring(4));
		System.out.println(str01.substring(1,9));
		
		String str04 = "�����̻�.�����ĥ�ȱ���";
		if(str04.indexOf(".")!=0){
			System.out.println(str04.substring(0,str04.indexOf(".")));
		}

		String str05 ="�� �� ��"; 
		String[] str05Array = str05.split(""); 
		StringTokenizer strToken01=new StringTokenizer(str05); 
		while(strToken01.hasMoreTokens()){
			System.out.print(strToken01.nextToken()+" ");
		}
		System.out.println();
	
		
		String str07="������-������:������"; 
		StringTokenizer strToken03=new StringTokenizer(str07,"-:",true); //�������� �����ڸ� �̿��� �� �ִ�.
		while(strToken03.hasMoreTokens()){
			System.out.print(strToken03.nextToken()+" ");
		}
		
		
	}
}




