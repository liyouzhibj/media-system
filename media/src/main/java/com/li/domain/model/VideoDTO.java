package com.li.domain.model;

public class VideoDTO {
    private Integer id;
    private Integer channelId;
    private Integer status;
    private String createTime;
    private String updateTime;
    /**
     * 1本地视频，2视频链接
    */
    private Integer type;

    private String path;
    private String abstracts;
    private String name;
    private String thumbnail;

}
