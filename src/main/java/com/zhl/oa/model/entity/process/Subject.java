package com.zhl.oa.model.entity.process;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Subject
 * @Description TODO 费用科目明细表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:25
 * @Version 1.0
 */
@Entity
@Table(name="aoa_subject")
@Data
public class Subject {
    @Id
    @Column(name="subject_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long subjectId;

    @Column(name="parent_id")
    private Long parentId;

    private String name;

    public Subject() {
    }

    public Subject(Long parentId, String name) {

        this.parentId = parentId;
        this.name = name;
    }

    public Long getSubjectId() {

        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                '}';
    }
}
