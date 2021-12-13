package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.*;

import javax.swing.text.Position;

public class P018_����_������ {

	//https://www.acmicpc.net/problem/1107
	//https://www.acmicpc.net/source/share/ed3372d551b749759cc79ae6dbf7845f
	
	static boolean[] broken=new boolean[10]; 
	static int possible(int c){
		
	    //�ݷ� : ��� ����� ������ ���� �� ����.
		if(c==0){
			if(broken[0]){
				return 0; 
			}else{
				return 1; 
			}
		}
		int len=0; 
		while(c>0){
			//���峭 ��ư�� ������ �� �ڸ����� return;
			if(broken[c%10]){
				return 0;
			}
			len+=1;
			c /=10; 
		}
		
		return len; 
		
	}
	
	public static void main(String[] args) {

		//Scanner sc =new Scanner(System.in); 
		int n=5457; 
		int m=3;
		//broken={F,F,F,F,F,F,T,T,T,F]
		broken[6]=true;
		broken[7]=true;
		broken[8]=true;
//		for(int i=0; i<m; i++){
//			int x = sc.nextInt(); 
//			broken[x]=true; 
//		}
		
		//������ �ʱⰪ
		//���� ä���� 100�̴�.
		int ans =n -100; 
		if(ans<0){
			ans = -ans; 
		}

		
		for(int i=0; i<=1000000; i++){
			int c=i; //���� ��ư�� �̿�
			int len = possible(c);//���ڹ�ư ���� Ƚ�� 
			
			if(len>0){
				int press=c-n; 
				//5445-5357
	
				if(press<0){
					System.out.println("c="+c+" len="+len+" �������?="+i);

					press = -press;
					//12
				}
				
				if(ans>len+press){
	
					System.out.println("c="+c+" len="+len+" �������?="+i);
					ans = len+press;
	
				}
			}	
		}
		
		System.out.println(ans);
	}
	


}
