package javaBasic;

import java.time.Duration;
import java.time.LocalTime;

public class P009_Duration {

	public static void main(String[] args) {
		String time01="05:34";
		String time02="07:59"; 
		LocalTime startTime =LocalTime.of(00, 00);
		LocalTime endTime =LocalTime.of(23, 59); 
		Duration between = Duration.between(startTime, endTime); 
		System.out.println(between.getSeconds()/60);
	}

}
