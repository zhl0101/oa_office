package com.zhl.oa.model.dao.discuss;

import com.zhl.oa.model.entity.dicuss.Discuss;
import com.zhl.oa.model.entity.dicuss.Reply;
import com.zhl.oa.model.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyDao extends JpaRepository<Reply, Long>{
	//根据讨论表的id来找所有的回复表,分页处理
	Page<Reply> findByDiscuss(Discuss discuss, Pageable pa);

	//根据讨论表和用户来查找，并分页处理
	Page<Reply> findByDiscussAndUser(Discuss discuss, User user, Pageable pa);
	
	List<Reply> findByDiscuss(Discuss discuss);
	
	
}
