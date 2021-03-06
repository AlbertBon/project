package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-24
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision视图类
 * @Email: 502285815@qq.com
*/
public class ProcDecisionVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long decisionId;

    private Integer objectId;

    private String name;

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

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
