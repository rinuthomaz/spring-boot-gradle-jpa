/**
 * 
 */
package com.dei.service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dei.domain.DeiResourceType;
import com.dei.domain.DeiResources;
import com.dei.model.Resources;
import com.dei.repositories.DeiResourcesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author rthoma24
 * May 3, 2016
 */
@Service
public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
	private DeiResourcesRepository deiResourcesRepository;
	
	@Override
	public List<Resources> findById(List<Integer> id) {
		List<DeiResources> deiResources = deiResourcesRepository.findById(id);
		List<Resources> newList = new ArrayList<>();
		for (DeiResources deiResources2 : deiResources) {
			Resources resources = new Resources();
			resources.setId(deiResources2.getId());
			resources.setEmployeeId(deiResources2.getEmployeeId());
			resources.setFirstName(deiResources2.getFirstName());
			resources.setLastName(deiResources2.getLastName());
			resources.setShift(deiResources2.getShift());
			resources.setLanguagePref(deiResources2.getLanguagePref());
			resources.setDeiCertification(deiResources2.getDeiCertification());
			resources.setDeiResourceType(deiResources2.getDeiResourceType());
			if (!newList.contains(resources)) {
                 newList.add(resources);
             }
		}
		return newList;
	}

	
	
	@Override
	public List<Resources> findByMaIdAndMrfId(String maId, String mrfId) {
		List<DeiResources> deiResources = deiResourcesRepository.findByMaIdAndMrfId(maId, mrfId);
		List<Resources> newList = new ArrayList<>();
		for (DeiResources deiResources2 : deiResources) {
			Resources resources = new Resources();
			resources.setId(deiResources2.getId());
			resources.setEmployeeId(deiResources2.getEmployeeId());
			resources.setFirstName(deiResources2.getFirstName());
			resources.setLastName(deiResources2.getLastName());
			resources.setShift(deiResources2.getShift());
			resources.setLanguagePref(deiResources2.getLanguagePref());
			resources.setDeiCertification(deiResources2.getDeiCertification());
			resources.setDeiResourceType(deiResources2.getDeiResourceType());
			if (!newList.contains(resources)) {
                 newList.add(resources);
             }
		}
		return newList;
	}



	/* (non-Javadoc)
	 * @see com.dei.service.ResourceService#setNewIsActiveForDeiResources(java.lang.Integer)
	 */
	@Override
	public Integer setNewIsActiveForDeiResources(List<Integer> id) {
		return deiResourcesRepository.setNewIsActiveForDeiResources(id);
	}

	//test - delete later
	@Override
	public void saving(){
		Date dd = new Date();
		DeiResources dei = new DeiResources();
		
		DeiResourceType deii =  new DeiResourceType();
		Set<DeiResourceType> deiResourceType = new HashSet<DeiResourceType>();
		deii.setTypeValue("Driver");
		deii.setResourceId(dei.getId());
		deiResourceType.add(deii);

		dei.setEmployeeId("unique1");
		dei.setShift("1");
		dei.setLanguagePref("English");
		dei.setMaId("K00139");
		dei.setMrfId("MRF");
		dei.setIsActive("1");
		dei.setCreatedBy("rinu");
		dei.setCreatedOn(dd);
		dei.setDeiResourceType(deiResourceType);
		deiResourcesRepository.save(dei);
	}
//	
	/* (non-Javadoc)
	 * @see com.dei.service.ResourceService#findByMaIdAndMrfId(java.lang.String, java.lang.String)
	 */
//	@Override
//	public List<Resources> findByMaIdAndMrfId(String maId, String mrfId) {
//		List<DeiResources> deiResources = deiResourcesRepository.findByMaIdAndMrfId(maId, mrfId);
//		List<Resources> newList = new ArrayList<>();
//		for (DeiResources deiResources2 : deiResources) {
//			Resources resources = new Resources();
//			resources.setId(deiResources2.getId());
//			resources.setEmployeeId(deiResources2.getEmployeeId());
//			resources.setFirstName(deiResources2.getFirstName());
//			resources.setLastName(deiResources2.getLastName());
//			resources.setShift(deiResources2.getShift());
//			resources.setLanguagePref(deiResources2.getLanguagePref());
//			resources.setDeiCertification(deiResources2.getDeiCertification());
//			resources.setEmplyoyeeType("Operator");
//			if (!newList.contains(resources)) {
//                 newList.add(resources);
//             }
//		}
//		return newList;
//	}
//
//	/* (non-Javadoc)
//	 * @see com.dei.service.CheckoutService#findByIdOrderById(java.util.List)
//	 */
//	@Override
//	public List<Resources> findByIdOrderById(List<String> id) {
//		List<DeiResources> deiResources = deiResourcesRepository.findById(id);
//		List<Resources> newList = new ArrayList<>();
//		for (DeiResources deiResources2 : deiResources) {
//			Resources resources = new Resources();
//			resources.setId(deiResources2.getId());
//			resources.setEmployeeId(deiResources2.getEmployeeId());
//			resources.setFirstName(deiResources2.getFirstName());
//			resources.setLastName(deiResources2.getLastName());
//			resources.setDeiResourceType(deiResources2.getDeiResourceType());
//			if (!newList.contains(resources)) {
//                 newList.add(resources);
//             }
//		}
//		return newList;
//	}
	

	
	/* (non-Javadoc)
	 * @see com.dei.service.ResourceService#setFixedIsActiveFor(java.util.List)
	 */
