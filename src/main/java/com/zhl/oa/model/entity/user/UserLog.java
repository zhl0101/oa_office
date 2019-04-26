package com.zhl.oa.model.entity.user;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName UserLog
 * @Description TODO user日志类
 * @Author Administrator
 * @Date 2019/4/26 0026 21:40
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_user_log")
@Data
public class UserLog {

    @Id
    @Column(name = "log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	//logid

    @Column(name = "ip_addr")
    private String ipAddr;	//ip地址

    private String title;	//操作菜单名字

    private String url;		//操作菜单url

    @Column(name = "log_time")
    private Date logTime;	//日志记录时间

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
