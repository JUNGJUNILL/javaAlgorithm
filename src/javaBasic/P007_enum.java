package javaBasic;

public class P007_enum {
	
	enum P006_enum { SK, LG, KT, SAMSUNG, APPLE }; 

	public static void main(String[] args) {
		
		for(P006_enum val : P006_enum.values()){
			System.out.println(val);
		}

	}

}
