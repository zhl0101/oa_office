package com.zhl.oa.model.dao.daymanagedao;

import com.zhl.oa.model.entity.schedule.ScheduleList;
import com.zhl.oa.model.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DaymanageDao extends JpaRepository<ScheduleList,Long>{
	
	List<ScheduleList> findByUser(User user);
	
	List<ScheduleList> findByUsers(List<User> users);
	
	Page<ScheduleList> findByUsers(List<User> users, Pageable pa);

	Page<ScheduleList> findByUser(User user, Pageable pa);

	Page<ScheduleList> findByUserAndUsers(User user, List<User> users, Pageable pa);
}
