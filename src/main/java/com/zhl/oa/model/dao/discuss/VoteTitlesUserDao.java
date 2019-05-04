package com.zhl.oa.model.dao.discuss;

import com.zhl.oa.model.entity.dicuss.VoteTitleUser;
import com.zhl.oa.model.entity.dicuss.VoteTitles;
import com.zhl.oa.model.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteTitlesUserDao extends JpaRepository<VoteTitleUser, Long>{
	
	//在用户投票的标题表中查找所有的同一标题的集合
	List<VoteTitleUser> findByVoteTitles(VoteTitles voteTitles);
	
	//在用户投票的标题表中查找所有的同一投票的集合
	List<VoteTitleUser> findByVoteId(Long voteId);
	
	VoteTitleUser findByVoteTitlesAndUser(VoteTitles voteTitles, User user);
	
	

}
