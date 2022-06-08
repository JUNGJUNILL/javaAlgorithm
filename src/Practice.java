
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Practice {

	public static void main(String[] args) {
		int count=0;
		AtomicInteger integer =new AtomicInteger();
		 for (int i = 1; i <= 100; i++) {
			   for (int j = 1; j <= 100; j++) {
				   count++;
				   integer.incrementAndGet();
			   }
		 }
		 
		 System.out.println(integer.get());
		 
		 
		
	}
}