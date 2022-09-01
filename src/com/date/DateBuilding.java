package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateBuilding {
public static void main(String[] args) throws Exception {
     patternTest("yyyy-MMM-dd" );


}
public static void patternTest( String dateTargetPattern ) throws Exception {
	 SimpleDateFormat dateFormat=new SimpleDateFormat();
	 
	 dateFormat.applyPattern(dateTargetPattern);
	 String date1=dateFormat.format(Calendar.getInstance().getTime());
	 System.out.println( "Pattern based Date Value: " + date1);
	 
	 
	 DateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
	 Date date = formatter.parse(date1);
		System.out.println(date);
//2022-Sep-01

}
}
