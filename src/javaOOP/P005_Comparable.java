package javaOOP;


//Comparable -> compareTo(o1)  
// 자기 자신과 매개변수 객체를 비교 
// compareTo 메소드를 반드시 구현해 주어야 한다. 

//Comparator -> compare(o1, o2) 
// 두 매개변수 객체를 비교  
// 자신의 상태가 어떻던 상관없이 파라미터로 들어오는 두 객체를 비교 

//객체를 비교할 수 있도록 만든다. 
//본질적으로 객체는 사용자가 기준을 정해주지 않은 이상 
//어떤 객체가 더 높은 우선순위를 갖는지 판단 할 수가 없다. 
//어떤 사람은 나이를 기준으로 판단할테고, 어떤 사람은 학급을 기준으로 판단하는 등 중구난방일 것이다. 

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
			System.out.println("a학생이 b학생보다 나이가 많다.");
		}else if(number == 0){
			System.out.println("a학생과 b학생은 동갑이다.");
		}else{
			System.out.println("a학생이 b학생보다 나이가 적다.");
		}
		
		

	}

}
