
import java.util.*;
public class Practice {
	
	 static ArrayList<Integer>[] a; 
	 static int[] check;
	 static int[] dist;
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
			System.out.println("go("+x+","+p+")"+":"+res);
			if(res==-2)return -2; //사이클을 찾았고 해당 정점은 사이클에 포함되지 않는다.
			if(res>=0){ //사이클을 찾은거임
				check[x]=2; //방문했는데 사이클의 일부인거
				if(x==res)return -2;
				else return res;
			}
		}
		
		return -1; 
		
	}
	
	public static void main(String[] args) {
		
		int n=4;
		a =new ArrayList[n]; 
		dist=new int[n]; 
		check=new int[n]; 
	    for (int i=0; i<n; i++) {
            a[i] = new ArrayList<>();
	     }

		a[0].add(2); 
		a[2].add(0); 
		
		a[3].add(2); 
		a[2].add(3); 
		
		a[3].add(1);
		a[1].add(3);
		
		a[0].add(1);
		a[1].add(0);
		
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




