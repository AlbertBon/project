package com.bon.modules.process.domain.entity;

import java.util.*;
import java.io.Serializable;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="ProcDecision",description = "流程决策配置表")
public class ProcDecision implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value = "ID")
    private Long decisionId;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    @ApiModelProperty(value = "表单类型ID")
    private Integer formTypeId;

    @ApiModelProperty(value = "决策名称")
    private String name;

    @ApiModelProperty(value = "连线类型")
    private String type;

    @ApiModelProperty(value = "节点ID：与proc_setting.node_id关联")
    private Long nodeId;

    @ApiModelProperty(value = "处理结果：00：未处理;01：通过;02：拒绝;03：驳回")
    private String status;

    @ApiModelProperty(value = "决策判断信息")
    private String decisionInfo;

    @ApiModelProperty(value = "下一节点，无下一节点为0，表示结束")
    private Long nextNodeId;

    @ApiModelProperty(value = "当type=”lr”时,为中段的相对于工作区的X坐标值,当type=”tb”时,为中段的相对于工作区的Y坐标值.")
    private String position;

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

    public Integer getFormTypeId() {
        return formTypeId;
    }

    public void setFormTypeId(Integer formTypeId) {
        this.formTypeId = formTypeId;
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

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
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

    public Long getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(Long nextNodeId) {
        this.nextNodeId = nextNodeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
