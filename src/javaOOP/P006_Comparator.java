package javaOOP;

import java.util.Comparator;


//Comparator -> compare(o1, o2) 
// �� �Ű����� ��ü�� ��  
// �ڽ��� ���°� ��� ������� �Ķ���ͷ� ������ �� ��ü�� �� 
// �� �Ű������� ���Կ� �־� �ڱ� �ڽ��� �� ��ü �񱳿� ������ ����. 


class Student02 implements Comparator<Student02>{
	
	int age; 
	int classNumber; 
	
	public Student02(int age, int classNumber){
		this.age=age; 
		this.classNumber=classNumber; 
	}
	@Override
	public int compare(Student02 o1, Student02 o2) {

		
		return o1.classNumber - o2.classNumber; 
//		if(o1.classNumber > o2.classNumber){
//			return 1; 
//		}else if(o1.classNumber == o2.classNumber){
//			return 0; 
//		}else{
//			return -1; 
//		}
		
	}
	

	
}

public class P006_Comparator {

	public static void main(String[] args) {

		Student02 a =new Student02(17,2); 
		Student02 b =new Student02(18,1); 
		Student02 c =new Student02(15,3);
		
		int number = a.compare(b, c); 
		
		if(number>0){
			System.out.println("b�� c���� ũ��.");
		}else if(number==0){
			System.out.println("b�� c�� ����.");
		}else{
			System.out.println("b�� c���� �۴�.");
		}

	}

}
