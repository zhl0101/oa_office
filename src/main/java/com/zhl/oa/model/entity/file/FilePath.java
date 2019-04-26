package com.zhl.oa.model.entity.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @ClassName FilePath
 * @Description TODO 文件路径
 * @Author Administrator
 * @Date 2019/4/26 0026 22:11
 * @Version 1.0
 */
@Entity
@Table(name = "aoa_file_path")
@Data
public class FilePath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "path_id")
    private Long id;	//路径id

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "path_name")
    private String pathName;

    @Column(name = "path_istrash")
    private Long pathIstrash = 0L;

    @Column(name = "path_user_id")
    private Long pathUserId;

    @OneToMany(mappedBy = "fpath")
    @JsonIgnore
    private List<FileList> fileList;

    public FilePath(Long parentId, String pathName) {
        super();
        this.parentId = parentId;
        this.pathName = pathName;
    }
}
