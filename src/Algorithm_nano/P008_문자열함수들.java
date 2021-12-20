package Algorithm_nano;

import java.util.StringTokenizer;

public class P008_문자열함수들 {

	public static void main(String[] args) {

		String str01 ="영일이삼사오육칠팔구십"; 
		System.out.println(str01.substring(4));
		System.out.println(str01.substring(1,9)); //1번 인덱스부터 9-1=8개의 문자을 반환한다.
		
		String str02 = "영일이삼사오육칠팔구십"; 
		String[] str02Arr =str02.split(""); 
		for(String n : str02Arr){
			System.out.print(n);
		}
		System.out.println();
		String str03 = "영일이삼사오육칠팔구십";
		
		if(str03.startsWith("영")){
			System.out.println("영으로 시작하네요");
		}else{
			System.out.println("다른걸로 시작하네요");
		}
		
		if(str03.endsWith("십")){
			System.out.println("십으로 끝나네요");
		}else{
			System.out.println("다른걸로 끝나네요");
		}
		
		String str04 = "영일이삼.사오육칠팔구십"; 
		if(str04.indexOf(".")!=-1){
			System.out.println("str04="+str04.substring(0,str04.indexOf(".")));
		}
		
		System.out.println("==============");
		String str05 ="정 준 일"; 
		StringTokenizer strToken01=new StringTokenizer(str05); 
		while(strToken01.hasMoreTokens()){
			System.out.println(strToken01.nextToken());
		}
		
		String str06="!정!준!일!"; 
		StringTokenizer strToken02=new StringTokenizer(str06,"!"); //(str06,"!",true) default는  false
		while(strToken02.hasMoreTokens()){
			System.out.println(strToken02.nextToken());
		}
		String str07="정준일-정준일:정준일"; 
		StringTokenizer strToken03=new StringTokenizer(str07,"-:"); //여러개의 구분자를 이용할 수 있다.
		while(strToken03.hasMoreTokens()){
			System.out.println(strToken03.nextToken());
		}
		
		//파일명의 확장자이름을 뽑아보자.
		String str08="helloworld.jsp"; 
		int len=str08.length(); 
		int lastDot = str08.lastIndexOf("."); 
		String ext01 = str08.substring(lastDot); 
		String ext02 =str08.substring(lastDot, len); 
		System.out.println("ext01="+ext01);
		System.out.println("ext02="+ext02);
		
	}
}
