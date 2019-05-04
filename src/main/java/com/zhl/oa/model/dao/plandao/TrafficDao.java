package com.zhl.oa.model.dao.plandao;

import com.zhl.oa.model.entity.process.EvectionMoney;
import com.zhl.oa.model.entity.process.Traffic;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TrafficDao extends PagingAndSortingRepository<Traffic, Long>{

	List<Traffic> findByEvection(EvectionMoney money);
}
