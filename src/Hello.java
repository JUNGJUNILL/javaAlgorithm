import java.util.*;

import Algorithm_basic_Top10.DFS;

public class Hello {
	static int func(int M, int N, int x, int y){
		int zeroX=0; 
		int zeroY=0; 
		int temp=0; 
		int temp02=0; 
		
		//������ �ظ� ���� �Ŀ�...
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
	
			//�ؿ� �����ϸ� break;
			if(zeroX==x && zeroY==y){
				break; 
			}	
			
			//������ �غ��� ū ���� ���� ����̹Ƿ� -1�Ҵ� �� break;
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