//	@Override
//	public int setFixedIsActiveFor(List<String> id) {
//		return deiResourcesRepository.setIsActiveFor(id);
//	}

	/* (non-Javadoc)
	 * @see com.dei.service.ResourceService#findByResourceId(java.util.List)
	 */
//	@Override
//	public List<Resources> findByResourceId(List<String> id) {
//		List<DeiResources> deiResources = deiResourcesRepository.findById(id);
//		List<Resources> newList = new ArrayList<>();
//		for (DeiResources deiResources2 : deiResources) {
//			Resources resources = new Resources();
//			resources.setId(deiResources2.getId());
//			resources.setEmployeeId(deiResources2.getEmployeeId());
//			resources.setFirstName(deiResources2.getFirstName());
//			resources.setLastName(deiResources2.getLastName());
//			resources.setDeiResourceType1(deiResources2.getDeiResourceType());
//			//resources.setEmplyoyeeType(deiResources2.getTypeId());
//			if (!newList.contains(resources)) {
//                 newList.add(resources);
//             }
//		}
//		return newList;
//	}

	/* (non-Javadoc)
	 * @see com.dei.service.ResourceService#saveMethod(java.util.List)
	 */
//	@Override
//	public String saveMethod(List<String> id) {
//		Date dd = new Date();
//		// TODO Auto-generated method stub
//		List<DeiResources> deiResources = deiResourcesRepository.findById(id);
//		DeiResources copy = new DeiResources();
//		if(!deiResources.isEmpty() && deiResources.size() == 1){ 
//		for (DeiResources deiResources2 : deiResources) {
//			copy.setId(deiResources2.getId());
//			copy.setEmployeeId(deiResources2.getEmployeeId());
//			copy.setLanguagePref(deiResources2.getLanguagePref());
//			copy.setMaId(deiResources2.getMaId());
//			copy.setMrfId(deiResources2.getMrfId());
//			copy.setCreatedBy(deiResources2.getCreatedBy());
//			copy.setCreatedOn(deiResources2.getCreatedOn());
//			copy.setModifiedBy("rinu");
//			copy.setModifiedOn(dd);
//			copy.setIsActive("0");
//			if (!deiResources.contains(copy)) {
//				deiResources.add(copy);
//            }
//		}
//		}
//		deiResourcesRepository.save(deiResources);
//		return "sucess";
//	}
//
//	/* (non-Javadoc)
//	 * @see com.dei.service.ResourceService#saveResourceInformation(java.lang.String)
//	 */
//	@Override
//	public void saveResourceInformation(String userData) {
//		 Date dd = new Date();
//		 DeiResources deiResources = new DeiResources();
//		 Resources resources = new Resources();
//		 
//		 deiResources.setCreatedOn(dd);
//		 deiResources.setCreatedBy("rinu");
//		 try {
//			BeanUtils.copyProperties(deiResources, resources);
//			
//		} catch (IllegalAccessException | InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		 //org.apache.commons.beanutils.PropertyUtilsBean.copyProperties(Object deiResources, Object resources);
//		 deiResourcesRepository.save(deiResources);
//	}
//
//	/* (non-Javadoc)
//	 * @see com.dei.service.ResourceService#saveResourceInfo(java.lang.String)
//	 */
	@Override
	
	public void saveResourceInfo(String json) {
		Date dd = new Date();
		DeiResources deiResources = new DeiResources();
		ObjectMapper mapper = new ObjectMapper();
		try {
			Resources resources = mapper.readValue(json, Resources.class);
			System.out.println("initial " +resources.getEmployeeId());
			BeanUtils.copyProperties(deiResources, resources);
			System.out.println("later " + deiResources.getEmployeeId());
			deiResources.setCreatedBy("logged-in-user");
			deiResources.setCreatedOn(dd);
			deiResources.setIsActive("1");
			System.out.println(" employId - "+deiResources.getEmployeeId() +"\n fname " +deiResources.getFirstName() +"\n lastName " +deiResources.getLastName() 
					+ "\ncreated by" +deiResources.getCreatedBy() +"\n created on -"+deiResources.getCreatedOn()
					 + "\n shift " + deiResources.getShift()+ " \n maId " +deiResources.getMaId()+ "\n mrf "+deiResources.getMrfId()
					 + "\n isactive " +deiResources.getIsActive());
			deiResourcesRepository.save(deiResources);
			
		} catch (IOException | IllegalAccessException | InvocationTargetException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		
	  
	    
	}
}