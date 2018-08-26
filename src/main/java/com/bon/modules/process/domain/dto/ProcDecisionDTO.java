package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.ProcDecision;

/**
 * @Created：2018-08-25
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="ProcDecisionDTO")
public class ProcDecisionDTO extends BaseDTO<ProcDecision> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long decisionId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "连线类型")
    private String type;

    @ApiModelProperty(value = "节点ID：与proc_setting.node_id关联")
    private Integer nodeId;

    @ApiModelProperty(value = "处理结果：00：未处理;01：通过;02：拒绝;03：驳回")
    private String status;

    @ApiModelProperty(value = "决策判断信息")
    private String decisionInfo;

    @ApiModelProperty(value = "下一节点，无下一节点为0，表示结束")
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
