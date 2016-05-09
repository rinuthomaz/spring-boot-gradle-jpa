/**
 * 
 */
package com.dei.service;

import java.util.List;

import com.dei.model.Resources;

/**
 * @author rthoma24
 * May 3, 2016
 */
public interface ResourceService {
	
//	public List<Resources> findByIdOrderById(List<String> id);
//	public List<Resources> findByMaIdAndMrfId(String maId, String mrfId);
//	int setFixedIsActiveFor(List<String> id);
//	public List<Resources> findByResourceId(List<String> id);
//	public String saveMethod(List<String> id);
//	public void saveResourceInformation(String userData);
//	/**
//	 * @param json
//	 */
	public void saveResourceInfo(String json); //delete later
//	/**
//	 * @param id
//	 * @return
//	 */
	public List<Resources> findById(List<Integer> id);
	public List<Resources> findByMaIdAndMrfId(String maId, String mrfId);
	public Integer setNewIsActiveForDeiResources(List<Integer> id);
	public void saving();//delete later
}
