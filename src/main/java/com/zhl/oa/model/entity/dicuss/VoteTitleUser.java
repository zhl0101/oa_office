package com.zhl.oa.model.entity.dicuss;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName VoteTitleUser
 * @Description TODO 投票用户
 * @Author Administrator
 * @Date 2019/4/26 0026 22:08
 * @Version 1.0
 */
@Entity
@Table(name="aoa_vote_title_user")
@Data
public class VoteTitleUser {
    @Id
    @Column(name="vote_title_user_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long voteTitleUserId;

//		@Column(name="title_id")	//标题
//		private Long  titleId;
//
//		@Column(name="user_id")		//用户id
//		private Long  userId;

    @Column(name="vote_id")		//投票id
    private Long  voteId;

    @ManyToOne
    @JoinColumn(name = "title_id")
    private VoteTitles voteTitles;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
