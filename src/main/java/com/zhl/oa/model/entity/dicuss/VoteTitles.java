package com.zhl.oa.model.entity.dicuss;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @ClassName VoteTitles
 * @Description TODO 投票标题
 * @Author Administrator
 * @Date 2019/4/26 0026 22:07
 * @Version 1.0
 */

@Entity
@Table(name="aoa_voteTitles")
@Data
public class VoteTitles {
    @Id
    @Column(name="title_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  Long titleId;

//	@Column(name="vote_id")				//投票id
//	private Long voteId;

    private String  title;				//投票标题

    private String color;				//进度条颜色

    @OneToMany(mappedBy="voteTitles",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<VoteTitleUser> voteTitleUsers;

    @ManyToOne
    @JoinColumn(name = "vote_id")
    private VoteList voteList;			//关联投标表      投票id

    public VoteTitles(String title, String color, Set<VoteTitleUser> voteTitleUsers, VoteList voteList) {
        this.title = title;
        this.color = color;
        this.voteTitleUsers = voteTitleUsers;
        this.voteList = voteList;
    }

    public VoteTitles() {

    }

    public Long getTitleId() {

        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<VoteTitleUser> getVoteTitleUsers() {
        return voteTitleUsers;
    }

    public void setVoteTitleUsers(Set<VoteTitleUser> voteTitleUsers) {
        this.voteTitleUsers = voteTitleUsers;
    }

    public VoteList getVoteList() {
        return voteList;
    }

    public void setVoteList(VoteList voteList) {
        this.voteList = voteList;
    }

    @Override
    public String toString() {
        return "VoteTitles{" +
                "titleId=" + titleId +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", voteTitleUsers=" + voteTitleUsers +
                ", voteList=" + voteList +
                '}';
    }
}
