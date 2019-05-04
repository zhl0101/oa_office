package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.Bursement;
import com.zhl.oa.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BursementDao extends PagingAndSortingRepository<Bursement, Long>{

	Bursement findByProId(ProcessList process);
	
	

}
