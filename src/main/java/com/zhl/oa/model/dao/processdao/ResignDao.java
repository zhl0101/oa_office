package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.ProcessList;
import com.zhl.oa.model.entity.process.Resign;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ResignDao extends PagingAndSortingRepository<Resign, Long>{

	Resign findByProId(ProcessList process);

}
