package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDeal视图类
 * @Email: 502285815@qq.com
*/
public class ProcDealVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long procDealId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer processNodeId;

    private Integer dealer;

    private String status;

    private String description;

    private Date dealTime;

    public Long getProcDealId() {
        return procDealId;
    }

    public void setProcDealId(Long procDealId) {
        this.procDealId = procDealId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getProcessNodeId() {
        return processNodeId;
    }

    public void setProcessNodeId(Integer processNodeId) {
        this.processNodeId = processNodeId;
    }

    public Integer getDealer() {
        return dealer;
    }

    public void setDealer(Integer dealer) {
        this.dealer = dealer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

}
