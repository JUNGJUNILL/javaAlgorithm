package javaBasic;
import java.util.regex.Pattern;

public class P001_정규표현식 {

	public static void main(String[] args) {

		
//		https://highcode.tistory.com/6 [HighCode]
//		1) 숫자만 : ^[0-9]*$
//
//		2) 영문자만 : ^[a-zA-Z]*$
//
//		3) 한글만 : ^[가-힣]*$
//
//		4) 영어 & 숫자만 : ^[a-zA-Z0-9]*$


		  
		  String value01 = "1abc";  
		  boolean regex1 = Pattern.matches("[a-z0-9]*$", value01);
		  boolean regex2 = Pattern.matches("^[a-z]*$", value01);
		  boolean regex2_2 = Pattern.matches("^[a-z0-9]*", value01);

		  System.out.println("value01="+value01.replaceAll("[^0-9]", "")); //숫자만 뺄게 
		  System.out.println("regex1="+regex1); //true
		  System.out.println("regex2="+regex2); //true
		  System.out.println("regex2_2="+regex2); //true

		  System.out.println();
		  System.out.println("=======================================");
		  System.out.println();
		  //질문1
		  // ^ 이게 그냥 문자열의 시작? 이라는데 ^ 있고 ^ 없고 차이가 없는데 정확히 ^ 의 역할이 무엇인가요? 
		  //^[a-z] : a ~ z사이의 알파벳으로 시작한다. 
		  // [a-z] : ^기호가 없을 경우에는 처음에 뭐로 시작하는지 상관없이 a~z 가 중간에라도 있으면 true
		  
		  String value02 ="-_.abc"; 
		  boolean regex3 = Pattern.matches("^[-_.a-z]*$", value02);
		  boolean regex4 = Pattern.matches("^[-_.a-z]*", value02);
		  boolean regex5 = Pattern.matches("^[-_.a-z]", value02);  

		  System.out.println("궁금=="+"-abcd정준일".replaceAll("^[-_.a-z]", ""));
		  // regex5 가 false인 이유는 ^[-_.a-z] 정규식에서 시작은 괄호안에 문자 및 기호 중에 "한개만" 표현이 되었다면 true 가 나왔을 거에요. 
		  // 왜냐하면 뒤에 * 가 없기 때문에 괄호안에 한 문자만 주어진 경우를 찾는 다고 보시면 될 것 같습니다.
		  
		  System.out.println("궁금=="+Pattern.matches("^[-_.a-z]", "-정준일"));
		  boolean regex6 = Pattern.matches("[-_.a-zA-Z0-9]*$", value02);

		  System.out.println("regex3="+regex3); 
		  System.out.println("regex4="+regex4); 
		  System.out.println("regex5="+regex5); //이게 false 인 이유는 
		  System.out.println("regex6="+regex6); 
		  boolean regex5_5 = Pattern.matches("^[-_.a-zA-Z0-9]*$", value02);
		  System.out.println("regex5_5="+regex5_5); 
		  
		  System.out.println("[^a-zA-Z0-9]*$ = "+value02.replaceAll("[^a-zA-Z0-9]*$", "")); //$가 붙었기 때문에 특수문자로 끝나는 문자열은 특수문자가 다 사라짐 
		  System.out.println("[^a-zA-Z0-9]*$ = "+"-_.abc!@#abc!@#".replaceAll("[^a-zA-Z0-9]*$", "")); 
		  System.out.println("[^a-zA-Z0-9]*  ="+value02.replaceAll("[^a-zA-Z0-9]*", ""));
		  System.out.println("[^a-zA-Z0-9]   ="+value02.replaceAll("[^a-zA-Z0-9]", ""));
		  
		  
		  
		  
		  //질문2
		  // * 이게 설명에는 앞 문자가 없을수도 무한정 많을 수도 있음 이라는데 정확히 무슨 역할인지 모르겠어요
		  // [1]* 의 경우 1이 없어도 true, 한개 있어도 true, 100개 있어도 true
		  
		  String test="46546"; 
		  boolean regex7 = Pattern.matches("[1]*", test);
		  System.out.println("regex7="+regex7);
		  
		  String test01="abcd";
		  boolean regex8 = Pattern.matches("^[a|b|c]*", test01);
		  System.out.println("regex8="+regex8);

		  
		  
		  
		  // $ 이게 설명에는 문자열 종료 라고 하는데 있으나 없으나 결과값이 똑같은데 무슨 역할인가요?
		  // regex5 가 false인 이유는 무엇인가요?
		  //https://codechacha.com/ko/java-regex/
		  //https://highcode.tistory.com/6
		  
	


		
	}

}
