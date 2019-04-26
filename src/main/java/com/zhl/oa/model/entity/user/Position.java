package com.zhl.oa.model.entity.user;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Position
 * @Description TODO 职位类
 * @Author Administrator
 * @Date 2019/4/26 0026 21:46
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_position")
@Data
public class Position {
    @Id
    @Column(name = "position_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	//职位id

    @Column(unique = true)
    private String name;	//职位名称。

    private Integer level;	//职位层级

    private String describtion;//职位描述

    private Long deptid;

    public Position(String name, Integer level) {

        this.name = name;
        this.level = level;
    }
}
