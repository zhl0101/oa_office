package com.zhl.oa.model.entity.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zhl.oa.model.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName FileList
 * @Description TODO 文件
 * @Author Administrator
 * @Date 2019/4/26 0026 22:10
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_file_list")
@Data
public class FileList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long fileId;	//文件id

    @Column(name = "file_name")
    private String fileName;	//文件名字

    @Column(name = "file_path")
    private String filePath;	//文件路径

    private Long size;	//文件大小

    @Column(name = "content_type")
    private String contentType;	//文件类型id

    @Column(name = "upload_time")
    private Date uploadTime;	//上传时间

    private String model;		//所属模块

    @Column(name = "file_shuffix")
    private String fileShuffix;	//文件后缀名

    @Column(name = "file_istrash")
    private Long fileIstrash = 0L;

    @Column(name = "file_isshare")
    private Long fileIsshare = 0L;


    @ManyToOne
    @JoinColumn(name = "file_user_id")
    private User user;			//外键关联用户表  -文件上传者

    @ManyToOne
    @JoinColumn(name = "path_id")
    @JsonIgnore
    private FilePath fpath;
}
