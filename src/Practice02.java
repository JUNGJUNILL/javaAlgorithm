import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Practice02 {
	
	public static void main(String[] args) throws Exception {
		int temp=0; 
		 int n=9; 
		 int[] a=new int[n]; 
		a[0]=20;
		a[1]=7;
		a[2]=23;
		a[3]=19;
		a[4]=10;
		a[5]=15;
		a[6]=25;
		a[7]=8;
		a[8]=13;
		int sum=0; 
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		 Arrays.sort(a);
		
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(i==j) continue; 
				temp++;
				System.out.println(i+" : "+j+"a[i]="+a[i]+"a[j]"+a[j]);
			}
		}
		System.out.println("temp="+temp);
		
	}
}