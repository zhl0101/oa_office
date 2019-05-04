package com.zhl.oa.model.entity.attends;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Attends
 * @Description TODO 考勤表
 * @Author Administrator
 * @Date 2019/4/26 0026 22:03
 * @Version 1.0
 */
@Entity
@Table(name="aoa_attends_list")
@Data
public class Attends {
    @Id
    @Column(name="attends_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long attendsId;

    @Column(name="type_id")
    private Long typeId; //类型id

    @Column(name="status_id")
    private Long statusId; //状态id

    @Column(name="attends_time")
    private Date attendsTime;   //考勤时间

    @Column(name="attend_hmtime")
    private String attendHmtime;   //考勤时分

    @Column(name="week_ofday")
    private String weekOfday;   //星期几

    @Column(name="attends_ip")
    private String attendsIp;     //登陆ip

    @Column(name="attends_remark")
    private String attendsRemark;  //考勤备注

    @Column(name="holiday_start")//请假开始时间
    private Date holidayStart;

    @Column(name="holiday_days")//请假开始时间
    private Double holidayDays;

    @ManyToOne
    @JoinColumn(name = "attends_user_id")
    private User user;



    @Override
    public String toString() {
        return "Attends{" +
                "attendsId=" + attendsId +
                ", typeId=" + typeId +
                ", statusId=" + statusId +
                ", attendsTime=" + attendsTime +
                ", attendHmtime='" + attendHmtime + '\'' +
                ", weekOfday='" + weekOfday + '\'' +
                ", attendsIp='" + attendsIp + '\'' +
                ", attendsRemark='" + attendsRemark + '\'' +
                ", holidayStart=" + holidayStart +
                ", holidayDays=" + holidayDays +
                ", user=" + user +
                '}';
    }

    public Long getAttendsId() {
        return attendsId;
    }

    public void setAttendsId(Long attendsId) {
        this.attendsId = attendsId;
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

    public Date getAttendsTime() {
        return attendsTime;
    }

    public void setAttendsTime(Date attendsTime) {
        this.attendsTime = attendsTime;
    }

    public String getAttendHmtime() {
        return attendHmtime;
    }

    public void setAttendHmtime(String attendHmtime) {
        this.attendHmtime = attendHmtime;
    }

    public String getWeekOfday() {
        return weekOfday;
    }

    public void setWeekOfday(String weekOfday) {
        this.weekOfday = weekOfday;
    }

    public String getAttendsIp() {
        return attendsIp;
    }

    public void setAttendsIp(String attendsIp) {
        this.attendsIp = attendsIp;
    }

    public String getAttendsRemark() {
        return attendsRemark;
    }

    public void setAttendsRemark(String attendsRemark) {
        this.attendsRemark = attendsRemark;
    }

    public Date getHolidayStart() {
        return holidayStart;
    }

    public void setHolidayStart(Date holidayStart) {
        this.holidayStart = holidayStart;
    }

    public Double getHolidayDays() {
        return holidayDays;
    }

    public void setHolidayDays(Double holidayDays) {
        this.holidayDays = holidayDays;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Attends() {

    }
    public Attends(Long typeId, Long statusId, Date attendsTime, String attendsIp, String attendsRemark, User user) {
        super();
        this.typeId = typeId;
        this.statusId = statusId;
        this.attendsTime = attendsTime;
        this.attendsIp = attendsIp;
        this.attendsRemark = attendsRemark;
        this.user = user;
    }
    public Attends(Long typeId, Long statusId, Date attendsTime, String attendHmtime, String weekOfday,
                   String attendsIp, User user) {
        super();
        this.typeId = typeId;
        this.statusId = statusId;
        this.attendsTime = attendsTime;
        this.attendHmtime = attendHmtime;
        this.weekOfday = weekOfday;
        this.attendsIp = attendsIp;
        this.user = user;
    }

    public Attends(Long typeId, Long statusId, Date attendsTime, String attendHmtime, String weekOfday, String attendsIp, String attendsRemark, Date holidayStart, Double holidayDays, User user) {

        this.typeId = typeId;
        this.statusId = statusId;
        this.attendsTime = attendsTime;
        this.attendHmtime = attendHmtime;
        this.weekOfday = weekOfday;
        this.attendsIp = attendsIp;
        this.attendsRemark = attendsRemark;
        this.holidayStart = holidayStart;
        this.holidayDays = holidayDays;
        this.user = user;
    }
}
