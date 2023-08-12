package javaOOP.P004_Interface;

public class P001_Main {
	
	public static Interface class002() {
		return new Class002();
	}
	
	public static Interface class001() {
		return new Class001(class002());
	}
	
	public static Class003 class003() {
		return new Class003(class001());
	}
	
	static Class003 class003= null;
	
	public static void main(String[] args) {
		
		class003 =class003();
		class003.class003Method();
	}
}
