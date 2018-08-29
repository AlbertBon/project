package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtSetting视图类
 * @Email: 502285815@qq.com
*/
public class FormExtSettingVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long optionId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer formTypeId;

    private Long nodeId;

    private String itemType;

    private Long extGroupId;

    private String label;

    private String optName;

    private String optType;

    private Byte size;

    private String selectType;

    private String optOption;

    private String optFlag;

    private Integer serialNumber;

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
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

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Long getExtGroupId() {
        return extGroupId;
    }

    public void setExtGroupId(Long extGroupId) {
        this.extGroupId = extGroupId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }

    public Byte getSize() {
        return size;
    }

    public void setSize(Byte size) {
        this.size = size;
    }

    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public String getOptOption() {
        return optOption;
    }

    public void setOptOption(String optOption) {
        this.optOption = optOption;
    }

    public String getOptFlag() {
        return optFlag;
    }

    public void setOptFlag(String optFlag) {
        this.optFlag = optFlag;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

}
