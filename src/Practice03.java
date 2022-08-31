import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;

public class Practice03 {

	
	public static boolean validationDay(String day){
		
		if(day.length()!=8){
			return false;
		}
		
		Integer iYear = Integer.parseInt(day.substring(0,4)); 
		Integer iMonth=Integer.parseInt(day.substring(4,6)); 
		Integer  iDay = Integer.parseInt(day.substring(6,8)); 		
		
		if(12  < iMonth){
			return false;
		}

		int[] aDaysInMonth ={31,28,31,30,31,30,31,31,30,31,30,31};

		int iDaysInMonth = (iMonth!=2)?aDaysInMonth[iMonth-1]:((iYear%4==0 && iYear%100!=0 || iYear % 400==0)?29:28);
		
		
		if( (iDay!=null && iMonth!=null && iYear!=null  && 
				iMonth<13 && 
				iMonth>0 && 
				iDay>0 && iDay<=iDaysInMonth) == false ){
			return false;
		}
		
		return true; 
	}

	public static void main(String[] args) {
		
		String str="3.000000";
		DecimalFormat df1 = new DecimalFormat("#,##0.0");
		System.out.println(df1.format(Double.parseDouble(str)));
		
	}

}

