package com.zhl.oa.model.entity.process;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Overtime
 * @Description TODO 加班表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:19
 * @Version 1.0
 */
@Table
@Entity(name="aoa_overtime")
@Data
public class Overtime {
    @Id
    @Column(name="overtime_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long overtimeId;

    private Long typeId; //加班类型

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    @Column(name="personnel_advice")
    private String personnelAdvice;//人事部意见及说明

    @Column(name="manager_advice")
    private String managerAdvice;//经理意见及说明

    @Transient
    private String nameuser;

    public Overtime() {
    }

    public Overtime(Long typeId, ProcessList proId, String personnelAdvice, String managerAdvice, String nameuser) {

        this.typeId = typeId;
        this.proId = proId;
        this.personnelAdvice = personnelAdvice;
        this.managerAdvice = managerAdvice;
        this.nameuser = nameuser;
    }

    public Long getOvertimeId() {

        return overtimeId;
    }

    public void setOvertimeId(Long overtimeId) {
        this.overtimeId = overtimeId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public ProcessList getProId() {
        return proId;
    }

    public void setProId(ProcessList proId) {
        this.proId = proId;
    }

    public String getPersonnelAdvice() {
        return personnelAdvice;
    }

    public void setPersonnelAdvice(String personnelAdvice) {
        this.personnelAdvice = personnelAdvice;
    }

    public String getManagerAdvice() {
        return managerAdvice;
    }

    public void setManagerAdvice(String managerAdvice) {
        this.managerAdvice = managerAdvice;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    @Override
    public String toString() {
        return "Overtime{" +
                "overtimeId=" + overtimeId +
                ", typeId=" + typeId +
                ", proId=" + proId +
                ", personnelAdvice='" + personnelAdvice + '\'' +
                ", managerAdvice='" + managerAdvice + '\'' +
                ", nameuser='" + nameuser + '\'' +
                '}';
    }
}
