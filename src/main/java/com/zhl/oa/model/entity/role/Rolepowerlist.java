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
}
