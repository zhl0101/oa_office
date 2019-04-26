package com.zhl.oa.model.entity.role;

import lombok.Data;

import javax.persistence.Column;

/**
 * @ClassName Rolemenu
 * @Description TODO 角色菜单
 * @Author Administrator
 * @Date 2019/4/26 0026 21:49
 * @Version 1.0
 */
@Data
public class Rolemenu {
    private Long menuId; // 菜单id

    private String menuName; // 菜单名字

    private String menuUrl; // 菜单链接

    @Column(name = "is_show")
    private Boolean show=false; // 菜单是否显示

    @Column(name = "is_show")
    private Boolean check=false; // 是否分配资源

    private String menuIcon; // 菜单图标

    private Integer sortId; // 菜单排序id

    private Integer menuGrade; // 权限值分数

    private Long parentId;
}
