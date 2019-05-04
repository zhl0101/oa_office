package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.EvectionMoney;
import com.zhl.oa.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EvectionMoneyDao extends PagingAndSortingRepository<EvectionMoney, Long>{

	EvectionMoney findByProId(ProcessList pro);
}
