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

    public Position() {
    }

    public Position(String name, Integer level, String describtion, Long deptid) {

        this.name = name;
        this.level = level;
        this.describtion = describtion;
        this.deptid = deptid;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", describtion='" + describtion + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
