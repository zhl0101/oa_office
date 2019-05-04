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

    public Dept() {
    }

    public Dept(String deptName, String deptTel, String deptFax, String email, String deptAddr, Long deptmanager) {

        this.deptName = deptName;
        this.deptTel = deptTel;
        this.deptFax = deptFax;
        this.email = email;
        this.deptAddr = deptAddr;
        this.deptmanager = deptmanager;
    }

    public Long getDeptId() {

        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptTel() {
        return deptTel;
    }

    public void setDeptTel(String deptTel) {
        this.deptTel = deptTel;
    }

    public String getDeptFax() {
        return deptFax;
    }

    public void setDeptFax(String deptFax) {
        this.deptFax = deptFax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr;
    }

    public Long getDeptmanager() {
        return deptmanager;
    }

    public void setDeptmanager(Long deptmanager) {
        this.deptmanager = deptmanager;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptTel='" + deptTel + '\'' +
                ", deptFax='" + deptFax + '\'' +
                ", email='" + email + '\'' +
                ", deptAddr='" + deptAddr + '\'' +
                ", deptmanager=" + deptmanager +
                '}';
    }
}
