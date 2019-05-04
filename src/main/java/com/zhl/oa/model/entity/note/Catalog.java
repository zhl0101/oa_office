package com.zhl.oa.model.entity.note;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Catalog
 * @Description TODO 目录表
 * @Author Administrator
 * @Date 2019/4/27 0027 10:58
 * @Version 1.0
 */
@Entity
@Table(name="aoa_catalog")
@Data
public class Catalog {
    @Id
    @Column(name="catalog_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long catalogId; //目录id



    @Column(name="catalog_name")
    private String catalogName; //目录名字

    @ManyToOne
    @JoinColumn(name="cata_user_id")
    private User user;

    //判断id
    @Column(name="parent_id")
    private Integer parentId;

    public Catalog() {
    }
    public Catalog(String catalogName, User user) {
        super();
        this.catalogName = catalogName;
        this.user = user;
    }
    public Catalog(String catalogName, User user, Integer parentId) {

        this.catalogName = catalogName;
        this.user = user;
        this.parentId = parentId;
    }

    public Long getCatalogId() {

        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", user=" + user +
                ", parentId=" + parentId +
                '}';
    }
}
