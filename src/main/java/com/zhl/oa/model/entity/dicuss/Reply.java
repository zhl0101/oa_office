package com.zhl.oa.model.entity.dicuss;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName Reply
 * @Description TODO 回复表
 * @Author Administrator
 * @Date 2019/4/26 0026 21:57
 * @Version 1.0
 */
@Entity
@Table(name="aoa_reply_list")
@Data
public class Reply {
    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", replayTime=" + replayTime +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", discuss=" + discuss +
                ", users=" + users +
                ", comments=" + comments +
                '}';
    }

    @Id
    @Column(name="reply_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long replyId;

    @Column(name="replay_time")
    private Date replayTime;     //回复时间

    private String content;     //内容

    @ManyToOne
    @JoinColumn(name = "reply_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "discuss_id")
    private Discuss discuss;

    @ManyToMany
    @JoinTable(
            name = "aoa_love_user",
            joinColumns = {
                    @JoinColumn(name = "reply_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id")
            }
    )
    private Set<User> users;

    @OneToMany(mappedBy="reply",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    private Set<Comment> comments;

    public Reply() {
    }

    public Reply(Date replayTime, String content, User user, Discuss discuss) {
        this.replayTime = replayTime;
        this.content = content;
        this.user = user;
        this.discuss = discuss;
    }

    public Reply(Date replayTime, String content, User user, Discuss discuss, Set<User> users, Set<Comment> comments) {

        this.replayTime = replayTime;
        this.content = content;
        this.user = user;
        this.discuss = discuss;
        this.users = users;
        this.comments = comments;
    }

    public Long getReplyId() {

        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Date getReplayTime() {
        return replayTime;
    }

    public void setReplayTime(Date replayTime) {
        this.replayTime = replayTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Discuss getDiscuss() {
        return discuss;
    }

    public void setDiscuss(Discuss discuss) {
        this.discuss = discuss;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
