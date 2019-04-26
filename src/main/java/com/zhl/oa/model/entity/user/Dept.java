package com.zhl.oa.model.entity.user;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * @ClassName Dept
 * @Description TODO 部门实体类
 * @Author Administrator
 * @Date 2019/4/26 0026 21:43
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_dept")
@Data
public class Dept {

    @Id
    @Column(name = "dept_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long deptId;	//部门id

    @Column(name = "dept_name")
    @NotEmpty(message="部门名称不为空")
    private String deptName;	//部门名字  非空 唯一

    @Column(name = "dept_tel")
    private String deptTel;		//部门电话

    @Column(name = "dept_fax")
    private String deptFax;		//部门传真

    private String email;		//部门email

    @Column(name = "dept_addr")
    private String deptAddr;	//部门地址

    private Long deptmanager;

}
