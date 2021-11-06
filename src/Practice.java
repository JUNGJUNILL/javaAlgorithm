import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


class Student03 {
	
	int age; 
	int classNumber; 
	
	public Student03(int age, int classNumber){
		this.age = age; 
		this.classNumber = classNumber; 
	}
	
}

class MyInteger implements Comparable<MyInteger>{
	
	int value; 
	public MyInteger(int value){
		this.value = value; 
	}
	
	@Override
	public int compareTo(MyInteger o1) {

		
		return  o1.value-this.value;
	}
	
}

class MyInteger02{
	
	int value; 
	public MyInteger02(int value){
		this.value = value; 
	}
	
}



public class Practice {
	
	public static void main(String[] args) throws Exception{
		
	
		MyInteger[] arr = new MyInteger[10]; 
		
		for(int i=0; i<arr.length; i++){
			arr[i] = new MyInteger((int)(Math.random()*100));
		}
		
		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i].value+" ");
		}		
		
		Arrays.sort(arr);
		System.out.println();
		
		for(int i=0; i<arr.length; i++){
			
			System.out.print(arr[i].value+" ");
		}		
	}
	
	
	
}

