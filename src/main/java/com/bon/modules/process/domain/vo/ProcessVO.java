package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-28
 * @Author Albert
 * @Version: 1.0
 * @Description: Process视图类
 * @Email: 502285815@qq.com
*/
public class ProcessVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long processId;

    private Date gmtCreate;

    private Date gmtModified;

    private Long formId;

    private Long nodeId;

    private String nodeName;

    private String status;

    private Byte backType;

    private Integer appointedDealer;

    private Integer preNodeId;

    private Integer nextNodeId;

    private Date createTime;

    private Date dealTime;

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
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

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Byte getBackType() {
        return backType;
    }

    public void setBackType(Byte backType) {
        this.backType = backType;
    }

    public Integer getAppointedDealer() {
        return appointedDealer;
    }

    public void setAppointedDealer(Integer appointedDealer) {
        this.appointedDealer = appointedDealer;
    }

    public Integer getPreNodeId() {
        return preNodeId;
    }

    public void setPreNodeId(Integer preNodeId) {
        this.preNodeId = preNodeId;
    }

    public Integer getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(Integer nextNodeId) {
        this.nextNodeId = nextNodeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

}
