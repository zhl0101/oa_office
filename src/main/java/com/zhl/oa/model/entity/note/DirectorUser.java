package com.zhl.oa.model.entity.note;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName DirectorUser
 * @Description TODO 通讯录用户中间表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:00
 * @Version 1.0
 */
@Entity
@Table(name="aoa_director_users")
@Data
public class DirectorUser {
    @Id
    @Column(name="director_users_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long directorUserId;

    @ManyToOne
    @JoinColumn(name="director_id")
    private Director director;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="share_user_id")
    private User shareuser;

    @Column(name="catelog_name")
    private String catalogName;

    private Date sharetime=new Date();

    @Column(name="is_handle")
    private Boolean handle=false;

    public DirectorUser() {
    }

    public DirectorUser(User shareuser, String catalogName) {
        this.shareuser = shareuser;
        this.catalogName = catalogName;
    }

    public DirectorUser(Director director, User user, User shareuser, String catalogName, Date sharetime, Boolean handle) {

        this.director = director;
        this.user = user;
        this.shareuser = shareuser;
        this.catalogName = catalogName;
        this.sharetime = sharetime;
        this.handle = handle;
    }

    public Long getDirectorUserId() {

        return directorUserId;
    }

    public void setDirectorUserId(Long directorUserId) {
        this.directorUserId = directorUserId;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getShareuser() {
        return shareuser;
    }

    public void setShareuser(User shareuser) {
        this.shareuser = shareuser;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public Date getSharetime() {
        return sharetime;
    }

    public void setSharetime(Date sharetime) {
        this.sharetime = sharetime;
    }

    public Boolean getHandle() {
        return handle;
    }

    public void setHandle(Boolean handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "DirectorUser{" +
                "directorUserId=" + directorUserId +
                ", director=" + director +
                ", user=" + user +
                ", shareuser=" + shareuser +
                ", catalogName='" + catalogName + '\'' +
                ", sharetime=" + sharetime +
                ", handle=" + handle +
                '}';
    }
}
