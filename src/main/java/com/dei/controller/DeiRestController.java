package com.dei.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dei.model.Checkout;
import com.dei.model.Resources;
import com.dei.service.CheckoutService;
import com.dei.service.ResourceService;

@RestController
public class DeiRestController {
	

    @Autowired
    private CheckoutService checkoutService;

    @Autowired
    private ResourceService resourceService;
    
    @RequestMapping("/resources/{id}")
    public List<Resources> findById(@PathVariable("id")List<Integer> id){
    	System.out.println("id " +id);
    	return resourceService.findById(id);
    }
    //to get resources based on ma and mrf
    @RequestMapping("/resources/{maId}/{mrfId}")
    public List<Resources> findByMaIdAndMrfId(@PathVariable("maId")String maId, @PathVariable("mrfId")String mrfId){
    	System.out.println("maId "+maId+" mrfID "+mrfId);
    	return resourceService.findByMaIdAndMrfId(maId, mrfId);
    }
    
    //make a resource inactive
    @RequestMapping(value = { "/updateResource/{id}" }, method = RequestMethod.PUT)
    public ResponseEntity makeUserInactive(@PathVariable("id")List<Integer> id) {
    	resourceService.setNewIsActiveForDeiResources(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @RequestMapping("/delete/{id}")
    public String makeUserInactive1(@PathVariable("id")List<Integer> id) {
    	resourceService.setNewIsActiveForDeiResources(id);
        return "success";
    }
    
//    //to save resource
    @RequestMapping(value = { "/saveResources" }, method = RequestMethod.POST)
    public ResponseEntity saveResource(@RequestBody String json) {

    	resourceService.saveResourceInfo(json);
        
        return new ResponseEntity(HttpStatus.OK);
    } 
//        
//    
//    @RequestMapping(value="/add", method=RequestMethod.POST, consumes="application/json")
//    public void addOrder(@RequestBody String json) {
//    	resourceService.saveResourceInfo(json);
//    }
    //---------------------
  
    @RequestMapping("/findById/{checkoutid}")
    public List<Checkout> getTemplateById(@PathVariable("checkoutid")List<String> checkoutid){
     return checkoutService.findById(checkoutid);                        

   }
    
    @RequestMapping("/checkout/{maId}/{mrfId}/{assignedDate}/{shift}")
    public List<Checkout> findByMaIdMrfIdAssignedDateShift(@PathVariable("maId")String maId,@PathVariable("mrfId")String mrfId,@PathVariable("assignedDate")String assignedDate,@PathVariable("shift")String shift){
    return checkoutService.findByMaIdMrfIdAssignedDateShift(maId, mrfId, assignedDate, shift);           

   }
    
//    @RequestMapping("/mamrf/{maId}/{mrfId}")
//    public List<Checkout> findByMaIdAndMrfId(@PathVariable("maId")String maId,@PathVariable("mrfId")String mrfId){
//    	return checkoutService.findByMaIdAndMrfId(maId, mrfId);
//    }
    
    @RequestMapping("/checkout1/{assignedDate}/{shift}")
    public List<Checkout> findByAssignedDateAndShift(@PathVariable("assignedDate")String assignedDate,@PathVariable("shift")String shift) throws ParseException{
     return checkoutService.findByAssignedDateAndShift(assignedDate,shift);              

   }
    
    
    
    // save or update- test
    @RequestMapping(value = { "/save/{id}" }, method = RequestMethod.PUT)
    public ResponseEntity saveUserdefined(@PathVariable(value = "id") String id)
    {
    	checkoutService.saveCheckout(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    
	@RequestMapping("/wssave/{id}")
	public String saveTest(@PathVariable("id")String id){
		checkoutService.saveCheckout(id);
		return "saved";
	}

}

