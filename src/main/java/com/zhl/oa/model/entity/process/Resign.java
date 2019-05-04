package com.zhl.oa.model.entity.process;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Resign
 * @Description TODO 离职表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:22
 * @Version 1.0
 */
@Table
@Entity(name="aoa_resign")
@Data
public class Resign {
    @Id
    @Column(name="resign_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long resignId;

    private String suggest;//申请人的意见及建议

    @Column(name="is_finish")
    private Boolean finish=false;//是否还有费用报销未完成

    @OneToOne
    @JoinColumn(name="hand_user")
    private User handUser; //工作交接人员

    private String nofinish;//未完成事宜

    @Column(name="financial_advice")
    private String financialAdvice;//财务部意见及说明

    @Column(name="personnel_advice")
    private String personnelAdvice;//人事部意见及说明

    @Column(name="manager_advice")
    private String managerAdvice;//经理意见及说明

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pro_id")
    private ProcessList proId;

    @Transient
    private String nameuser;//审核人员

    @Transient
    private String handuser;//交接人员

    public Resign() {
    }

    public Resign(String suggest, Boolean finish, User handUser, String nofinish, String financialAdvice, String personnelAdvice, String managerAdvice, ProcessList proId, String nameuser, String handuser) {

        this.suggest = suggest;
        this.finish = finish;
        this.handUser = handUser;
        this.nofinish = nofinish;
        this.financialAdvice = financialAdvice;
        this.personnelAdvice = personnelAdvice;
        this.managerAdvice = managerAdvice;
        this.proId = proId;
        this.nameuser = nameuser;
        this.handuser = handuser;
    }

    public Long getResignId() {

        return resignId;
    }

    public void setResignId(Long resignId) {
        this.resignId = resignId;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public User getHandUser() {
        return handUser;
    }

    public void setHandUser(User handUser) {
        this.handUser = handUser;
    }

    public String getNofinish() {
        return nofinish;
    }

    public void setNofinish(String nofinish) {
        this.nofinish = nofinish;
    }

    public String getFinancialAdvice() {
        return financialAdvice;
    }

    public void setFinancialAdvice(String financialAdvice) {
        this.financialAdvice = financialAdvice;
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

    public ProcessList getProId() {
        return proId;
    }

    public void setProId(ProcessList proId) {
        this.proId = proId;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getHanduser() {
        return handuser;
    }

    public void setHanduser(String handuser) {
        this.handuser = handuser;
    }

    @Override
    public String toString() {
        return "Resign{" +
                "resignId=" + resignId +
                ", suggest='" + suggest + '\'' +
                ", finish=" + finish +
                ", handUser=" + handUser +
                ", nofinish='" + nofinish + '\'' +
                ", financialAdvice='" + financialAdvice + '\'' +
                ", personnelAdvice='" + personnelAdvice + '\'' +
                ", managerAdvice='" + managerAdvice + '\'' +
                ", proId=" + proId +
                ", nameuser='" + nameuser + '\'' +
                ", handuser='" + handuser + '\'' +
                '}';
    }
}
