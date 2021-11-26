import java.beans.Visibility;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import Algorithm_basic_Top10.DFS;

public class Hello {
	
	static int[][] computers ={
				{1, 1, 0}, 
				{1, 1, 0}, 
				{0, 0, 1}
				}; 
	
	static int solution(int n ,int[][] computers){
		int anwer=0; 
		int N =0; 
		for(int i=0; i<computers.length; i++){
			for(int j=0; j<computers[i].length; j++){
				if(computers[i][j]==1){
					N++; 
				}
			}
		}
		boolean[] visited =new boolean[N]; 
		
				
	
		
		return anwer; 
	}
	
	static int DFS(int n , int a , int[][] c){
		
		return  a; 
	}
	
	public static void main(String[] args) {
		
	}
}
