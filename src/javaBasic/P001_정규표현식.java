package javaBasic;
import java.util.regex.Pattern;

public class P001_����ǥ���� {

	public static void main(String[] args) {

		
//		https://highcode.tistory.com/6 [HighCode]
//		1) ���ڸ� : ^[0-9]*$
//
//		2) �����ڸ� : ^[a-zA-Z]*$
//
//		3) �ѱ۸� : ^[��-�R]*$
//
//		4) ���� & ���ڸ� : ^[a-zA-Z0-9]*$


		  
		  String value01 = "1abc";  
		  boolean regex1 = Pattern.matches("[a-z0-9]*$", value01);
		  boolean regex2 = Pattern.matches("^[a-z]*$", value01);
		  boolean regex2_2 = Pattern.matches("^[a-z0-9]*", value01);

		  System.out.println("value01="+value01.replaceAll("[^0-9]", "")); //���ڸ� ���� 
		  System.out.println("regex1="+regex1); //true
		  System.out.println("regex2="+regex2); //true
		  System.out.println("regex2_2="+regex2); //true

		  System.out.println();
		  System.out.println("=======================================");
		  System.out.println();
		  //����1
		  // ^ �̰� �׳� ���ڿ��� ����? �̶�µ� ^ �ְ� ^ ���� ���̰� ���µ� ��Ȯ�� ^ �� ������ �����ΰ���? 
		  //^[a-z] : a ~ z������ ���ĺ����� �����Ѵ�. 
		  // [a-z] : ^��ȣ�� ���� ��쿡�� ó���� ���� �����ϴ��� ������� a~z �� �߰����� ������ true
		  
		  String value02 ="-_.abc"; 
		  boolean regex3 = Pattern.matches("^[-_.a-z]*$", value02);
		  boolean regex4 = Pattern.matches("^[-_.a-z]*", value02);
		  boolean regex5 = Pattern.matches("^[-_.a-z]", value02);  

		  System.out.println("�ñ�=="+"-abcd������".replaceAll("^[-_.a-z]", ""));
		  // regex5 �� false�� ������ ^[-_.a-z] ���ԽĿ��� ������ ��ȣ�ȿ� ���� �� ��ȣ �߿� "�Ѱ���" ǥ���� �Ǿ��ٸ� true �� ������ �ſ���. 
		  // �ֳ��ϸ� �ڿ� * �� ���� ������ ��ȣ�ȿ� �� ���ڸ� �־��� ��츦 ã�� �ٰ� ���ø� �� �� �����ϴ�.
		  
		  System.out.println("�ñ�=="+Pattern.matches("^[-_.a-z]", "-������"));
		  boolean regex6 = Pattern.matches("[-_.a-zA-Z0-9]*$", value02);

		  System.out.println("regex3="+regex3); 
		  System.out.println("regex4="+regex4); 
		  System.out.println("regex5="+regex5); //�̰� false �� ������ 
		  System.out.println("regex6="+regex6); 
		  boolean regex5_5 = Pattern.matches("^[-_.a-zA-Z0-9]*$", value02);
		  System.out.println("regex5_5="+regex5_5); 
		  
		  System.out.println("[^a-zA-Z0-9]*$ = "+value02.replaceAll("[^a-zA-Z0-9]*$", "")); //$�� �پ��� ������ Ư�����ڷ� ������ ���ڿ��� Ư�����ڰ� �� ����� 
		  System.out.println("[^a-zA-Z0-9]*$ = "+"-_.abc!@#abc!@#".replaceAll("[^a-zA-Z0-9]*$", "")); 
		  System.out.println("[^a-zA-Z0-9]*  ="+value02.replaceAll("[^a-zA-Z0-9]*", ""));
		  System.out.println("[^a-zA-Z0-9]   ="+value02.replaceAll("[^a-zA-Z0-9]", ""));
		  
		  
		  
		  
		  //����2
		  // * �̰� ������ �� ���ڰ� �������� ������ ���� ���� ���� �̶�µ� ��Ȯ�� ���� �������� �𸣰ھ��
		  // [1]* �� ��� 1�� ��� true, �Ѱ� �־ true, 100�� �־ true
		  
		  String test="46546"; 
		  boolean regex7 = Pattern.matches("[1]*", test);
		  System.out.println("regex7="+regex7);
		  
		  String test01="abcd";
		  boolean regex8 = Pattern.matches("^[a|b|c]*", test01);
		  System.out.println("regex8="+regex8);

		  
		  
		  
		  // $ �̰� ������ ���ڿ� ���� ��� �ϴµ� ������ ������ ������� �Ȱ����� ���� �����ΰ���?
		  // regex5 �� false�� ������ �����ΰ���?
		  //https://codechacha.com/ko/java-regex/
		  //https://highcode.tistory.com/6
		  
	


		
	}

}
