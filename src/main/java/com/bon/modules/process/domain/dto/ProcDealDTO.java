package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.ProcDeal;

/**
 * @Created：2018-08-28
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDeal参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="ProcDealDTO")
public class ProcDealDTO extends BaseDTO<ProcDeal> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long procDealId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "流程记录节点ID:与process.process_node_id相关联")
    private Long processNodeId;

    @ApiModelProperty(value = "处理员工ID:关联staff.staff_id ")
    private Long dealer;

    @ApiModelProperty(value = "处理结果:01：通过;02：拒绝;03：驳回")
    private String status;

    @ApiModelProperty(value = "处理意见")
    private String description;

    @ApiModelProperty(value = "处理时间")
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

    public Long getProcessNodeId() {
        return processNodeId;
    }

    public void setProcessNodeId(Long processNodeId) {
        this.processNodeId = processNodeId;
    }

    public Long getDealer() {
        return dealer;
    }

    public void setDealer(Long dealer) {
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
