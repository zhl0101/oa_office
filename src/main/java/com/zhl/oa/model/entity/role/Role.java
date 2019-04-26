package com.zhl.oa.model.entity.role;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Role
 * @Description TODO 角色
 * @Author Administrator
 * @Date 2019/4/26 0026 21:48
 * @Version 1.0
 */
@Entity
@Table(name="aoa_role_")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long roleId;//角色id

    @Column(name="role_name")
    private String roleName;//角色名

    @Column(name="role_value")
    private Integer  roleValue;//角色权限值

}
