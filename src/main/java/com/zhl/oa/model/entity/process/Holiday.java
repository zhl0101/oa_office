package com.zhl.oa.model.entity.process;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Holiday
 * @Description TODO//请假表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:17
 * @Version 1.0
 */
@Table
@Entity(name="aoa_holiday")
@Data
public class Holiday {
    @Id
    @Column(name="holiday_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long holidayId;

    @Column(name="type_id")
    private Long typeId;  //请假类型

    @Column(name="leave_days")
    private Double leaveDays; //请假天数

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    @Column(name="personnel_advice")
    private String personnelAdvice;//人事部意见及说明

    @Column(name="manager_advice")
    private String managerAdvice;//经理意见及说明

    @Transient
    private String nameuser;

    public Holiday() {
    }

    public Holiday(Long typeId, Double leaveDays, ProcessList proId, String personnelAdvice, String managerAdvice, String nameuser) {

        this.typeId = typeId;
        this.leaveDays = leaveDays;
        this.proId = proId;
        this.personnelAdvice = personnelAdvice;
        this.managerAdvice = managerAdvice;
        this.nameuser = nameuser;
    }

    public Long getHolidayId() {

        return holidayId;
    }

    public void setHolidayId(Long holidayId) {
        this.holidayId = holidayId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Double getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Double leaveDays) {
        this.leaveDays = leaveDays;
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
        return "Holiday{" +
                "holidayId=" + holidayId +
                ", typeId=" + typeId +
                ", leaveDays=" + leaveDays +
                ", proId=" + proId +
                ", personnelAdvice='" + personnelAdvice + '\'' +
                ", managerAdvice='" + managerAdvice + '\'' +
                ", nameuser='" + nameuser + '\'' +
                '}';
    }
}
