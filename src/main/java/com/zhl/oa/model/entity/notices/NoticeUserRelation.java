package com.zhl.oa.model.entity.notices;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName NoticeUserRelation
 * @Description TODO 通知与用户中间关联表，多一个字段，是否已读
 * @Author Administrator
 * @Date 2019/4/27 0027 11:05
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_notice_user_relation")
@Data
public class NoticeUserRelation {

    @Id
    @Column(name = "relatin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticeUserRelatinId;	//用户与通知中间关联表主键id


    @ManyToOne
    @JoinColumn(name = "relatin_notice_id")
    private NoticesList noticeId;				//通知id

    @ManyToOne
    @JoinColumn(name = "relatin_user_id")
    private User userId;				//用户id

    @Column(name = "is_read")
    private Boolean read=false;				//此条通知该用户是否一已读

    public NoticeUserRelation() {
    }

    public NoticeUserRelation(NoticesList noticeId, User userId, Boolean read) {

        this.noticeId = noticeId;
        this.userId = userId;
        this.read = read;
    }

    public Long getNoticeUserRelatinId() {

        return noticeUserRelatinId;
    }

    public void setNoticeUserRelatinId(Long noticeUserRelatinId) {
        this.noticeUserRelatinId = noticeUserRelatinId;
    }

    public NoticesList getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(NoticesList noticeId) {
        this.noticeId = noticeId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "NoticeUserRelation{" +
                "noticeUserRelatinId=" + noticeUserRelatinId +
                ", noticeId=" + noticeId +
                ", userId=" + userId +
                ", read=" + read +
                '}';
    }
}
