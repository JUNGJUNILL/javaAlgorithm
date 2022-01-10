package ����_�˰���_����02_�׷���;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class P018_�׷���1_��������ö2ȣ�� {

	static ArrayList<Integer>[] a; 
    static int[] check;
    static int[] dist;
	
	//� ������ ����Ŭ�� ���ԵǾ��ִ��� �˾ƺ��� �Լ�
	static int go(int x, int p){
		
		//-2 : ����Ŭ ã��, ����Ŭ�� ���Ե��� ����
		//-1 : ����Ŭ ��ã�� 
		//0~n-1 : ����Ŭ ã��, ���� �ε���
		
		//����Ŭ�� ã�Ҵ�.
		//����Ŭ�� ���� �ε��� x 
		if(check[x] == 1){
			return x; 
		}
		
		check[x]=1; //�׳� �湮�Ѱ� 
		for(int y : a[x]){
			if(y==p) continue; //���� ������ ���� �����̸� �ǳ� �ڴ�.
			int res=go(y,x); 
			if(res==-2)return -2; //����Ŭ�� ã�Ұ� �ش� ������ ����Ŭ�� ���Ե��� �ʴ´�.
			if(res>=0){ //����Ŭ�� ã������
				check[x]=2; //�湮�ߴµ� ����Ŭ�� �Ϻ��ΰ�
				if(x==res)return -2;
				else return res;
			}
		}
		
		return -1; 
		
	}
	
	
	//https://www.acmicpc.net/source/share/b830798e0d4943f6bb60e89dc150b60b
	//https://www.acmicpc.net/problem/16947
	public static void main(String[] args) {
		//N���� ������ N���� �������� �̷���� �ִ� �׷����� ����Ŭ�� �ϳ��� �����Ѵ�.
		
		Scanner sc =new Scanner(System.in); 
		int n=sc.nextInt(); 
		a =new ArrayList[n]; 
		dist=new int[n]; 
		check=new int[n]; 
		  for (int i=0; i<n; i++) {
	            a[i] = new ArrayList<>();
	        }
		
		for(int i=0; i<n; i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			a[u].add(v); 
			a[v].add(u); 
		}
		 go(0, -1);
		 Queue<Integer> q=new LinkedList<Integer>(); 
		 for(int i=0; i<n; i++){
			 if(check[i]==2){
				 dist[i]=0;
				 q.add(i); 
			 }else{
				 dist[i]=-1; 
			 }
		 }
		 while(!q.isEmpty()){
			 int x = q.poll(); 
			 for(int y : a[x]){
				 if(dist[y] == -1){
					 q.add(y); 
					 dist[y] = dist[x]+1; 
				 }
			 }		 
		 }
		 
		 for(int i=0; i<n; i++){
			 System.out.print(dist[i]+" ");
		 }
		 System.out.println();
		 
		
	}

}
