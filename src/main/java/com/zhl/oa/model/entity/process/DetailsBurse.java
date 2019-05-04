package com.zhl.oa.model.entity.process;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName DetailsBurse
 * @Description TODO 报销费用明细表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:14
 * @Version 1.0
 */
@Entity
@Table(name="aoa_detailsburse")
@Data
public class DetailsBurse {
    @Id
    @Column(name="detailsburse_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long detailsburseId;

    private Date produceTime;//费用产生时间

    private String 	subject;//费用产生科目

    private String descript;//费用说明

    private Integer invoices ;//票据张数

    private double detailmoney;//报销金额

    @ManyToOne()
    @JoinColumn(name="bursment_id")
    private Bursement burs;//对应报销表

    public DetailsBurse() {
    }

    public DetailsBurse(Date produceTime, String subject, String descript, Integer invoices, double detailmoney, Bursement burs) {

        this.produceTime = produceTime;
        this.subject = subject;
        this.descript = descript;
        this.invoices = invoices;
        this.detailmoney = detailmoney;
        this.burs = burs;
    }

    public Long getDetailsburseId() {

        return detailsburseId;
    }

    public void setDetailsburseId(Long detailsburseId) {
        this.detailsburseId = detailsburseId;
    }

    public Date getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(Date produceTime) {
        this.produceTime = produceTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getInvoices() {
        return invoices;
    }

    public void setInvoices(Integer invoices) {
        this.invoices = invoices;
    }

    public double getDetailmoney() {
        return detailmoney;
    }

    public void setDetailmoney(double detailmoney) {
        this.detailmoney = detailmoney;
    }

    public Bursement getBurs() {
        return burs;
    }

    public void setBurs(Bursement burs) {
        this.burs = burs;
    }

    @Override
    public String toString() {
        return "DetailsBurse{" +
                "detailsburseId=" + detailsburseId +
                ", produceTime=" + produceTime +
                ", subject='" + subject + '\'' +
                ", descript='" + descript + '\'' +
                ", invoices=" + invoices +
                ", detailmoney=" + detailmoney +
                ", burs=" + burs +
                '}';
    }
}
