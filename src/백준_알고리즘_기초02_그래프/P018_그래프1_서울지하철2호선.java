package 백준_알고리즘_기초02_그래프;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class P018_그래프1_서울지하철2호선 {

	static ArrayList<Integer>[] a; 
    static int[] check;
    static int[] dist;
	
	//어떤 정점이 사이클에 포함되어있는지 알아보는 함수
	static int go(int x, int p){
		
		//-2 : 사이클 찾음, 사이클에 포함되지 않음
		//-1 : 사이클 못찾음 
		//0~n-1 : 사이클 찾음, 시작 인덱스
		
		//사이클을 찾았다.
		//사이클의 시작 인덱스 x 
		if(check[x] == 1){
			return x; 
		}
		
		check[x]=1; //그냥 방문한거 
		for(int y : a[x]){
			if(y==p) continue; //이전 정점과 같은 정점이면 건너 뛴다.
			int res=go(y,x); 
			if(res==-2)return -2; //사이클을 찾았고 해당 정점은 사이클에 포함되지 않는다.
			if(res>=0){ //사이클을 찾은거임
				check[x]=2; //방문했는데 사이클의 일부인거
				if(x==res)return -2;
				else return res;
			}
		}
		
		return -1; 
		
	}
	
	
	//https://www.acmicpc.net/source/share/b830798e0d4943f6bb60e89dc150b60b
	//https://www.acmicpc.net/problem/16947
	public static void main(String[] args) {
		//N개의 정점과 N개의 간선으로 이루어져 있는 그래프는 사이클이 하나만 존재한다.
		
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
