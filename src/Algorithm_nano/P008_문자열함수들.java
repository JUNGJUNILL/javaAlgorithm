package Algorithm_nano;

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
			System.out.println(str04.substring(0,str04.indexOf(".")));
		}
		

		
	}
}
