package com.zhl.oa.model.entity.process;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Reviewed
 * @Description TODO 审核表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:23
 * @Version 1.0
 */

@Entity
@Table(name="aoa_reviewed")
@Data
public class Reviewed {
    @Id
    @Column(name="reviewed_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long reviewedId;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User userId;//审核人

    private String advice; //审核人意见

    private Long statusId;//审核人状态

    @Column(name="reviewed_time")
    private Date reviewedTime;//审核时间

    @ManyToOne
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    @Column(name="del")
    private Boolean del=false;

    @Transient
    private String username;//传过来的审核人的名字

    public Reviewed() {
    }

    public Reviewed(User userId, String advice, Long statusId, Date reviewedTime, ProcessList proId, Boolean del, String username) {

        this.userId = userId;
        this.advice = advice;
        this.statusId = statusId;
        this.reviewedTime = reviewedTime;
        this.proId = proId;
        this.del = del;
        this.username = username;
    }

    public Long getReviewedId() {

        return reviewedId;
    }

    public void setReviewedId(Long reviewedId) {
        this.reviewedId = reviewedId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Date getReviewedTime() {
        return reviewedTime;
    }

    public void setReviewedTime(Date reviewedTime) {
        this.reviewedTime = reviewedTime;
    }

    public ProcessList getProId() {
        return proId;
    }

    public void setProId(ProcessList proId) {
        this.proId = proId;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Reviewed{" +
                "reviewedId=" + reviewedId +
                ", userId=" + userId +
                ", advice='" + advice + '\'' +
                ", statusId=" + statusId +
                ", reviewedTime=" + reviewedTime +
                ", proId=" + proId +
                ", del=" + del +
                ", username='" + username + '\'' +
                '}';
    }
}
