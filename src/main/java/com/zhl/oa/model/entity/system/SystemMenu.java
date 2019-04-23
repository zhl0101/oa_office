package com.zhl.oa.model.entity.system;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * @ClassName SystemMenu
 * @Description TODO 系统菜单实体类表
 * @Author Administrator
 * @Date 2019/4/23 0023 22:00
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_sys_menu")
@Data
public class SystemMenu {

    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId; // 菜单id

    @Column(name = "parent_id")
    private Long parentId=0L; // 父id

    @Column(name = "menu_name")
    @NotEmpty(message="菜单名字不能为空")
    private String menuName; // 菜单名字

    @Column(name = "menu_url")
    @NotEmpty(message="{sysMenu.menuUrl.NotNull}")
    private String menuUrl; // 菜单链接

    @Column(name = "menu_icon")
    private String menuIcon; // 菜单图标

    @Column(name = "sort_id")
    private Integer sortId=999; // 菜单排序id

    @Column(name = "is_show")
    private Boolean show=false; // 菜单是否显示

    @Column(name = "menu_grade")
    private Integer menuGrade;

}
