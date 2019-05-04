package com.zhl.oa.service.user;

import com.zhl.oa.model.dao.user.UserLogRecordDao;
import com.zhl.oa.model.entity.user.LoginRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserLongRecordService {
	@Autowired
	private UserLogRecordDao ulDao;
	
	public LoginRecord save(LoginRecord lr){
		return ulDao.save(lr);
	}
	
}
