/**
 * 
 */
package com.dei.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dei.Application;
import com.dei.model.Resources;

/**
 * @author rthoma24
 * May 5, 2016
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class })
@TestPropertySource(locations = "classpath:application-test.properties")
public class ResourceServiceImplTest {
	

	Logger LOGGER = LoggerFactory.getLogger("com.dei.model.Resources.ResourceServiceImplTest");
	
	@Autowired
	private ResourceService resourceService;
	
	@Test
	public void testDataFromResourceTypeTable(){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		List<Resources> testResult = resourceService.findById(list);
		LOGGER.info("logger test");
		Assert.assertNotNull(testResult);
        Assert.assertEquals(testResult.size(), 1);
		
	}
	
	@Test
	public void testResourcesByMaidAndMrfId(){
		
		String maId = "K00139";
		String mrfId = "MRF";
		List<Resources> testResult = resourceService.findByMaIdAndMrfId(maId, mrfId);
		Assert.assertNotNull(testResult);
        Assert.assertEquals(testResult.size(), 3);
	}
	
	@Test
	public void testUpdateResourceOption(){
		List<Integer> id = new ArrayList<>();
		id.add(1);
		id.add(3);
		Integer testResult =1;
		//Integer testResult = resourceService.setNewIsActiveForDeiResources(id);
		LOGGER.info("testResult logger "+ testResult);
	}
	
	@Test
	public void testSave(){
		resourceService.saving();
	}
	
	@Test
	public void testSaveOneLevelFromJson(){
		String json = "{\"employeeId\":\"test125\",\"firstName\":\"Rinu\",\"lastName\":\"L\",\"shift\":\"1\",\"languagePref\":\"English\",\"mrfId\":\"MRF\",\"maId\":\"K00139\",\"deiCertification\":\"Tipper\"}";
		resourceService.saveResourceInfo(json);
	}

}
