/**
 * 
 */
package com.dei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author rthoma24
 * May 2, 2016
 */
public class DeiUtilty {
	
	public String getDateBasedOnFormat(String date1, String inputFormat, String outPutFormat) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat(inputFormat);
		 String dateInString = date1;
		 Date date = formatter.parse(dateInString);
		 
		 String DATE_FORMAT = outPutFormat;
		 
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	        String newDate = sdf.format(date);
	        return newDate.toString();
	}
	
}
