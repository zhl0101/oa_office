package com.zhl.oa.model.entity.mail;

import com.zhl.oa.model.entity.note.Attachment;
import com.zhl.oa.model.entity.user.User;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Inmaillist
 * @Description TODO 内部邮件
 * @Author Administrator
 * @Date 2019/4/27 0027 10:52
 * @Version 1.0
 */
@Entity
@Table(name="aoa_in_mail_list")
@Data
public class Inmaillist {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="mail_id")
    private Long mailId;//邮件id

    @Column(name="mail_type")
    private Long mailType;//邮件类型（通知，公告，邮件）

    @Column(name="mail_status_id")
    private Long mailStatusid;//邮件状态（一般，紧急，重要）

    @ManyToOne
    @JoinColumn(name="mail_in_push_user_id")
    private User mailUserid;//发件人id

    @Column(name="mail_title")
    @NotEmpty(message="邮件主题不能为空")
    private String mailTitle;//邮件主题

    @Column(name="mail_content")
    @NotEmpty(message="邮件内容不能为空")
    private String content;//邮件内容

    @Column(name="in_receiver")
    private String inReceiver;//接收人（可以是多个）

    @ManyToOne
    @JoinColumn(name="mail_file_id")
    private Attachment mailFileid;//邮件附件id

    @Column(name="mail_create_time")
    private Date mailCreateTime;//邮件创建时间

    @ManyToOne
    @JoinColumn(name="mail_number_id")
    private Mailnumber mailNumberid;//外部邮件账号id

    @Column(name="mail_del")
    private Boolean del=false;

    @Column(name="mail_push")
    private Boolean push=false;

    @Column(name="mail_star")
    private Boolean star=false;

    @Transient
    private Long inmail;

    @Transient
    private String huizhuan;

    public Inmaillist() {
    }

    public Inmaillist(Long mailType, Long mailStatusid, User mailUserid, String mailTitle, String content, String inReceiver, Attachment mailFileid, Date mailCreateTime, Mailnumber mailNumberid, Boolean del, Boolean push, Boolean star, Long inmail, String huizhuan) {

        this.mailType = mailType;
        this.mailStatusid = mailStatusid;
        this.mailUserid = mailUserid;
        this.mailTitle = mailTitle;
        this.content = content;
        this.inReceiver = inReceiver;
        this.mailFileid = mailFileid;
        this.mailCreateTime = mailCreateTime;
        this.mailNumberid = mailNumberid;
        this.del = del;
        this.push = push;
        this.star = star;
        this.inmail = inmail;
        this.huizhuan = huizhuan;
    }

    public Long getMailId() {

        return mailId;
    }

    public void setMailId(Long mailId) {
        this.mailId = mailId;
    }

    public Long getMailType() {
        return mailType;
    }

    public void setMailType(Long mailType) {
        this.mailType = mailType;
    }

    public Long getMailStatusid() {
        return mailStatusid;
    }

    public void setMailStatusid(Long mailStatusid) {
        this.mailStatusid = mailStatusid;
    }

    public User getMailUserid() {
        return mailUserid;
    }

    public void setMailUserid(User mailUserid) {
        this.mailUserid = mailUserid;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInReceiver() {
        return inReceiver;
    }

    public void setInReceiver(String inReceiver) {
        this.inReceiver = inReceiver;
    }

    public Attachment getMailFileid() {
        return mailFileid;
    }

    public void setMailFileid(Attachment mailFileid) {
        this.mailFileid = mailFileid;
    }

    public Date getMailCreateTime() {
        return mailCreateTime;
    }

    public void setMailCreateTime(Date mailCreateTime) {
        this.mailCreateTime = mailCreateTime;
    }

    public Mailnumber getMailNumberid() {
        return mailNumberid;
    }

    public void setMailNumberid(Mailnumber mailNumberid) {
        this.mailNumberid = mailNumberid;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public Long getInmail() {
        return inmail;
    }

    public void setInmail(Long inmail) {
        this.inmail = inmail;
    }

    public String getHuizhuan() {
        return huizhuan;
    }

    public void setHuizhuan(String huizhuan) {
        this.huizhuan = huizhuan;
    }

    @Override
    public String toString() {
        return "Inmaillist{" +
                "mailId=" + mailId +
                ", mailType=" + mailType +
                ", mailStatusid=" + mailStatusid +
                ", mailUserid=" + mailUserid +
                ", mailTitle='" + mailTitle + '\'' +
                ", content='" + content + '\'' +
                ", inReceiver='" + inReceiver + '\'' +
                ", mailFileid=" + mailFileid +
                ", mailCreateTime=" + mailCreateTime +
                ", mailNumberid=" + mailNumberid +
                ", del=" + del +
                ", push=" + push +
                ", star=" + star +
                ", inmail=" + inmail +
                ", huizhuan='" + huizhuan + '\'' +
                '}';
    }
}
