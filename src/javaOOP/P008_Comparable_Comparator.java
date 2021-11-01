package javaOOP;

import java.util.Comparator;

import javax.print.attribute.standard.Copies;

public class P008_Comparable_Comparator {

	public static void main(String[] args) {

//익명 클레스 구현 방법1 
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
		
		//학급비교
		if(number>0){
			System.out.println("b가 c보다 크다.");
		}else if(number==0){
			System.out.println("b가 c와 같다.");
		}else{
			System.out.println("b가 c보다 작다.");
		}
		System.out.println("====================");
		
		//나이비교
		if(ageNumber>0){
			System.out.println("b가 c보다 나이가 많다.");
		}else if(ageNumber==0){
			System.out.println("b와 c는 동갑이다.");
		}else{
			System.out.println("b가 c보다 어리다");
		}
		
		
		
		
		
		
		
	}
	
			//익명 클레스 구현 방법2 
			//클래스를 상속(구현)할 때, 이름만 다르게 하면 몇 개던 여러개를 생성할 수 있듯이, 익명 객체 또한 마찬가지다. 
			//다만 이름이 없을 뿐이라는 것이다. 
			//즉, 익명 객체를 가리키는 변수명만 달리하면 몇 개든 자유롭게 생성할 수 있다. 
			//익명객체를 통해 여러가지 비교 기준을 정의할 수 있다는 것이 큰 장점이다. 
	
			//학급 비교
			public static Comparator<Student03> comp2 =new Comparator<Student03>() {
			
				@Override
				public int compare(Student03 o1, Student03 o2) {
					return o1.classNumber - o2.classNumber;
				}
			};
			
			//나이 비교
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
