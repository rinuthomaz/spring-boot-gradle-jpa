/**
 * 
 */
package com.dei.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dei.domain.DeiEquipments;

/**
 * @author rthoma24
 * Apr 26, 2016
 */
public interface DeiEquipmentsRepository extends CrudRepository<DeiEquipments, String>
{
	@Query(" select new DeiEquipments(id,maId,mrfId,compassId,deiUnit,assetClass,assetCategory,name,type,description,createdOn, createdBy,modifiedOn,modifiedBy,isActive,isAvailable) "
			+ " from DeiEquipments b where b.maId = ?1 and b.mrfId = ?2 "
            + " order by id ")
    List<DeiEquipments> findByMaIdAndMrfId(String maId, String mrfId);
	
	List<DeiEquipments> findDistinctDeiEquipmentsByMaIdOrMrfId(String maId, String mrfId);
	List<DeiEquipments> findById(String id);
}
