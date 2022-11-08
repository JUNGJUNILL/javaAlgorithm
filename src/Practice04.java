import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Vector;


class Test {
	
private int num;

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
} 


	
	
}
public class Practice04 {
	
	
	public static void main(String[] args) {
		
		
		
		
		Test t1=new Test(); 
		t1.setNum(2);
			
		Test t2=new Test(); 
		t2.setNum(1);
				
		Test t3=new Test(); 
		t3.setNum(3);
	
		Test[] array = new Test[3]; 
		
		array[0]= t1;
		array[1]= t2;
		array[2]= t3;
		
		Arrays.sort(array,new Comparator<Test>(){
			
			
		
			@Override
			public int compare(Test o1, Test o2) {
				System.out.println(o1.getNum()+ " : " + o2.getNum());
				return o2.getNum() - o1.getNum();
			}
			
		});

		for(int i=0; i<array.length; i++){
			System.out.println(array[i].getNum());
		}

		
		
	}
}
