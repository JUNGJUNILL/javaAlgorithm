import java.util.*;

import Algorithm_basic_Top10.DFS;

public class Hello {
	static int func(int M, int N, int x, int y){
		int zeroX=0; 
		int zeroY=0; 
		int temp=0; 
		int temp02=0; 
		
		//마지막 해를 구한 후에...
		while(true){
			
			if(zeroX<M){
				zeroX=zeroX+1;
			}else{
				zeroX=1; 
			}
			
			if(zeroY<N){
				zeroY=zeroY+1;
			}else{
				zeroY=1; 
			}
			temp++;
			if(zeroX==M && zeroY==N){
				break; 
			}	
		}
		
		zeroX=0;
		zeroY=0;
		 
		
		while(true){
			
			if(zeroX<M){
				zeroX=zeroX+1;
			}else{
				zeroX=1; 
			}
			
			if(zeroY<N){
				zeroY=zeroY+1;
			}else{
				zeroY=1; 
			}
			temp02++;
	
			//해에 도달하면 break;
			if(zeroX==x && zeroY==y){
				break; 
			}	
			
			//마지막 해보다 큰 경우는 없는 경우이므로 -1할당 후 break;
			if(temp<temp02){
				temp02=-1;
				break;
			}
		
		}

		
		return temp02;
		
		
	}
	
	public static void main(String[] args) {
System.out.println(func(10,12,7,2));


		
	}
}
