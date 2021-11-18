import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class Hello {

	public static String parsingReplace(String value){
		String value2=value;
		value2=value2.replace('?',' ');			//?
		value2=value2.replaceAll(",","");		//ÄÞ¸¶
		value2=value2.replaceAll("\'","");
		value2=value2.replaceAll("\"","¡È");
		value2=value2.replaceAll("%","£¥");
		value2=value2.replaceAll("#","££");
		if(value2.indexOf(".")!=-1){
			value2=value2.substring(0, value2.indexOf(".")); 
		}
		value2=value2.trim();

		return value2;
		
	}
	
	public static void main(String[] args) {

		String str = "109.9"; 
		
		int idx = str.indexOf("."); 
		System.out.println(parsingReplace(str));
		
		
		
	}
}
