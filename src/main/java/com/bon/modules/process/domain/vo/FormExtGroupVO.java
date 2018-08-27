package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtGroup视图类
 * @Email: 502285815@qq.com
*/
public class FormExtGroupVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long extGroupId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer formTypeId;

    private Integer tabId;

    private Integer nodeId;

    private String name;

    private String label;

    private Integer serialNumber;

    public Long getExtGroupId() {
        return extGroupId;
    }

    public void setExtGroupId(Long extGroupId) {
        this.extGroupId = extGroupId;
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

    public Integer getTabId() {
        return tabId;
    }

    public void setTabId(Integer tabId) {
        this.tabId = tabId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
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
