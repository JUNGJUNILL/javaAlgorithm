package javaBasic;


//enum
//Ŭ����ó�� ���̰� �ϴ� ���
//���� �����ִ� ����鳢�� ��� ������� �����ϴ°�
//enum Ŭ���� ���� ������� �� Ŭ������ ����
public enum P006_enum {
	
	SK("��������"),
	LG("����"),
	KT("����Ƽ"),
	SAMSUNG("�Ｚ"),
	APPLE("����"); 
	
	private final String value; 
	
	P006_enum(String value){ 
		this.value = value; 
	} 
	
	public String getValue(){ 	
		return value; 
	}

}
