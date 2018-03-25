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
@TableName("t_biz_article")
public class TBizArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String title;
    private String content;
    private String thumbnail;
    @TableField("isTop")
    private Integer isTop;
    @TableField("isAds")
    private Integer isAds;
    @TableField("adsThumbnail")
    private String adsThumbnail;
    @TableField("specialId")
    private Integer specialId;
    @TableField("typeId")
    private Integer typeId;
    @TableField("labelIds")
    private String labelIds;
    private String abstracts;
    private String author;
    private String source;
    private Integer status;
    @TableField("createTime")
    private String createTime;
    @TableField("sequenceNo")
    private Integer sequenceNo;
    @TableField("updateTime")
    private String updateTime;
    @TableField("linkTo")
    private Integer linkTo;
    @TableField("userId")
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsAds() {
        return isAds;
    }

    public void setIsAds(Integer isAds) {
        this.isAds = isAds;
    }

    public String getAdsThumbnail() {
        return adsThumbnail;
    }

    public void setAdsThumbnail(String adsThumbnail) {
        this.adsThumbnail = adsThumbnail;
    }

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getLinkTo() {
        return linkTo;
    }

    public void setLinkTo(Integer linkTo) {
        this.linkTo = linkTo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TBizArticle{" +
        ", id=" + id +
        ", title=" + title +
        ", content=" + content +
        ", thumbnail=" + thumbnail +
        ", isTop=" + isTop +
        ", isAds=" + isAds +
        ", adsThumbnail=" + adsThumbnail +
        ", specialId=" + specialId +
        ", typeId=" + typeId +
        ", labelIds=" + labelIds +
        ", abstracts=" + abstracts +
        ", author=" + author +
        ", source=" + source +
        ", status=" + status +
        ", createTime=" + createTime +
        ", sequenceNo=" + sequenceNo +
        ", updateTime=" + updateTime +
        ", linkTo=" + linkTo +
        ", userId=" + userId +
        "}";
    }
}
