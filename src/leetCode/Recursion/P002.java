package leetCode.Recursion;

import java.util.Iterator;
import java.util.LinkedList;

//Swap Nodes in Pairs
//https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681/
//https://www.youtube.com/watch?v=-xwX521Ija4
public class P002 {

	public static void main(String[] args) {
		
		LinkedList<String> color = new LinkedList<>(); 		
		
		color.add("black");
		color.add("white");
		color.add("red");
		color.add(0,"green"); 
		color.set(0, "blue"); 
		color.add("sky"); 
		System.out.println(color);
		
		
		Iterator<String> iter = color.iterator(); 
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
}
