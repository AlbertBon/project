package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.FormExtTab;

/**
 * @Created：2018-08-28
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtTab参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="FormExtTabDTO")
public class FormExtTabDTO extends BaseDTO<FormExtTab> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long tabId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "表单类型ID")
    private Long formTypeId;

    @ApiModelProperty(value = "表单项组别：;与proc_setting.node_id关联;默认为0;为0时表示流程开始就必须填写;不为0时表示走到相应流程时填写")
    private Long nodeId;

    @ApiModelProperty(value = "唯一标识码")
    private String name;

    @ApiModelProperty(value = "流程表单类型")
    private String label;

    @ApiModelProperty(value = "排序序号")
    private Integer serialNumber;

    public Long getTabId() {
        return tabId;
    }

    public void setTabId(Long tabId) {
        this.tabId = tabId;
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

    public Long getFormTypeId() {
        return formTypeId;
    }

    public void setFormTypeId(Long formTypeId) {
        this.formTypeId = formTypeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

}
