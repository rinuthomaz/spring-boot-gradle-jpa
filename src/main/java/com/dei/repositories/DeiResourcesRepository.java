/**
 * 
 */
package com.dei.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.dei.domain.DeiResourceType;
import com.dei.domain.DeiResources;

/**
 * @author rthoma24
 * Apr 26, 2016
 */
public interface DeiResourcesRepository extends CrudRepository<DeiResources, String>
{
	
	List<DeiResources> findById(List<Integer> id);

	
	
	@Query(" select new DeiResources(id, employeeId, firstName, lastName, shift, languagePref, deiCertification, maId, mrfId) "
			+ " from DeiResources r where r.maId = ?1 and r.mrfId = ?2 and r.isActive = '1' "
            + " order by id ")
    List<DeiResources> findByMaIdAndMrfId(String maId, String mrfId);

	@Modifying
	   @Transactional(readOnly=false)
	   @Query("update DeiResources p set p.isActive = '0' where p.id in (?1) ")
	   Integer setNewIsActiveForDeiResources(List<Integer> id);
	
	////	@Modifying
//	@Query(" update DeiResources u set u.isActive = '0' where u.id in = 5 ")
//	Integer setIsActiveFor(List<String> id);
//	
//	/*List<DeiEquipments> findDistinctDeiEquipmentsByMaIdOrMrfId(String maId, String mrfId);*/
//	List<DeiResources> findById(List<String> id);
//	DeiResources findOne(List<String> id);
//
//	/**
//	 * @param deiResources
//	 */
//	void saveAndFlush(List<DeiResources> deiResources);
}
