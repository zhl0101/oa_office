package com.zhl.oa.model.entity.role;

import com.zhl.oa.model.entity.system.SystemMenu;
import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Rolepowerlist
 * @Description TODO 角色权限中间表
 * @Author Administrator
 * @Date 2019/4/26 0026 21:50
 * @Version 1.0
 */
@Entity
@Table(name="aoa_role_power_list")
@Data
public class Rolepowerlist {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pk_id")
    private Long pkId;


    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role roleId;

    @ManyToOne()
    @JoinColumn(name = "menu_id")
    private SystemMenu menuId;


    @Column(name="is_show")
    private Boolean check=false;

    public Rolepowerlist(Role roleId, SystemMenu menuId) {

        this.roleId = roleId;
        this.menuId = menuId;

    }


    public Rolepowerlist(Role roleId, SystemMenu menuId, Boolean check) {
        super();
        this.roleId = roleId;
        this.menuId = menuId;
        this.check = check;
    }

    public Rolepowerlist() {
    }

    public Long getPkId() {

        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public SystemMenu getMenuId() {
        return menuId;
    }

    public void setMenuId(SystemMenu menuId) {
        this.menuId = menuId;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Rolepowerlist{" +
                "pkId=" + pkId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", check=" + check +
                '}';
    }
}
