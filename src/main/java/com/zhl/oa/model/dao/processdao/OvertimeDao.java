package com.zhl.oa.model.dao.processdao;


import com.zhl.oa.model.entity.process.Overtime;
import com.zhl.oa.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OvertimeDao extends PagingAndSortingRepository<Overtime, Long>{

	Overtime findByProId(ProcessList pro);

}
