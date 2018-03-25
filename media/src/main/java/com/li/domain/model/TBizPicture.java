package com.li.domain.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author K神带你飞
 * @since 2018-03-25
 */
@TableName("t_biz_picture")
public class TBizPicture implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    @TableField("albumId")
    private Integer albumId;
    private Integer status;
    @TableField("createTime")
    private String createTime;
    @TableField("updateTime")
    private String updateTime;
    @TableField("isCover")
    private Integer isCover;
    private String path;
    @TableField("sourceName")
    private String sourceName;
    @TableField("sequenceNo")
    private Integer sequenceNo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsCover() {
        return isCover;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    @Override
    public String toString() {
        return "TBizPicture{" +
        ", id=" + id +
        ", name=" + name +
        ", albumId=" + albumId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isCover=" + isCover +
        ", path=" + path +
        ", sourceName=" + sourceName +
        ", sequenceNo=" + sequenceNo +
        "}";
    }
}
