package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-25
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision视图类
 * @Email: 502285815@qq.com
*/
public class ProcDecisionVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long decisionId;

    private Date gmtCreate;

    private Date gmtModified;

    private String type;

    private Integer nodeId;

    private String status;

    private String decisionInfo;

    private Integer nextNodeId;

    public Long getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(Long decisionId) {
        this.decisionId = decisionId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDecisionInfo() {
        return decisionInfo;
    }

    public void setDecisionInfo(String decisionInfo) {
        this.decisionInfo = decisionInfo;
    }

    public Integer getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(Integer nextNodeId) {
        this.nextNodeId = nextNodeId;
    }

}
