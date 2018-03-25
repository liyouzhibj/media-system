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
@TableName("t_sys_usergroup")
public class TSysUsergroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("parentId")
    private Integer parentId;
    private Integer status;
    @TableField("createTime")
    private String createTime;
    private String name;
    private Integer level;
    private String elders;
    private String abstracts;
    @TableField("updateTime")
    private String updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getElders() {
        return elders;
    }

    public void setElders(String elders) {
        this.elders = elders;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "TSysUsergroup{" +
        ", id=" + id +
        ", parentId=" + parentId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", name=" + name +
        ", level=" + level +
        ", elders=" + elders +
        ", abstracts=" + abstracts +
        ", updateTime=" + updateTime +
        "}";
    }
}
