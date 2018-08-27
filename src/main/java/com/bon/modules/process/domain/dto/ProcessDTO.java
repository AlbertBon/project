package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.Process;

/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: Process参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="ProcessDTO")
public class ProcessDTO extends BaseDTO<Process> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long processId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "表单实例ID:关联form.form_id")
    private Integer formId;

    @ApiModelProperty(value = "扩展表单项ID：关联form_ext_setting.option_id")
    private Integer nodeId;

    @ApiModelProperty(value = "节点名称")
    private String nodeName;

    @ApiModelProperty(value = "处理结果:01：未处理;02：通过;03：拒绝;04：驳回")
    private String status;

    @ApiModelProperty(value = "是否自动决策:0：原路驳回;1：驳回到节点")
    private Byte backType;

    @ApiModelProperty(value = "指定处理人:关联到staff.staff_id")
    private Integer appointedDealer;

    @ApiModelProperty(value = "上一节点ID:与process. process_node_id相关联;相互勾连形成链式结构;创建记录时填写")
    private Integer preNodeId;

    @ApiModelProperty(value = "下一节点ID:与process. process_node_id相关联;相互勾连形成链式结构;创建记录时填写")
    private Integer nextNodeId;

    @ApiModelProperty(value = "节点创建时间:上一节点完成时间")
    private Date createTime;

    @ApiModelProperty(value = "处理完成时间")
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

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
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
