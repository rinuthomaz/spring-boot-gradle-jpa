/**
 * 
 */
package com.dei.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.dei.model.Resources;
import com.dei.model.Checkout;


/**
 * @author rthoma24
 * Apr 25, 2016
 */
public interface CheckoutService {
	
	public List<Checkout> findById(List<String> id);
	//public List<Checkout> findByDateAndShift(List<String> shift);
	public List<Checkout> findByAssignedDateAndShift(String assignedDate, String shift) throws ParseException;
	public List<Checkout> findByMaIdMrfIdAssignedDateShift(String maId, String mrfId, String assignedDate, String shift);
	public String saveCheckout(String id);
	public List<Checkout> findByMaIdAndMrfId(String maId, String mrfId);
	

}
