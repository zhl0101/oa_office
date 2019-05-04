package com.zhl.oa.model.entity.task;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Taskuser
 * @Description TODO //任务接收人联系表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:29
 * @Version 1.0
 */
@Entity
@Table(name="aoa_task_user")
@Data
public class Taskuser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pk_id")
    private Long pkId;//任务接收人主键id


    @ManyToOne
    @JoinColumn(name="task_id")
    private Tasklist taskId;//任务id外键

    @ManyToOne
    @JoinColumn(name="task_recive_user_id")
    private User userId;//接收人id外键

    @Column(name="status_id")
    private Integer statusId;//任务状态id

    public Taskuser() {
    }

    public Taskuser(Tasklist taskId, User userId, Integer statusId) {

        this.taskId = taskId;
        this.userId = userId;
        this.statusId = statusId;
    }

    public Long getPkId() {

        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Tasklist getTaskId() {
        return taskId;
    }

    public void setTaskId(Tasklist taskId) {
        this.taskId = taskId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        return "Taskuser{" +
                "pkId=" + pkId +
                ", taskId=" + taskId +
                ", userId=" + userId +
                ", statusId=" + statusId +
                '}';
    }
}
