package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.Evection;
import com.zhl.oa.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EvectionDao extends PagingAndSortingRepository<Evection, Long> {

	Evection findByProId(ProcessList process);

}
