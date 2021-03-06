package com.yang.pan.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OutFile {
    private Integer fid;
    private String uname;
    private Integer updirid;
    private String filename;
    private String filesize;
    private String filetype;
    private String filepath;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date modifieddate;
    private boolean is_delete;

    public OutFile() {
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUpdirid() {
        return updirid;
    }

    public void setUpdirid(Integer updirid) {
        this.updirid = updirid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }
}
