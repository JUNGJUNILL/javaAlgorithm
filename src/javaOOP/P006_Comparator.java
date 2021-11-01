package javaOOP;

import java.util.Comparator;


//Comparator -> compare(o1, o2) 
// 두 매개변수 객체를 비교  
// 자신의 상태가 어떻던 상관없이 파라미터로 들어오는 두 객체를 비교 
// 두 매개변수를 비교함에 있어 자기 자신은 두 객체 비교에 영향이 없다. 


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
			System.out.println("b가 c보다 크다.");
		}else if(number==0){
			System.out.println("b와 c는 같다.");
		}else{
			System.out.println("b가 c보다 작다.");
		}

	}

}
