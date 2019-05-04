package com.zhl.oa.model.entity.note;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName Note
 * @Description TODO 笔记表
 * @Author Administrator
 * @Date 2019/4/26 0026 22:02
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_note_list")
@Data
public class Note {
    @Id
    @Column(name = "note_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId; // 笔记id

    @NotBlank
    private String title;// 笔记标题

    @NotBlank
    private String content;// 内容

    @Column(name = "catalog_id")
    private Long catalogId; // 目录id

    @Column(name = "type_id")
    private Long typeId; // 类型id

    @Column(name = "status_id")
    private Long statusId; // 状态id

    @Column(name = "attach_id")
    private Long attachId; // 附件id

    @Column(name = "create_time")
    private Date createTime;// 发布时间

    @Column(name = "is_collected")
    private Long isCollected; // 是否收藏

    @Column(name = "createman_id")
    private Long createmanId; // 类型id

    @Column(name = "receiver")
    private String receiver;// 笔记分享接收人

    @ManyToMany
    @JoinTable(name = "aoa_receiver_note", joinColumns = { @JoinColumn(name = "note_id") }, inverseJoinColumns = {
            @JoinColumn(name = "user_id") })
    private Set<User> userss;

    public Note() {
    }



    public Note(String title, String content, Long catalogId, Long typeId, Long statusId, Long attachId,
                Date createTime, Long isCollected) {
        super();
        this.title = title;
        this.content = content;
        this.catalogId = catalogId;
        this.typeId = typeId;
        this.statusId = statusId;
        this.attachId = attachId;
        this.createTime = createTime;
        this.isCollected = isCollected;

    }

    public Note(String title, String content, Long catalogId, Long typeId, Long statusId, Long attachId, Date createTime, Long isCollected, Long createmanId, String receiver, Set<User> userss) {

        this.title = title;
        this.content = content;
        this.catalogId = catalogId;
        this.typeId = typeId;
        this.statusId = statusId;
        this.attachId = attachId;
        this.createTime = createTime;
        this.isCollected = isCollected;
        this.createmanId = createmanId;
        this.receiver = receiver;
        this.userss = userss;
    }

    public Long getNoteId() {

        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getAttachId() {
        return attachId;
    }

    public void setAttachId(Long attachId) {
        this.attachId = attachId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getIsCollected() {
        return isCollected;
    }

    public void setIsCollected(Long isCollected) {
        this.isCollected = isCollected;
    }

    public Long getCreatemanId() {
        return createmanId;
    }

    public void setCreatemanId(Long createmanId) {
        this.createmanId = createmanId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Set<User> getUserss() {
        return userss;
    }

    public void setUserss(Set<User> userss) {
        this.userss = userss;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", catalogId=" + catalogId +
                ", typeId=" + typeId +
                ", statusId=" + statusId +
                ", attachId=" + attachId +
                ", createTime=" + createTime +
                ", isCollected=" + isCollected +
                ", createmanId=" + createmanId +
                ", receiver='" + receiver + '\'' +
                ", userss=" + userss +
                '}';
    }
}
