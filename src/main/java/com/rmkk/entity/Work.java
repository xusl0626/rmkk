package com.rmkk.entity;

import java.util.Date;

public class Work {
    private Integer id;

    private Integer agencyId;

    private Integer createUserid;

    private Date createTime;

    private Date overTime;

    private String initFile;

    private String finalFile;

    private Integer status;

    private Integer reviewUserid;

    private Boolean isImportant;

    private String opinion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public String getInitFile() {
        return initFile;
    }

    public void setInitFile(String initFile) {
        this.initFile = initFile == null ? null : initFile.trim();
    }

    public String getFinalFile() {
        return finalFile;
    }

    public void setFinalFile(String finalFile) {
        this.finalFile = finalFile == null ? null : finalFile.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReviewUserid() {
        return reviewUserid;
    }

    public void setReviewUserid(Integer reviewUserid) {
        this.reviewUserid = reviewUserid;
    }

    public Boolean getIsImportant() {
        return isImportant;
    }

    public void setIsImportant(Boolean isImportant) {
        this.isImportant = isImportant;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}