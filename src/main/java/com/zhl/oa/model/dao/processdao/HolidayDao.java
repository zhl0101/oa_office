package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.Holiday;
import com.zhl.oa.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HolidayDao extends PagingAndSortingRepository<Holiday, Long>{

	Holiday findByProId(ProcessList pro);

}
