package com.zhl.oa.model.entity.dicuss;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Comment
 * @Description TODO 评论表
 * @Author Administrator
 * @Date 2019/4/26 0026 22:00
 * @Version 1.0
 */
@Entity
@Table(name="aoa_comment_list")
@Data
public class Comment {
    @Id
    @Column(name="comment_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long commentId;

    private Date time; //发布时间

    private String comment;//发布内容

    @ManyToOne
    @JoinColumn(name = "comment_user_id")
    private User user;


    @ManyToOne
    @JoinColumn(name = "reply_id")
    private Reply reply;

    public Comment() {
    }

    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment(Date time, String comment, User user, Reply reply) {

        this.time = time;
        this.comment = comment;
        this.user = user;
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", time=" + time +
                ", comment='" + comment + '\'' +
                ", user=" + user +
                ", reply=" + reply +
                '}';
    }
}
