/**
 * 
 */
package com.dei.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dei.service.ResourceServiceImpl;

/**
 * @author rthoma24
 * Apr 25, 2016
 */
public class SandBox {
	
	public static void main(String[] args) {
		String json ="{\"employeeId\":\"test123\",\"firstName\":\"Rinu\",\"lastName\":\"L\",\"shift\":\"1\",\"languagePref\":\"English\",\"deiCertification\":\"Tipper\",\"deiResourceType\":[{\"typeValue\":\"Operator\"},{\"typeValue\":\"Driver\"}]}";
		json = "{\"employeeId\":\"test123\",\"firstName\":\"Rinu\",\"lastName\":\"L\",\"shift\":\"1\",\"languagePref\":\"English\",\"mrfId\":\"MRF\",\"maId\":\"K00139\",\"deiCertification\":\"Tipper\"}";
		ResourceServiceImpl kk = new ResourceServiceImpl();
		kk.saveResourceInfo(json);
	}
	
//	public static void main(String[] args) throws ParseException {
//		
//		String date1  = "2016-05-21";
//		String inputFormat = "yyy-mm-dd";
//		String outPutFormat = "yyyy-mm-dd";
//		SandBox ss = new SandBox();
//		ss.getDateBasedOnFormat(date1, inputFormat, outPutFormat);
////		 Date date = new Date();
//		 
////		 SimpleDateFormat formatter = new SimpleDateFormat("yyy-mm-dd");
////				 String dateInString = "2016-05-21";
////				 Date date = formatter.parse(dateInString);
////				 System.out.println(date);
////				 
////				 String DATE_FORMAT = "yyyy-mm-dd";
////			        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
////			        String newDate = sdf.format(date);
////			        System.out.println(newDate);
//	}
	
	public String getDateBasedOnFormat(String date1, String inputFormat, String outPutFormat) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat(inputFormat);
		 String dateInString = date1;
		 Date date = formatter.parse(dateInString);
		 System.out.println(date);
		 
		 String DATE_FORMAT = outPutFormat;
		 
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	        String newDate = sdf.format(date);
	        System.out.println(newDate);
	        return newDate.toString();
	}
	//	public Date tt(String a){
//		SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
//
//        Date d = sdf.parse("02-05-2016");
//
//        sdf.applyPattern("mm/dd/yyyy");
//
//        System.out.println(sdf.format(d));
//		return sdf.toda;
//	}


}
