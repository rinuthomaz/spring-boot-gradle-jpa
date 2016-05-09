package com.dei.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dei.DeiUtilty;
import com.dei.domain.DeiCheckout;
import com.dei.domain.DeiEquipments;
import com.dei.domain.DeiResources;
import com.dei.model.Checkout;
import com.dei.model.Resources;
import com.dei.repositories.DeiCheckoutRepository;
import com.dei.repositories.DeiEquipmentsRepository;
import com.dei.repositories.DeiResourceTypeRepository;


/**
 * @author rthoma24
 * Apr 25, 2016
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

		
		@Autowired 
		private DeiCheckoutRepository deiCheckoutRepository;
		
		@Autowired
		private DeiEquipmentsRepository deiEquipmentsRepository;
		
		
		
		/* (non-Javadoc)
		 * @see com.dei.service.CheckoutService#findById(java.lang.String)
		 */
		@Override
		public List<Checkout> findById(List<String> id) {
			List<DeiCheckout> deiList = deiCheckoutRepository.findById(id);
			List<Checkout> newList = new ArrayList<>();

			 for (DeiCheckout deiCheckout : deiList) {
				 Checkout copy = new Checkout();
				 copy.setEquipmentId(deiCheckout.getEquipmentId());
				 copy.setResourceId(deiCheckout.getResourceId());
				 copy.setAssignedBy(deiCheckout.getAssignedBy());
             if (!newList.contains(copy)) {
                 newList.add(copy);
             }
         }
         return newList;
		}



		/* (non-Javadoc)
		 * @see com.dei.service.CheckoutService#findByDateAndShift(java.lang.String, java.lang.String)
		 */
		/*@Override
		public List<Checkout> findByDateAndShift(List<String> shift) {
			List<DeiCheckout> deiList = deiCheckoutRepository.findByShift(shift);
			List<Checkout> newList = new ArrayList<>();

			 for (DeiCheckout deiCheckout : deiList) {
				 Checkout copy = new Checkout();
				 copy.setAssignedBy(deiCheckout.getAssignedBy());
				 copy.setShift(deiCheckout.getShift());
				 copy.setEquipmentId(deiCheckout.getEquipmentId());
				 copy.setResourceId(deiCheckout.getResourceId());
             if (!newList.contains(copy)) {
                 newList.add(copy);
             }
         }
         return newList;
		}*/



		/* (non-Javadoc)
		 * @see com.dei.service.CheckoutService#findByAssignedDateAndShift(java.lang.String, java.lang.String)
		 */
		@Override
		public List<Checkout> findByAssignedDateAndShift(String assignedDate,
				String shift) throws ParseException {
			DeiUtilty dd = new DeiUtilty();
			System.out.println(" rinu    => " +dd.getDateBasedOnFormat(assignedDate, "yyyy-mm-dd", "yyyy-mm-dd"));
			List<DeiCheckout> deiList = deiCheckoutRepository.findByAssignedDateAndShift(dd.getDateBasedOnFormat(assignedDate, "yyyy-mm-dd", "yyyy-mm-dd"), shift);
			List<Checkout> newList = new ArrayList<>();

			 for (DeiCheckout deiCheckout : deiList) {
				 Checkout copy = new Checkout();
				 copy.setAssignedBy(deiCheckout.getAssignedBy());
				 copy.setShift(deiCheckout.getShift());
				 copy.setEquipmentId(deiCheckout.getEquipmentId());
				 copy.setResourceId(deiCheckout.getResourceId());
             if (!newList.contains(copy)) {
                 newList.add(copy);
             }
         }
         return newList;
		}



		/* (non-Javadoc)
		 * @see com.dei.service.CheckoutService#saveCheckout(java.lang.String)
		 */
		@Override
		public String saveCheckout(String id) {
			Date dd = new Date();
		        DeiCheckout checkOut = new DeiCheckout();
		        checkOut.setId(id);
		        checkOut.setEquipmentId("1");
		        checkOut.setResourceId("1");
		        checkOut.setAssignedDate(dd);
		        checkOut.setAssignedBy("rinu");
		        checkOut.setShift("3");
		        checkOut.setIsActive("1");
		        checkOut.setStatusCode("01");
		        deiCheckoutRepository.save(checkOut);
return "success";
		    }



		/* (non-Javadoc)
		 * @see com.dei.service.CheckoutService#findByMaIdMrfIdAssignedDateShift(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
		 */
		@Override
		public List<Checkout> findByMaIdMrfIdAssignedDateShift(String maId,
				String mrfId, String assignedDate, String shift) {
			List<Checkout> newList = new ArrayList<>();
			List<DeiCheckout> deiList = deiCheckoutRepository.findByShift(shift);
			System.out.println(" deiList --> " +deiList +"  and size "+deiList.size());
			if(!deiList.isEmpty()){
				System.out.println(" deiList1 --> " +deiList +"  and size "+deiList.size());
			 for (DeiCheckout deiCheckout : deiList) {
				 Checkout copy = new Checkout();
				 List<DeiEquipments> deiEquipments = deiEquipmentsRepository.findById(deiCheckout.getId());
				 if(!deiEquipments.isEmpty() && deiEquipments.size() > 1)
				 for (DeiEquipments deiEquipments2 : deiEquipments) {
					 copy.setEquipmentName(deiEquipments2.getName());
					 copy.setEquipmentType(deiEquipments2.getType());
					 copy.setEquipmentDescription(deiEquipments2.getDescription());
				}
				 copy.setAssignedBy(deiCheckout.getAssignedBy());
				 copy.setShift(deiCheckout.getShift());
				 copy.setEquipmentId(deiCheckout.getEquipmentId());
				 copy.setResourceId(deiCheckout.getResourceId());
             if (!newList.contains(copy)) {
                 newList.add(copy);
             }
             }
         }else{
        	 List<DeiEquipments> deiEquipmentsList = deiEquipmentsRepository.findDistinctDeiEquipmentsByMaIdOrMrfId(maId, mrfId);
        	 System.out.println("in the else part "+deiEquipmentsList.size()+ "maID " +maId + "  mrf"+mrfId);
        	 for (DeiEquipments deiEquipments : deiEquipmentsList) {
        		 Checkout copy = new Checkout();
        		 copy.setEquipmentName(deiEquipments.getName());
				 copy.setEquipmentType(deiEquipments.getType());
				 copy.setEquipmentDescription(deiEquipments.getDescription());
				 copy.setAssignedBy("");
				 copy.setShift("");
				 copy.setEquipmentId("");
				 copy.setResourceId("");
				 if (!newList.contains(copy)) {
	                 newList.add(copy);
	             }
			}
         }
		
         return newList;
		}



		/* (non-Javadoc)
		 * @see com.dei.service.CheckoutService#findByMaIdAndMrfId(java.lang.String, java.lang.String)
		 */
		@Override
		public List<Checkout> findByMaIdAndMrfId(String maId, String mrfId) {
			List<DeiEquipments> deiEq = deiEquipmentsRepository.findByMaIdAndMrfId(maId, mrfId);
			System.out.println("rinu "+deiEq.size());
			List<Checkout> newList = new ArrayList<>();
			for (DeiEquipments deiEquipments : deiEq) {
				 Checkout copy = new Checkout();
				 copy.setEquipmentId(deiEquipments.getId());
				 copy.setResourceId("");
				 copy.setAssignedBy("");
				 copy.setEquipmentName(deiEquipments.getName());
            if (!newList.contains(copy)) {
                newList.add(copy);
            }
				
			}
			return newList;
			 
		}



		
			
	}
