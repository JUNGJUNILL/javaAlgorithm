package 백준_알고리즘_기초02;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class P006_그래프1_이분그래프 {
	static int v, e;
	static int[] color;
	static int RED=1, BLUE=-1;
	static ArrayList<ArrayList<Integer>> list;
	static String answer;
	public static boolean bfs(int idx) {
		Queue<Integer> q=new LinkedList<>();
		q.add(idx);
		color[idx]=RED;
		
		while(!q.isEmpty()) {
			int node=q.poll();
			for(int i:list.get(node)) {
				int nodeColor=color[node];
				if(color[i]==0) {
					color[i]=nodeColor*-1;
					q.add(i);
				}
				else if(color[i]==nodeColor) {
					answer="NO";
					return false;
				}
			}
		}
		answer="YES";
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k=scan.nextInt();
		for(int i=0;i<k;i++) {
			answer="";
			v=scan.nextInt();
			e=scan.nextInt();
			list=new ArrayList<>();
			for(int j=0;j<v;j++) {
				list.add(new ArrayList<Integer>());
			}
			for(int j=0;j<e;j++) {
				int a=scan.nextInt()-1;
				int b=scan.nextInt()-1;
				list.get(a).add(b);
				list.get(b).add(a);
			}
			color=new int[v];
			for(int j=0;j<v;j++) {
				if(color[j]==0) {
					boolean chk=bfs(j);
					if(!chk) break;
				}
			}
			
			System.out.println(answer);
		}
	}
}