package com.zhl.oa.model.dao.processdao;


import com.zhl.oa.model.entity.process.Bursement;
import com.zhl.oa.model.entity.process.DetailsBurse;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DetailsBurseDao extends PagingAndSortingRepository<DetailsBurse, Long>{

	List<DetailsBurse> findByBurs(Bursement bu);
}
