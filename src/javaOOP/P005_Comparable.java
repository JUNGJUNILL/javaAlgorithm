package javaOOP;


//Comparable -> compareTo(o1)  
// �ڱ� �ڽŰ� �Ű����� ��ü�� �� 
// compareTo �޼ҵ带 �ݵ�� ������ �־�� �Ѵ�. 

//Comparator -> compare(o1, o2) 
// �� �Ű����� ��ü�� ��  
// �ڽ��� ���°� ��� ������� �Ķ���ͷ� ������ �� ��ü�� �� 

//��ü�� ���� �� �ֵ��� �����. 
//���������� ��ü�� ����ڰ� ������ �������� ���� �̻� 
//� ��ü�� �� ���� �켱������ ������ �Ǵ� �� ���� ����. 
//� ����� ���̸� �������� �Ǵ����װ�, � ����� �б��� �������� �Ǵ��ϴ� �� �߱������� ���̴�. 

class Student01 implements Comparable<Student01>{
	
	int age; 
	int classNumber; 
	
	public Student01(int age, int classNumber){
		this.age=age; 
		this.classNumber=classNumber; 
	}
	
	@Override
	public int compareTo(Student01 o) {
		
		if(this.age > o.age){
			return 1; 
		}else if(this.age==o.age){
			return 0; 
		}else{
			return -1; 
		}
		
	}
	
}

public class P005_Comparable {

	public static void main(String[] args) {
		
		Student01 a =new Student01(17,2); 
		Student01 b =new Student01(18,1); 
		
		int number = a.compareTo(b); 
		
		if(number > 0){
			System.out.println("a�л��� b�л����� ���̰� ����.");
		}else if(number == 0){
			System.out.println("a�л��� b�л��� �����̴�.");
		}else{
			System.out.println("a�л��� b�л����� ���̰� ����.");
		}
		
		

	}

}
