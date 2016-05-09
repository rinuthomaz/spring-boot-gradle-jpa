/**
 * 
 */
package com.dei.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author rthoma24
 * May 4, 2016
 */
@Entity
public class DeiResourceType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8904873320161821445L;
	private int id;
	private int resourceId;
	private String typeValue;
	
	@JsonBackReference
	private DeiResources deiResource;
	
	public DeiResourceType(){
		
	}

	public DeiResourceType(int resourceId, String typeValue) {
		// super(id, employeeId, firstName, lastName, shift, languagePref, deiCertification, maId, mrfId);
		//super();
		 this.resourceId = resourceId;
		 this.typeValue = typeValue;
		}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTypeValue() {
		return typeValue;
	}

	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name = "resourceId", referencedColumnName="id",insertable = false, updatable = false)
	public DeiResources getDeiResource() {
		return deiResource;
	}

	public void setDeiResource(DeiResources deiResource) {
		this.deiResource = deiResource;
	}


}
