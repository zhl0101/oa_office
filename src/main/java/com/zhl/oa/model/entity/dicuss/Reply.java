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
}
