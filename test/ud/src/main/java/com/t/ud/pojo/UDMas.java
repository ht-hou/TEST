package com.t.ud.pojo;

import java.util.Date;

public class UDMas {
    private Long fileId;

    private String filePath;

    private String fileName;

    private Date createTime;

    private Date updateTime;

    public UDMas() {
    }

    public UDMas(Long fileId, String filePath, String fileName, Date createTime, Date updateTime) {
        this.fileId = fileId;
        this.filePath = filePath;
        this.fileName = fileName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UDMas{" +
                "fileId=" + fileId +
                ", filePath='" + filePath + '\'' +
                ", fileName='" + fileName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
