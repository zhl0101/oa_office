package com.zhl.oa.model.dao.notedao;


import com.zhl.oa.model.entity.note.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AttachmentDao  extends JpaRepository<Attachment, Long>{

	Attachment findByAttachmentPath(String AttachmentPath);
	
	Attachment findByAttachmentId(long AttachmentId);
	
	@Query("update Attachment a set a.attachmentName=?1,a.attachmentPath=?2,a.attachmentShuffix=?3,a.attachmentSize=?4,a.attachmentType=?5,a.uploadTime=?6 where a.attachmentId=?7")
    @Modifying
    Integer updateatt(String attname, String attpath, String shu, Long size, String type, Date uptime, Long attid);
}
