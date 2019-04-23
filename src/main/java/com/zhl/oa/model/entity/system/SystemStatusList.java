package com.zhl.oa.model.entity.system;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * @ClassName SystemStatusList
 * @Description TODO 系统状态总表
 * @Author Administrator
 * @Date 2019/4/23 0023 22:03
 * @Version 1.0
 */
@Data
@Entity
@Table(name = "aoa_status_list")
public class SystemStatusList {

    @Id
    @Column(name = "status_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long statusId; // 状态id

    @Column(name = "status_name")
    @NotEmpty(message="状态名称不能为空")
    private String statusName; // 状态名称

    @Column(name = "sort_value")
    private Integer statusSortValue; // 状态排序值

    @Column(name = "status_model")
    private String statusModel; // 状态模块

    @Column(name = "status_color")
    private String statusColor; // 状态颜色

    @Column(name = "sort_precent")
    private String statusPrecent;//百分比

}
