package com.zhl.oa.model.entity.system;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * @ClassName SystemTypeList
 * @Description TODO 系统类型总表
 * @Author Administrator
 * @Date 2019/4/23 0023 22:05
 * @Version 1.0
 */
@Data
@Entity
@Table(name="aoa_type_list")
public class SystemTypeList {

    @Id
    @Column(name="type_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long typeId;			//类型id

    @Column(name="type_name")
    @NotEmpty(message="类型名称不能为空")
    private String typeName;		//类型名字

    @Column(name="sort_value")
    private Integer typeSortValue;	//排序值

    @Column(name="type_model")
    private String typeModel;		//所属模块

    @Column(name="type_color")
    private String typeColor;		//类型颜色

}
