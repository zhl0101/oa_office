package com.zhl.oa.model.entity.dicuss;

import com.zhl.oa.model.entity.user.User;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName Discuss
 * @Description TODO 讨论表
 * @Author Administrator
 * @Date 2019/4/26 0026 21:59
 * @Version 1.0
 */
@Entity
@Table(name="aoa_discuss_list")
@Data
public class Discuss {
    @Id
    @Column(name="discuss_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long discussId; //主键id

    @Column(name="type_id")
    private Long typeId; //类型id

    @Column(name="status_id")
    private Long statusId; //状态id

    @Column(name="create_time")
    private Date createTime; //创建时间

    @Column(name="modify_time")
    private Date modifyTime=new Date(); //创建时间

    @Column(name="visit_num")
    private Integer visitNum; //访问量

    @Column(name="attachment_id")
    private Integer attachmentId;  //附件id没有外键为了查找方便

    @NotEmpty(message="标题不能为空")
    private String title;    //标题

    private String content;   //内容

    @ManyToOne
    @JoinColumn(name = "discuss_user_id")
    private User user;		//讨论归属人

    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vote_id")
    private VoteList voteList;	// 投票id

    @OneToMany(mappedBy="discuss",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    private Set<Reply> replys;

    @ManyToMany
    @JoinTable(
            name = "aoa_love_discuss_user",
            joinColumns = {
                    @JoinColumn(name = "discuss_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id")
            }
    )
    private Set<User> users;
}
