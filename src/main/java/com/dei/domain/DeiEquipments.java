/**
 * 
 */
package com.dei.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rthoma24
 * Apr 29, 2016
 */
@Entity
public class DeiEquipments {

	@Id
	private String id;
	private String maId;
	private String mrfId;
	private String compassId;
	private String deiUnit;
	private String assetClass;
	private String assetCategory;
	private String name;
	private String type;
	private String description;
	private String createdOn; 
	private String createdBy;
	private String modifiedOn;
	private String modifiedBy;
	private String isActive;
	private String isAvailable;
	
	
	public DeiEquipments(){}

    public DeiEquipments(String id, String maId, String mrfId, String compassId, String deiUnit, String assetClass, String assetCategory, String name, String type, String description, String createdOn, String  createdBy, String modifiedOn, String modifiedBy, String isActive, String isAvailable){
        super();
        this.id = id;
        this.maId = maId;
        this.mrfId = mrfId;
        this.compassId = compassId;
        this.deiUnit = deiUnit;
        this.assetClass = assetClass;
        this.assetCategory = assetCategory;
        this.name = name;
        this.type = type;
        this.description = description;
        this.createdOn  = createdOn ;
        this.createdBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.isActive = isActive;
        this.isAvailable = isAvailable;

    }
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getCompassId() {
		return compassId;
	}
	public void setCompassId(String compassId) {
		this.compassId = compassId;
	}
	public String getDeiUnit() {
		return deiUnit;
	}
	public void setDeiUnit(String deiUnit) {
		this.deiUnit = deiUnit;
	}
	public String getAssetClass() {
		return assetClass;
	}
	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}
	public String getAssetCategory() {
		return assetCategory;
	}
	public void setAssetCategory(String assetCategory) {
		this.assetCategory = assetCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
	
	
	
}
