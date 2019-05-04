package com.zhl.oa.model.entity.note;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Attachment
 * @Description TODO 附件表
 * @Author Administrator
 * @Date 2019/4/27 0027 10:56
 * @Version 1.0
 */
@Entity
@Table(name="aoa_attachment_list")
@Data
public class Attachment {
    @Id
    @Column(name="attachment_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long attachmentId; //附件id

    @Column(name="user_id")
    private String userId;    //用户id 在没有连接外键只是用来
    //查询用户表的

    @Column(name="attachment_name")
    private String attachmentName;  //附件名字

    @Column(name="attachment_path")
    private String attachmentPath;  //附件存储路径


    @Column(name="attachment_size")
    private Long attachmentSize; //附件大小

    @Column(name="attachment_type")
    private String attachmentType;  //附件类型

    @Column(name="upload_time")
    private Date uploadTime;     //附件上传时间

    private String model;          //所属模块

    @Column(name="attachment_shuffix")
    private String attachmentShuffix; //附件后缀

    public Attachment() {
    }

    public Attachment(String userId, String attachmentName, String attachmentPath, Long attachmentSize, String attachmentType, Date uploadTime, String model, String attachmentShuffix) {

        this.userId = userId;
        this.attachmentName = attachmentName;
        this.attachmentPath = attachmentPath;
        this.attachmentSize = attachmentSize;
        this.attachmentType = attachmentType;
        this.uploadTime = uploadTime;
        this.model = model;
        this.attachmentShuffix = attachmentShuffix;
    }

    public Long getAttachmentId() {

        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public Long getAttachmentSize() {
        return attachmentSize;
    }

    public void setAttachmentSize(Long attachmentSize) {
        this.attachmentSize = attachmentSize;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAttachmentShuffix() {
        return attachmentShuffix;
    }

    public void setAttachmentShuffix(String attachmentShuffix) {
        this.attachmentShuffix = attachmentShuffix;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "attachmentId=" + attachmentId +
                ", userId='" + userId + '\'' +
                ", attachmentName='" + attachmentName + '\'' +
                ", attachmentPath='" + attachmentPath + '\'' +
                ", attachmentSize=" + attachmentSize +
                ", attachmentType='" + attachmentType + '\'' +
                ", uploadTime=" + uploadTime +
                ", model='" + model + '\'' +
                ", attachmentShuffix='" + attachmentShuffix + '\'' +
                '}';
    }
}
