
import java.util.*;

public class Practice {


	public static void main(String[] args) {
		int n=4;
		
		ArrayList<Integer>[] a = new ArrayList[n]; 
		int[] parent = new int[n]; 
		int[] order  = {0,1,2,3}; // 그래프 순회 결과 
		boolean[] check=new boolean[n]; 
		
		for(int i=0; i<n; i++){
			a[i]=new ArrayList<>(); 
		}
		//그래프를 인접리스트로 표현한 모양이다.
		a[0].add(1);
		a[0].add(2);
		
		a[1].add(0);
		a[1].add(3);
		
		a[2].add(0); 
		
		a[3].add(1); 
		
		Queue<Integer> q=new LinkedList<>(); 
		q.add(0); 
		check[0]=true; 
		
		int m=1; 
		for(int i=0; i<n; i++){
			
			if(q.isEmpty()){
				System.err.println(0);
				System.exit(0);
			}
			
			int x=q.poll(); 
			if(x!=order[i]){
				System.out.println(0);
				System.exit(0);
			}
			
			
			int cnt=0; 
			for(int y : a[x]){
				if(!check[y]){
					parent[y]=x;
					cnt+=1;
				}
			}
			
			for(int j=0; j<cnt; j++){
				
				if((m+j) >=4 || parent[order[m+j]] !=x){
					System.out.println(0);
					System.exit(0);
				}
			
				q.add(order[m+j]);
				check[order[m+j]]=true; 
			}
			
			m+=cnt; 
		}
		System.out.println(1);

		
		
		
	}
}




