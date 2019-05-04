package com.zhl.oa.model.entity.schedule;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zhl.oa.model.entity.user.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ScheduleList
 * @Description TODO 日程表
 * @Author Administrator
 * @Date 2019/4/26 0026 21:55
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_schedule_list")
@Data
public class ScheduleList {
    @Id
    @Column(name = "rc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rcId;	//日程id

    @Column(name = "type_id")
    private Long typeId;	//类型id

    @Column(name = "status_id")
    private Long statusId;	//状态id

    @Column(name = "start_time")
    private Date startTime;	//开始时间

    @Column(name = "end_time")
    private Date endTime;	//结束时间

    @Column(name = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime = new Date();	//发布时间

    private String title;	//日程标题

    @Column(name = "miaoshu")
    private String describe;	//日程描述

    @Column(name = "is_remind")
    private Boolean isRemind = false;	//是否提醒

    @Transient
    private String username;

    private Boolean isreminded = false;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;			//日程所属人

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "aoa_schedule_user",			//日程联系人关联表
            joinColumns = {
                    @JoinColumn(name = "rcid")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id")
            })
    private List<User> users;	//联系人集合

    public ScheduleList() {
    }

    public ScheduleList(Long typeId, Long statusId, Date startTime, Date endTime, Date createTime, String title, String describe, Boolean isRemind, String username, Boolean isreminded, User user, List<User> users) {

        this.typeId = typeId;
        this.statusId = statusId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.title = title;
        this.describe = describe;
        this.isRemind = isRemind;
        this.username = username;
        this.isreminded = isreminded;
        this.user = user;
        this.users = users;
    }

    public Long getRcId() {

        return rcId;
    }

    public void setRcId(Long rcId) {
        this.rcId = rcId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Boolean getRemind() {
        return isRemind;
    }

    public void setRemind(Boolean remind) {
        isRemind = remind;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIsreminded() {
        return isreminded;
    }

    public void setIsreminded(Boolean isreminded) {
        this.isreminded = isreminded;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "ScheduleList{" +
                "rcId=" + rcId +
                ", typeId=" + typeId +
                ", statusId=" + statusId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                ", title='" + title + '\'' +
                ", describe='" + describe + '\'' +
                ", isRemind=" + isRemind +
                ", username='" + username + '\'' +
                ", isreminded=" + isreminded +
                ", user=" + user +
                ", users=" + users +
                '}';
    }
}
