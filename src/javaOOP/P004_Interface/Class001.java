package javaOOP.P004_Interface;

public class Class001 implements Interface{

	
	private Interface inter; 
	
	public Class001(Interface inter) {
		this.inter = inter;
	}
	
	@Override
	public String hello() {
		
		return inter.hello();
	}

	
	
}

