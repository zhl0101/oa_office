package com.zhl.oa.model.entity.process;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Stay
 * @Description TODO 住宿申请表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:24
 * @Version 1.0
 */
@Entity
@Table(name="aoa_stay")
@Data
public class Stay {
    @Id
    @Column(name="stay_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long stayId;

    @OneToOne
    @JoinColumn(name="user_name")
    private User user;//出差人员

    @Column(name="stay_time")
    private Date stayTime;//入住日期

    @Column(name="leave_time")
    private Date leaveTime;//离店日期

    @Column(name="stay_city")
    private String stayCity;//入住城市

    @Column(name="hotel_name")
    private String hotelName;//入住酒店

    @Column(name="day")
    private Integer day;//入住天数

    @Column(name="stay_money")
    private Double stayMoney;//酒店标准

    @ManyToOne()
    @JoinColumn(name="evemoney_id")
    private  EvectionMoney  evemoney;

    @Transient
    private String nameuser;

    public Stay() {
    }

    public Stay(User user, Date stayTime, Date leaveTime, String stayCity, String hotelName, Integer day, Double stayMoney, EvectionMoney evemoney, String nameuser) {

        this.user = user;
        this.stayTime = stayTime;
        this.leaveTime = leaveTime;
        this.stayCity = stayCity;
        this.hotelName = hotelName;
        this.day = day;
        this.stayMoney = stayMoney;
        this.evemoney = evemoney;
        this.nameuser = nameuser;
    }

    public Long getStayId() {

        return stayId;
    }

    public void setStayId(Long stayId) {
        this.stayId = stayId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStayTime() {
        return stayTime;
    }

    public void setStayTime(Date stayTime) {
        this.stayTime = stayTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getStayCity() {
        return stayCity;
    }

    public void setStayCity(String stayCity) {
        this.stayCity = stayCity;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Double getStayMoney() {
        return stayMoney;
    }

    public void setStayMoney(Double stayMoney) {
        this.stayMoney = stayMoney;
    }

    public EvectionMoney getEvemoney() {
        return evemoney;
    }

    public void setEvemoney(EvectionMoney evemoney) {
        this.evemoney = evemoney;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    @Override
    public String toString() {
        return "Stay{" +
                "stayId=" + stayId +
                ", user=" + user +
                ", stayTime=" + stayTime +
                ", leaveTime=" + leaveTime +
                ", stayCity='" + stayCity + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", day=" + day +
                ", stayMoney=" + stayMoney +
                ", evemoney=" + evemoney +
                ", nameuser='" + nameuser + '\'' +
                '}';
    }
}
