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
}
