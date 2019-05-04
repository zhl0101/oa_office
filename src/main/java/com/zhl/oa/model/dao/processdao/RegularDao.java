package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.ProcessList;
import com.zhl.oa.model.entity.process.Regular;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RegularDao extends PagingAndSortingRepository<Regular, Long>{

	Regular findByProId(ProcessList pro);

}
