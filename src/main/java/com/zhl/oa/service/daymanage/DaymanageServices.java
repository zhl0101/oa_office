package com.zhl.oa.service.daymanage;

import com.zhl.oa.model.dao.daymanagedao.DaymanageDao;
import com.zhl.oa.model.dao.user.UserDao;
import com.zhl.oa.model.entity.schedule.ScheduleList;
import com.zhl.oa.model.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DaymanageServices {
	@Autowired
	UserDao udao;
	@Autowired
	DaymanageDao daydao;

	
	public List<ScheduleList> aboutmeschedule(Long userId){
		
		User user = udao.findOne(userId);
		List<User> users = new ArrayList<>();
		users.add(user);
		List<ScheduleList> aboutmerc = new ArrayList<>();
		
		List<ScheduleList> myschedule = daydao.findByUser(user);
		List<ScheduleList> otherschedule = daydao.findByUsers(users);
		
		for (ScheduleList scheduleList : myschedule) {
			aboutmerc.add(scheduleList);
		}
		
		for (ScheduleList scheduleList : otherschedule) {
			aboutmerc.add(scheduleList);
		}
		
//		aboutmerc.addAll(myschedule);
//		aboutmerc.addAll(otherschedule);
		
		for (ScheduleList scheduleList : aboutmerc) {
			User user1 = scheduleList.getUser();
			scheduleList.setUsername(user1.getRealName());
			
		}
		
		return aboutmerc;
	}
}
