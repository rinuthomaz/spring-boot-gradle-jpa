/**
 * 
 */
package com.dei.repositories;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dei.domain.DeiCheckout;
import com.dei.domain.DeiEquipments;

/**
 * @author rthoma24
 * Apr 26, 2016
 */
public interface DeiCheckoutRepository extends CrudRepository<DeiCheckout, String>
{
	List<DeiCheckout> findById(List<String> id);
	List<DeiCheckout> findByShift(String shift);
	
	/*@Query(" select new DeiCheckout(id, equipmentId, resourceId, assignedBy, shift, assignedDate, isActive, preTripStatusCode, postTripStatusCode, signoffBy, signoffOn, modifiedOn, statusCode, maintenanceStausCode, workOrder) "
			+ " from DeiCheckout d where d.assignedDate = to_date(to_date(1?, 'yyyy-mm-dd')) and d.shift = ?2 " )
            //+ " order by id ")
*/	List<DeiCheckout> findByAssignedDateAndShift(String assignedDate, String shift);
}
