package com.zhl.oa.model.entity.note;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Noteuser
 * @Description TODO 笔记用户中间表
 * @Author Administrator
 * @Date 2019/4/27 0027 11:02
 * @Version 1.0
 */
@Entity
@Table(name="aoa_receiver_note")
@Data
public class Noteuser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 笔记id
     */
    @Column(name = "note_id", nullable = false)
    private Long noteId;

    /**
     * 用户id
     */
    @Column(name = "user_id", nullable = false)
    private Long userId;

    public Noteuser() {
    }

    public Noteuser(Long noteId, Long userId) {

        this.noteId = noteId;
        this.userId = userId;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Noteuser{" +
                "id=" + id +
                ", noteId=" + noteId +
                ", userId=" + userId +
                '}';
    }
}
