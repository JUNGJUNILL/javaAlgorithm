package javaBasic;

import java.lang.reflect.Method;

import SpringStudy.Member_Member;

class Hello{
	
	int hello=100; 
	String name="hello"; 
	
	public void helloworld(){
		System.out.println("hello world");
	}
	
	public void good(){
		System.out.println("good morning");
	}
}

public class P008_리플렉션 {

	public static void main(String[] args) throws Exception{

		Class c =Class.forName("Hello"); 
		System.out.println(c.getName());

		Method[] m =c.getMethods(); 
		
	
	System.out.println(m[0].getName());
	
		
	}
}
