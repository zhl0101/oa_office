package com.zhl.oa.model.entity.note;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Director
 * @Description TODO 通讯录表
 * @Author Administrator
 * @Date 2019/4/27 0027 10:59
 * @Version 1.0
 */
@Entity
@Table(name="aoa_director")
@Data
public class Director {
    @Id
    @Column(name="director_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long  directorId; //主键

    @Column(name="user_name")
    private String userName;	//通讯录名称

    private String pinyin;		//通讯录名称的拼音

    private String  sex;		//性别

    @Column(name="phone_number")
    private String  phoneNumber;  //电话号码

    @Column(name="image_path")
    private Long  attachment;	 //头像路径

    private String  remark;     //备注

    private String  address;	//用户住址

    @OneToOne
    @JoinColumn(name = "user_id")
    private User myuser;		//由哪个用户创建的

    private String  email;		//邮件

    @Column(name="company_number")
    private String companyNumber;	//公司号码

    private String companyname;		//公司名称

    public Director() {
    }

    public Director(String userName, String pinyin, String sex, String phoneNumber, Long attachment, String remark, String address, User myuser, String email, String companyNumber, String companyname) {

        this.userName = userName;
        this.pinyin = pinyin;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.attachment = attachment;
        this.remark = remark;
        this.address = address;
        this.myuser = myuser;
        this.email = email;
        this.companyNumber = companyNumber;
        this.companyname = companyname;
    }

    public Long getDirectorId() {

        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getAttachment() {
        return attachment;
    }

    public void setAttachment(Long attachment) {
        this.attachment = attachment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getMyuser() {
        return myuser;
    }

    public void setMyuser(User myuser) {
        this.myuser = myuser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Director{" +
                "directorId=" + directorId +
                ", userName='" + userName + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", attachment=" + attachment +
                ", remark='" + remark + '\'' +
                ", address='" + address + '\'' +
                ", myuser=" + myuser +
                ", email='" + email + '\'' +
                ", companyNumber='" + companyNumber + '\'' +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
