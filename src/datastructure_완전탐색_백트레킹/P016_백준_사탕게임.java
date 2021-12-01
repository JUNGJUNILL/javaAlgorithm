package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.Scanner;

public class P016_����_�������� {


/*
�˰����� �Ʒ��� �����ϴ�.

1. �� ���� �ٲٰ� ���� ��� ���� �� �ִ� ������ ���̸� �ľ��մϴ�.
i) ���η� ���� �� ����
ii) ���η� ���� �� ����
iii) i)�� ii) �� �� ������ ���̸� �����մϴ�.

2. �� �Ʒ��� �ٲٰ� ���� ��� ���� �� �ִ� ������ ���̸� �ľ��մϴ�.
i) ���η� ���� �� ����
ii) ���η� ���� �� ����
iii) ���������� i)�� ii) �� �� ������ ���̸� �����մϴ�.

3. 1�� 2���� ���� ���� �� �� �� ���� ����մϴ�.

��ó: https://jaimemin.tistory.com/1068 [������]
*/
	static int check(char[][] a){
		
		int n=a.length; 
		int ans=1;
		
		for(int i=0; i<n; i++){
			
			int cnt = 1; 
			for(int j=1; j<n; j++){
				if(a[i][j] == a[i][j-1]){
					cnt+=1;
				}else{
					cnt=1;
				}
				if(ans < cnt) ans =cnt;
			}
			cnt=1;
			for(int j=1; j<n; j++){
				if(a[j][i]==a[j-1][i]){
					cnt+=1;
				}else{
					cnt=1;
				}
				if(ans <cnt) ans = cnt;
			}
			
			
		}
		
		return ans;

		
	}
	
	
	//https://www.acmicpc.net/problem/3085
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt();
		char[][] a = new char[num][num]; 
		for(int i=0; i<num; i++){
			a[i]=sc.next().toCharArray(); 
		}
		int ans=0; 
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				if(j+1 < num){
					char t=a[i][j]; 
					a[i][j]=a[i][j+1]; 
					a[i][j+1]=t; 
					int temp=check(a); 
					if(ans<temp) ans=temp; 
					t=a[i][j]; 
					a[i][j] =a[i][j+1]; 
					a[i][j+1]=t; 
				}
				if(i+1<num){
					char t=a[i][j]; 
					a[i][j]=a[i+1][j]; 
					a[i+1][j]=t; 
					int temp = check(a); 
					if(ans<temp) ans=temp; 
					t=a[i][j];
					a[i][j] = a[i+1][j]; 
					a[i+1][j]=t; 
				}
			}
		}
		System.out.println(ans);
		
	}

}
