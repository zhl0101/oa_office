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

}
