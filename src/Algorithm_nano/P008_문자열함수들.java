package Algorithm_nano;

import java.util.StringTokenizer;

public class P008_���ڿ��Լ��� {

	public static void main(String[] args) {

		String str01 ="�����̻�����ĥ�ȱ���"; 
		System.out.println(str01.substring(4));
		System.out.println(str01.substring(1,9)); //1�� �ε������� 9-1=8���� ������ ��ȯ�Ѵ�.
		
		String str02 = "�����̻�����ĥ�ȱ���"; 
		String[] str02Arr =str02.split(""); 
		for(String n : str02Arr){
			System.out.print(n);
		}
		System.out.println();
		String str03 = "�����̻�����ĥ�ȱ���";
		
		if(str03.startsWith("��")){
			System.out.println("������ �����ϳ׿�");
		}else{
			System.out.println("�ٸ��ɷ� �����ϳ׿�");
		}
		
		if(str03.endsWith("��")){
			System.out.println("������ �����׿�");
		}else{
			System.out.println("�ٸ��ɷ� �����׿�");
		}
		
		String str04 = "�����̻�.�����ĥ�ȱ���"; 
		if(str04.indexOf(".")!=-1){
			System.out.println("str04="+str04.substring(0,str04.indexOf(".")));
		}
		
		System.out.println("==============");
		String str05 ="�� �� ��"; 
		StringTokenizer strToken01=new StringTokenizer(str05); 
		while(strToken01.hasMoreTokens()){
			System.out.println(strToken01.nextToken());
		}
		
		String str06="!��!��!��!"; 
		StringTokenizer strToken02=new StringTokenizer(str06,"!"); //(str06,"!",true) default��  false
		while(strToken02.hasMoreTokens()){
			System.out.println(strToken02.nextToken());
		}
		String str07="������-������:������"; 
		StringTokenizer strToken03=new StringTokenizer(str07,"-:"); //�������� �����ڸ� �̿��� �� �ִ�.
		while(strToken03.hasMoreTokens()){
			System.out.println(strToken03.nextToken());
		}
		
		//���ϸ��� Ȯ�����̸��� �̾ƺ���.
		String str08="helloworld.jsp"; 
		int len=str08.length(); 
		int lastDot = str08.lastIndexOf("."); 
		String ext01 = str08.substring(lastDot); 
		String ext02 =str08.substring(lastDot, len); 
		System.out.println("ext01="+ext01);
		System.out.println("ext02="+ext02);
		
	}
}
