//package com.dei.service;
//
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.dei.Application;
//import com.dei.domain.DeiResources;
//import com.dei.model.Checkout;
//import com.dei.model.Resources;
//
//
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { Application.class })
//@TestPropertySource(locations = "classpath:application-test.properties")
//public class DeiServiceImplTest {
//	
//	
//	@Autowired
//	private CheckoutService checkoutService;
//
//	
//	//----------------------
//	
//	@Test
//    public void testGetCheckOut() {
//	
//		List<String> checkoutid = new ArrayList<String>();
//		checkoutid.add("1");
//		List<Checkout> testResult = checkoutService.findById(checkoutid );
//        Assert.assertNotNull(testResult);
//        Assert.assertEquals(testResult.size(), 1);
//    }
//	
//	@Test
//	public void testGetCheckOutScreenDetails(){
//		String maId="MRF";
//		String mrfId = "K00139";
//		String assignedDate = "";
//		String shift = "11";
//		List<Checkout> testResult = checkoutService.findByMaIdMrfIdAssignedDateShift(maId, mrfId, assignedDate, shift);
//				 Assert.assertNotNull(testResult);
//        Assert.assertEquals(testResult.size(), 3);
//	}
//	
//	@Test
//	public void testGetCheckOutScreenDetails22(){
//		String maId="MRF";
//		String mrfId = "K0013";
//		List<Checkout> testResult = checkoutService.findByMaIdAndMrfId(maId, mrfId);
//				 Assert.assertNotNull(testResult);
//        Assert.assertEquals(testResult.size(), 3);
//	}
//	
//	
//	
//	/*@Test
//	public void testGetTest() throws ParseException{
//		String assignedDate = "2016-04-20";
//		String shift = "1";
//		List<Checkout> testResult = checkoutService.findByAssignedDateAndShift(assignedDate, shift);
//		Assert.assertNotNull(testResult);
//        Assert.assertEquals(testResult.size(), 2);
//	}
//	*/
//	
//	
//	
//	/*@Test
//	public void testInsertion(){
//		String a = checkoutService.saveCheckout("7");
//		System.out.println(a);
//		 
//		}*/
//	
//}
