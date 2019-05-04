package com.zhl.oa.model.entity.process;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Bursement
 * @Description TODO 报销表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:13
 * @Version 1.0
 */
@Data
@Table
@Entity(name="aoa_bursement")
public class Bursement {
    @Id
    @Column(name="bursement_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long bursementId;

    @OneToOne()
    @JoinColumn(name="user_name")
    private User usermoney;//证明人

    private String name;//相关客户

    @Column(name="type_id")
    private Long typeId;//报销方式（银行卡，现金，其他）

    @OneToOne
    @JoinColumn(name="operation_name")
    private User operation;//报销人员

    private Date burseTime;//报销日期

    private Integer allinvoices ;//票据总数

    @Column(name="manager_advice")
    private String managerAdvice;//经理意见及说明

    @Column(name="financial_advice")
    private String financialAdvice;//财务部意见及说明

    @Column(name="all_money")
    private Double allMoney;//总计金额

    @Transient
    private String username;//审核人员

    @Transient
    private String namemoney;//承担主体

    @OneToMany(cascade=CascadeType.ALL,mappedBy="burs",orphanRemoval = true)
    List<DetailsBurse> details;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    public Bursement() {
    }

    public Bursement(User usermoney, String name, Long typeId, User operation, Date burseTime, Integer allinvoices, String managerAdvice, String financialAdvice, Double allMoney, String username, String namemoney, List<DetailsBurse> details, ProcessList proId) {

        this.usermoney = usermoney;
        this.name = name;
        this.typeId = typeId;
        this.operation = operation;
        this.burseTime = burseTime;
        this.allinvoices = allinvoices;
        this.managerAdvice = managerAdvice;
        this.financialAdvice = financialAdvice;
        this.allMoney = allMoney;
        this.username = username;
        this.namemoney = namemoney;
        this.details = details;
        this.proId = proId;
    }

    public Long getBursementId() {

        return bursementId;
    }

    public void setBursementId(Long bursementId) {
        this.bursementId = bursementId;
    }

    public User getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(User usermoney) {
        this.usermoney = usermoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public User getOperation() {
        return operation;
    }

    public void setOperation(User operation) {
        this.operation = operation;
    }

    public Date getBurseTime() {
        return burseTime;
    }

    public void setBurseTime(Date burseTime) {
        this.burseTime = burseTime;
    }

    public Integer getAllinvoices() {
        return allinvoices;
    }

    public void setAllinvoices(Integer allinvoices) {
        this.allinvoices = allinvoices;
    }

    public String getManagerAdvice() {
        return managerAdvice;
    }

    public void setManagerAdvice(String managerAdvice) {
        this.managerAdvice = managerAdvice;
    }

    public String getFinancialAdvice() {
        return financialAdvice;
    }

    public void setFinancialAdvice(String financialAdvice) {
        this.financialAdvice = financialAdvice;
    }

    public Double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNamemoney() {
        return namemoney;
    }

    public void setNamemoney(String namemoney) {
        this.namemoney = namemoney;
    }

    public List<DetailsBurse> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsBurse> details) {
        this.details = details;
    }

    public ProcessList getProId() {
        return proId;
    }

    public void setProId(ProcessList proId) {
        this.proId = proId;
    }

    @Override
    public String toString() {
        return "Bursement{" +
                "bursementId=" + bursementId +
                ", usermoney=" + usermoney +
                ", name='" + name + '\'' +
                ", typeId=" + typeId +
                ", operation=" + operation +
                ", burseTime=" + burseTime +
                ", allinvoices=" + allinvoices +
                ", managerAdvice='" + managerAdvice + '\'' +
                ", financialAdvice='" + financialAdvice + '\'' +
                ", allMoney=" + allMoney +
                ", username='" + username + '\'' +
                ", namemoney='" + namemoney + '\'' +
                ", details=" + details +
                ", proId=" + proId +
                '}';
    }
}
