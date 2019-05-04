package com.zhl.oa.model.entity.process;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @ClassName EvectionMoney
 * @Description TODO//出差费用申请表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:16
 * @Version 1.0
 */
@Entity
@Table(name="aoa_evectionmoney")
@Data
public class EvectionMoney {

    @Id
    @Column(name="evectionmoney_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long evectionmoneyId;

    private Double money; //申请总金额

    private String name; //关联客户

    @Column(name="manager_advice")
    private String managerAdvice;//经理意见及说明

    @Column(name="financial_advice")
    private String financialAdvice;//财务部意见及说明

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    private Long pro;

    @OneToMany(cascade=CascadeType.ALL,mappedBy="evection")
    List<Traffic> traffic;

    @OneToMany(cascade=CascadeType.ALL,mappedBy="evemoney")
    List<Stay> stay;

    @Transient
    private String shenname;//审核人员

    public EvectionMoney() {
    }

    public EvectionMoney(Double money, String name, String managerAdvice, String financialAdvice, ProcessList proId, Long pro, List<Traffic> traffic, List<Stay> stay, String shenname) {

        this.money = money;
        this.name = name;
        this.managerAdvice = managerAdvice;
        this.financialAdvice = financialAdvice;
        this.proId = proId;
        this.pro = pro;
        this.traffic = traffic;
        this.stay = stay;
        this.shenname = shenname;
    }

    public Long getEvectionmoneyId() {

        return evectionmoneyId;
    }

    public void setEvectionmoneyId(Long evectionmoneyId) {
        this.evectionmoneyId = evectionmoneyId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ProcessList getProId() {
        return proId;
    }

    public void setProId(ProcessList proId) {
        this.proId = proId;
    }

    public Long getPro() {
        return pro;
    }

    public void setPro(Long pro) {
        this.pro = pro;
    }

    public List<Traffic> getTraffic() {
        return traffic;
    }

    public void setTraffic(List<Traffic> traffic) {
        this.traffic = traffic;
    }

    public List<Stay> getStay() {
        return stay;
    }

    public void setStay(List<Stay> stay) {
        this.stay = stay;
    }

    public String getShenname() {
        return shenname;
    }

    public void setShenname(String shenname) {
        this.shenname = shenname;
    }

    @Override
    public String toString() {
        return "EvectionMoney{" +
                "evectionmoneyId=" + evectionmoneyId +
                ", money=" + money +
                ", name='" + name + '\'' +
                ", managerAdvice='" + managerAdvice + '\'' +
                ", financialAdvice='" + financialAdvice + '\'' +
                ", proId=" + proId +
                ", pro=" + pro +
                ", traffic=" + traffic +
                ", stay=" + stay +
                ", shenname='" + shenname + '\'' +
                '}';
    }
}
