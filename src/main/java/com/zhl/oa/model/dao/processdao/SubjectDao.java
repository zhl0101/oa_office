package com.zhl.oa.model.dao.processdao;

import com.zhl.oa.model.entity.process.Subject;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SubjectDao extends PagingAndSortingRepository<Subject, Long>{

	List<Subject> findByParentId(Long id);
	
	List<Subject> findByParentIdNot(Long id);
	
	
}
