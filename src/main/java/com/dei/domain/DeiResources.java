/**
 * 
 */
package com.dei.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.dei.model.Resources;

/**
 * @author rthoma24
 * May 3, 2016
 */
@Entity
@Table(name = "Dei_Resources")
public class DeiResources {

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
	private Date createdOn;
	private String createdBy;
	private Date modifiedOn;
	private String modifiedBy;
	private Set<DeiResourceType> deiResourceType;
	
	
	
	public DeiResources(){
		
	}
	
	public DeiResources(int id, String employeeId, String firstName, String lastName, String shift, String languagePref, String deiCertification, String maId, String mrfId){
		super();
		this.id	= id;
		this.employeeId	= employeeId;
		this.firstName	= firstName;
		this.lastName	= lastName;
		this.shift	= shift;
		this.languagePref	= languagePref;
		this.deiCertification	= deiCertification;
		this.maId	= maId;
		this.mrfId	= mrfId;
//		this.setDeiResourceType(deiResourceType);
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "deiResource", cascade = CascadeType.ALL)
	public Set<DeiResourceType> getDeiResourceType() {
		return deiResourceType;
	}

	public void setDeiResourceType(Set<DeiResourceType> deiResourceType) {
		this.deiResourceType = deiResourceType;
	}
	
}

