package ���α׷��ӽ�_�����ڵ��׽�Ʈ;

import java.beans.Visibility;
import java.util.Stack;

public class P001 {

	  public static int solution(String[] drum) {
	  
		  int answer = 0;
		  int length=drum.length; 
			  
		  char[][] newArr=new char[length][length]; 
			for(int i=0; i<length; i++){
				for(int  j=0; j<drum[i].length(); j++){
					newArr[i][j]=drum[i].charAt(j); 
				}
			}
			
			for(int i=0; i<newArr.length; i++){
				for(int j=0; j<newArr[i].length; j++){
		
					if(i==0){
						//DFS(i,j,newArr);
						System.out.println(DFS(i,j,newArr));
						if(DFS(i,j,newArr)!=2){
							answer++; 
						}
					
					
					}
					
				}
			}
			
			//ù ����Ƚ��
			//(0,0), (0,1), (0,2), (0,3), (0,4), (0,5) �ϋ���
			//(1,0), (1,1), (1,2), (1,3), (1,4), (1,5) �� �ݵ�� �̵��ؾ� �Ѵ�.   �̶����� �����̴�. 
			
			/*
			 
			 */
		  
	      return answer; 
	  }
	  
	  static class Point{
		  int row,col; 
		  public Point(int r, int c){
			  this.row=r; 
			  this.col=c; 
		  }
	  }
	  
	  static int DFS( int o1, int o2,char[][] newArr){
		  
		  Stack<Point> stack=new Stack<>(); //stack ���Լ��� 
		  stack.push(new Point(o1, o2)); 
		  int[][] D ={{1,0},
				  		 {0,-1},
				  		 {0,1}}; //��, ��, �� 
		  int count=0; 
		  
		  while(!stack.isEmpty()){
			  Point curr = stack.pop(); 
			  if(curr.row==newArr.length) continue; 
			  //System.out.println("("+curr.row+","+curr.col+")");

			  if(newArr[curr.row][curr.col]=='#'){ //{1,0} ,�� 
				  int nr = curr.row + D[0][0];  //1 + 1 (2,0)
				  int nc = curr.col  + D[0][1];  //0 + 0 
				  stack.push(new Point(nr, nc)); 
				  
			  }else if(newArr[curr.row][curr.col]=='<'){ //{0,-1} , ��
				  int nr = curr.row + D[1][0]; 
				  int nc = curr.col  + D[1][1];
				  stack.push(new Point(nr, nc)); 
				  
			  }else if(newArr[curr.row][curr.col]=='>'){ //{0,1} , �� 
				  int nr = curr.row + D[2][0]; //1 + 0 = 1
				  int nc = curr.col  + D[2][1]; //0 + 1 = 1
				  stack.push(new Point(nr, nc)); 
				  
			  }else{  //{1,0} *�� 2�� ������ ��ž 
				  count++; 
				  int nr = curr.row + D[0][0]; 
				  int nc = curr.col  + D[0][1];
				  stack.push(new Point(nr, nc)); 
			  }
			  
			  if(count==2) break; 

					  
		  }
		  
		  return count; 
	  }
	  
	  
	  
	  
	  

	public static void main(String[] args) {

		String[] arr = {"######",
							">#*###",
							"####*#",
							"#<#>>#",
							">#*#*<",
							"######"};
		int length=arr.length; 
		//�̰� �ϴ� 2�����迭�� ������ �Ѵ�. 
		//���⼭ �ϴ� 1�� �Ǻ��� �� 
		char[][] newArr=new char[length][length]; 
		
		//�� �Ǻؿͼ� �̰� ���� ������ �ϴ� ���ߴ�. 
		for(int i=0; i<length; i++){
			for(int  j=0; j<arr[i].length(); j++){
				newArr[i][j]=arr[i].charAt(j); 
			}
		}
		
//		solution(arr); 
//		solution(arr);
		System.out.println(solution(arr));
		
//		for(int i=0; i<newArr.length; i++){
//			for(int j=0; j<newArr[i].length; j++){
//				if(i==1){
//		
//					//System.out.println("DFS("+i+","+j+")");
//				}
//			}
//			System.out.println();
//		}
		//�� �� �� 
		
		
	}
}
