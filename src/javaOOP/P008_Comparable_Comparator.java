package javaOOP;

import java.util.Comparator;

import javax.print.attribute.standard.Copies;

public class P008_Comparable_Comparator {

	public static void main(String[] args) {

//�͸� Ŭ���� ���� ���1 
//			Comparator<Student03> comp1 = new Comparator<Student03>() {
//			
//			@Override
//			public int compare(Student03 o1, Student03 o2) {
//		
//				return o1.classNumber - o2.classNumber;
//			}
//			
//			};
		
		Student03 a = new Student03(17,2); 
		Student03 b = new Student03(18,1); 
		Student03 c = new Student03(15,3);
		
		int number = comp2.compare(b, c); 
		int ageNumber = comp3.compare(b, c); 
		
		//�б޺�
		if(number>0){
			System.out.println("b�� c���� ũ��.");
		}else if(number==0){
			System.out.println("b�� c�� ����.");
		}else{
			System.out.println("b�� c���� �۴�.");
		}
		System.out.println("====================");
		
		//���̺�
		if(ageNumber>0){
			System.out.println("b�� c���� ���̰� ����.");
		}else if(ageNumber==0){
			System.out.println("b�� c�� �����̴�.");
		}else{
			System.out.println("b�� c���� ���");
		}
		
		
		
		
		
		
		
	}
	
			//�͸� Ŭ���� ���� ���2 
			//Ŭ������ ���(����)�� ��, �̸��� �ٸ��� �ϸ� �� ���� �������� ������ �� �ֵ���, �͸� ��ü ���� ����������. 
			//�ٸ� �̸��� ���� ���̶�� ���̴�. 
			//��, �͸� ��ü�� ����Ű�� ������ �޸��ϸ� �� ���� �����Ӱ� ������ �� �ִ�. 
			//�͸�ü�� ���� �������� �� ������ ������ �� �ִٴ� ���� ū �����̴�. 
	
			//�б� ��
			public static Comparator<Student03> comp2 =new Comparator<Student03>() {
			
				@Override
				public int compare(Student03 o1, Student03 o2) {
					return o1.classNumber - o2.classNumber;
				}
			};
			
			//���� ��
			public static Comparator<Student03> comp3 = new Comparator<Student03>() {
				
				@Override
				public int compare(Student03 o1, Student03 o2) {				
					return o1.age - o2.age; 
				}
			};

}

class Student03 {
	
	int age; 
	int classNumber; 
	
	public Student03(int age, int classNumber){
		this.age = age; 
		this.classNumber = classNumber; 
	}
	
}
