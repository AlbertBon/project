package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExt视图类
 * @Email: 502285815@qq.com
*/
public class FormExtVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long formExtId;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer formId;

    private Integer optionId;

    private Integer optGroup;

    private String optType;

    private String label;

    private String optName;

    private String optValue;

    public Long getFormExtId() {
        return formExtId;
    }

    public void setFormExtId(Long formExtId) {
        this.formExtId = formExtId;
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

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getOptGroup() {
        return optGroup;
    }

    public void setOptGroup(Integer optGroup) {
        this.optGroup = optGroup;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
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

    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue;
    }

}
