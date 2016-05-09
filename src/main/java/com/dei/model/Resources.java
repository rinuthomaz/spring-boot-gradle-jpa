/**
 * 
 */
package com.dei.model;

import java.util.List;
import java.util.Set;

import com.dei.domain.DeiCheckout;
import com.dei.domain.DeiResourceType;
import com.dei.domain.DeiResources;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author rthoma24
 * May 3, 2016
 */
@JsonInclude(value = Include.NON_NULL)
public class Resources {

	private int id;
	private String employeeId;
	private String firstName;
	private String lastName;
	private String shift;
	private String languagePref;
	private String deiCertification;
	private String maId;
	private String mrfId;
	private String isActive;
	private String createdOn;
	private String createdBy;
	private String modifiedOn;
	private String modifiedBy;
	private String emplyoyeeType;
	private List<DeiResourceType> deiResourceType2;
 	private Set<DeiResourceType> deiResourceType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getLanguagePref() {
		return languagePref;
	}
	public void setLanguagePref(String languagePref) {
		this.languagePref = languagePref;
	}
	public String getDeiCertification() {
		return deiCertification;
	}
	public void setDeiCertification(String deiCertification) {
		this.deiCertification = deiCertification;
	}
	public String getMaId() {
		return maId;
	}
	public void setMaId(String maId) {
		this.maId = maId;
	}
	public String getMrfId() {
		return mrfId;
	}
	public void setMrfId(String mrfId) {
		this.mrfId = mrfId;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getEmplyoyeeType() {
		return emplyoyeeType;
	}
	public void setEmplyoyeeType(String emplyoyeeType) {
		this.emplyoyeeType = emplyoyeeType;
	}
	public Set<DeiResourceType> getDeiResourceType() {
		return deiResourceType;
	}
	public void setDeiResourceType(Set<DeiResourceType> deiResourceType) {
		this.deiResourceType = deiResourceType;
	}
	
	
}
