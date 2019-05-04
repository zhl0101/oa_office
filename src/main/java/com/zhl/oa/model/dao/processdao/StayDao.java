package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.EvectionMoney;
import com.zhl.oa.model.entity.process.Stay;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StayDao extends PagingAndSortingRepository<Stay, Long>{
 
	List<Stay> findByEvemoney(EvectionMoney money);
}
