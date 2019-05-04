package com.zhl.oa.model.entity.dicuss;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName VoteList
 * @Description TODO 投票
 * @Author Administrator
 * @Date 2019/4/26 0026 22:05
 * @Version 1.0
 */
@Entity
@Table(name="aoa_voteList")
@Data
public class VoteList {
    @Id
    @Column(name="vote_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long voteId;				//主键id

    @Column(name="start_time")			//投票开始时间
    private Date startTime;

    @Column(name="end_time")			//投票结束时间
    private Date endTime;

    private Integer selectone;				//单选和多选

    @OneToOne(mappedBy = "voteList")
    private Discuss discuss;

    @OneToMany(mappedBy="voteList",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<VoteTitles> voteTitles;

    public VoteList() {
    }

    public VoteList(Date startTime, Date endTime, Integer selectone, Discuss discuss, Set<VoteTitles> voteTitles) {

        this.startTime = startTime;
        this.endTime = endTime;
        this.selectone = selectone;
        this.discuss = discuss;
        this.voteTitles = voteTitles;
    }

    public Long getVoteId() {

        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getSelectone() {
        return selectone;
    }

    public void setSelectone(Integer selectone) {
        this.selectone = selectone;
    }

    public Discuss getDiscuss() {
        return discuss;
    }

    public void setDiscuss(Discuss discuss) {
        this.discuss = discuss;
    }

    public Set<VoteTitles> getVoteTitles() {
        return voteTitles;
    }

    public void setVoteTitles(Set<VoteTitles> voteTitles) {
        this.voteTitles = voteTitles;
    }

    @Override
    public String toString() {
        return "VoteList{" +
                "voteId=" + voteId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", selectone=" + selectone +
                ", discuss=" + discuss +
                ", voteTitles=" + voteTitles +
                '}';
    }
}
