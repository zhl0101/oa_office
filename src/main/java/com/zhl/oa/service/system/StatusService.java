package com.zhl.oa.service.system;

import com.zhl.oa.model.dao.system.StatusDao;
import com.zhl.oa.model.entity.system.SystemStatusList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StatusService {
	
	@Autowired
	private StatusDao statusDao;
	
	/**
	 * 新增和更新方法
	 * @param status
	 * @return
	 */
	public SystemStatusList save(SystemStatusList status){
		return statusDao.save(status);
	}
	
	/**
	 * 删除方法
	 */
	public void deleteStatus(Long statusId){
		statusDao.delete(statusId);
	}

}
