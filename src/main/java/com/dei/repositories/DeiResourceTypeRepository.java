/**
 * 
 */
package com.dei.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dei.domain.DeiResourceType;

/**
 * @author rthoma24
 * Apr 26, 2016
 */
public interface DeiResourceTypeRepository extends CrudRepository<DeiResourceType, String>
{
	/*@Query(" select new DeiResources(id, employeeId, firstName, lastName, shift, languagePref, deiCertification, maId, mrfId) "
			+ " from DeiResources r where r.maId = ?1 and r.mrfId = ?2 and isActive = '1' "
            + " order by id ")
    List<DeiResources> findByMaIdAndMrfId(String maId, String mrfId);
	
	
	@Query("update DeiResources u set u.isActive =  '0' where u.id in ( ?1 ) ")
	int setFixedIsActiveFor(List<String> id);
	
	List<DeiEquipments> findDistinctDeiEquipmentsByMaIdOrMrfId(String maId, String mrfId);*/
	List<DeiResourceType> findByResourceId(List<String> id);
}
