package javaOOP.P004_Interface;

public class Class003 {
	
	private Interface inter;
	
	public Class003(Interface inter) {
		this.inter = inter;
		
	}
	
	public void class003Method() {
		
		String str = inter.hello();
		System.out.println("Class003="+str);
		
	}

}
