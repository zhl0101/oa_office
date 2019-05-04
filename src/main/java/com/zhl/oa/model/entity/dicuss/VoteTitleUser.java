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

    public VoteTitleUser() {
    }

    public VoteTitleUser(Long voteId, VoteTitles voteTitles, User user) {

        this.voteId = voteId;
        this.voteTitles = voteTitles;
        this.user = user;
    }

    public Long getVoteTitleUserId() {

        return voteTitleUserId;
    }

    public void setVoteTitleUserId(Long voteTitleUserId) {
        this.voteTitleUserId = voteTitleUserId;
    }

    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public VoteTitles getVoteTitles() {
        return voteTitles;
    }

    public void setVoteTitles(VoteTitles voteTitles) {
        this.voteTitles = voteTitles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VoteTitleUser{" +
                "voteTitleUserId=" + voteTitleUserId +
                ", voteId=" + voteId +
                ", voteTitles=" + voteTitles +
                ", user=" + user +
                '}';
    }
}
