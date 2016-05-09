
package com.dei.domain;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
 /**
 * @author rthoma24
 * Apr 26, 2016
 */
@Entity
public class DeiCheckout {
	
	@Id
	private String id;
    private String equipmentId;
    private String resourceId;
    private String assignedBy;
    private String shift;
    private Date assignedDate;
    private String isActive;
    private String preTripStatusCode;
    private String postTripStatusCode;
    private String signoffBy;
    private String signoffOn;
    private String modifiedOn;
    private String statusCode;
    private String maintenanceStausCode;
    private String workOrder;

public DeiCheckout(){}

    public DeiCheckout(String id,String equipmentId,String resourceId,String assignedBy,String shift,Date assignedDate,String isActive,String preTripStatusCode,String postTripStatusCode,String signoffBy,String signoffOn,String modifiedOn,String statusCode,String maintenanceStausCode,String workOrder){
        super();
        this.id = id;
        this.equipmentId = equipmentId;
        this.resourceId = resourceId;
        this.assignedBy = assignedBy;
        this.shift = shift;
        this.assignedDate = assignedDate;
        this.isActive = isActive;
        this.preTripStatusCode = preTripStatusCode;
        this.postTripStatusCode = postTripStatusCode;
        this.signoffBy = signoffBy;
        this.signoffOn = signoffOn;
        this.modifiedOn = modifiedOn;
        this.statusCode = statusCode;
        this.maintenanceStausCode = maintenanceStausCode;
        this.workOrder = workOrder;
    }
	
	
    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEquipmentId() {
		return equipmentId;
	}


	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getResourceId() {
		return resourceId;
	}


	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}


	public String getAssignedBy() {
		return assignedBy;
	}


	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}


	public String getShift() {
		return shift;
	}


	public void setShift(String shift) {
		this.shift = shift;
	}



	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPreTripStatusCode() {
		return preTripStatusCode;
	}

	public void setPreTripStatusCode(String preTripStatusCode) {
		this.preTripStatusCode = preTripStatusCode;
	}

	public String getPostTripStatusCode() {
		return postTripStatusCode;
	}

	public void setPostTripStatusCode(String postTripStatusCode) {
		this.postTripStatusCode = postTripStatusCode;
	}

	public String getSignoffBy() {
		return signoffBy;
	}

	public void setSignoffBy(String signoffBy) {
		this.signoffBy = signoffBy;
	}

	public String getSignoffOn() {
		return signoffOn;
	}

	public void setSignoffOn(String signoffOn) {
		this.signoffOn = signoffOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMaintenanceStausCode() {
		return maintenanceStausCode;
	}

	public void setMaintenanceStausCode(String maintenanceStausCode) {
		this.maintenanceStausCode = maintenanceStausCode;
	}

	public String getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(String workOrder) {
		this.workOrder = workOrder;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	

	

	
}
