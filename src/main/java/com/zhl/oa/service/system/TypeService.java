package com.zhl.oa.service.system;

import com.zhl.oa.model.dao.system.TypeDao;
import com.zhl.oa.model.entity.system.SystemTypeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TypeService {
	
	@Autowired
	private TypeDao typeDao;
	
	/**
	 * 新增和更新
	 * @param list
	 * @return
	 */
	public SystemTypeList save(SystemTypeList list){
		return typeDao.save(list);
	}
	
	/**
	 * 删除方法
	 */
	public void deleteType(Long typeId){
		 typeDao.delete(typeId);
	}
	

}
