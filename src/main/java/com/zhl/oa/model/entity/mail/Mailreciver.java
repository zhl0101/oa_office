package com.zhl.oa.model.entity.mail;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Mailreciver
 * @Description TODO //内部邮件收件人中间表
 * @Author Administrator
 * @Date 2019/4/27 0027 10:54
 * @Version 1.0
 */
@Entity
@Table(name="aoa_mail_reciver")
@Data
public class Mailreciver {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pk_id")
    private Long pkId;


    @ManyToOne
    @JoinColumn(name="mail_id")
    private Inmaillist mailId;//内部邮件id


    @ManyToOne
    @JoinColumn(name="mail_reciver_id")
    private User reciverId;//内部用户id

    @Column(name="is_read")
    private Boolean read=false;//是否已读

    @Column(name="is_star")
    private Boolean star=false;//是否星标

    @Column(name="is_del")
    private Boolean del=false;//是否真正删除

    public Mailreciver() {
    }

    public Mailreciver(Inmaillist mailId, User reciverId, Boolean read, Boolean star, Boolean del) {

        this.mailId = mailId;
        this.reciverId = reciverId;
        this.read = read;
        this.star = star;
        this.del = del;
    }

    public Long getPkId() {

        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Inmaillist getMailId() {
        return mailId;
    }

    public void setMailId(Inmaillist mailId) {
        this.mailId = mailId;
    }

    public User getReciverId() {
        return reciverId;
    }

    public void setReciverId(User reciverId) {
        this.reciverId = reciverId;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "Mailreciver{" +
                "pkId=" + pkId +
                ", mailId=" + mailId +
                ", reciverId=" + reciverId +
                ", read=" + read +
                ", star=" + star +
                ", del=" + del +
                '}';
    }
}
