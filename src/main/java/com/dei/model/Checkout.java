package com.dei.model;

import com.dei.domain.DeiCheckout;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
 /**
 * @author rthoma24
 * Apr 26, 2016
 */
@JsonInclude(value = Include.NON_NULL)
public class Checkout {
	
	private String equipmentId;
    private String resourceId;
    private String assignedBy;
    private String shift;
    private String assignedDate;
    private String isActive;
    private String preTripStatusCode;
    private String postTripStatusCode;
    private String signoffBy;
    private String signoffOn;
    private String modifiedOn;
    private String statusCode;
    private String maintenanceStausCode;
    private String workOrder;
    private String equipmentName;
    private String equipmentType;
    private String equipmentDescription;
    private String maId;
    private String mrfId;
	/**
	 * @return the equipmentId
	 */
	public String getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @param equipmentId the equipmentId to set
	 */
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	/**
	 * @return the resourceId
	 */
	public String getResourceId() {
		return resourceId;
	}
	/**
	 * @param resourceId the resourceId to set
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	/**
	 * @return the assignedBy
	 */
	public String getAssignedBy() {
		return assignedBy;
	}
	/**
	 * @param assignedBy the assignedBy to set
	 */
	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}
	/**
	 * @return the shift
	 */
	public String getShift() {
		return shift;
	}
	/**
	 * @param shift the shift to set
	 */
	public void setShift(String shift) {
		this.shift = shift;
	}
	/**
	 * @return the assignedDate
	 */
	public String getAssignedDate() {
		return assignedDate;
	}
	/**
	 * @param assignedDate the assignedDate to set
	 */
	public void setAssignedDate(String assignedDate) {
		this.assignedDate = assignedDate;
	}
	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the preTripStatusCode
	 */
	public String getPreTripStatusCode() {
		return preTripStatusCode;
	}
	/**
	 * @param preTripStatusCode the preTripStatusCode to set
	 */
	public void setPreTripStatusCode(String preTripStatusCode) {
		this.preTripStatusCode = preTripStatusCode;
	}
	/**
	 * @return the postTripStatusCode
	 */
	public String getPostTripStatusCode() {
		return postTripStatusCode;
	}
	/**
	 * @param postTripStatusCode the postTripStatusCode to set
	 */
	public void setPostTripStatusCode(String postTripStatusCode) {
		this.postTripStatusCode = postTripStatusCode;
	}
	/**
	 * @return the signoffBy
	 */
	public String getSignoffBy() {
		return signoffBy;
	}
	/**
	 * @param signoffBy the signoffBy to set
	 */
	public void setSignoffBy(String signoffBy) {
		this.signoffBy = signoffBy;
	}
	/**
	 * @return the signoffOn
	 */
	public String getSignoffOn() {
		return signoffOn;
	}
	/**
	 * @param signoffOn the signoffOn to set
	 */
	public void setSignoffOn(String signoffOn) {
		this.signoffOn = signoffOn;
	}
	/**
	 * @return the modifiedOn
	 */
	public String getModifiedOn() {
		return modifiedOn;
	}
	/**
	 * @param modifiedOn the modifiedOn to set
	 */
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the maintenanceStausCode
	 */
	public String getMaintenanceStausCode() {
		return maintenanceStausCode;
	}
	/**
	 * @param maintenanceStausCode the maintenanceStausCode to set
	 */
	public void setMaintenanceStausCode(String maintenanceStausCode) {
		this.maintenanceStausCode = maintenanceStausCode;
	}
	/**
	 * @return the workOrder
	 */
	public String getWorkOrder() {
		return workOrder;
	}
	/**
	 * @param workOrder the workOrder to set
	 */
	public void setWorkOrder(String workOrder) {
		this.workOrder = workOrder;
	}


	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public String getEquipmentDescription() {
		return equipmentDescription;
	}
	public void setEquipmentDescription(String equipmentDescription) {
		this.equipmentDescription = equipmentDescription;
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
	
    
	
}
