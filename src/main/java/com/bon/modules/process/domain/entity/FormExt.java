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
 * @Created：2018-08-28
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExt参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="FormExt",description = "扩展值字段")
public class FormExt implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value = "ID")
    private Long formExtId;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    @ApiModelProperty(value = "表单实例ID:关联form.form_id")
    private Long formId;

    @ApiModelProperty(value = "扩展表单项ID：关联form_ext_setting.option_id")
    private Long optionId;

    @ApiModelProperty(value = "表单项组别")
    private Long optGroup;

    @ApiModelProperty(value = "表单类型:00：短文本;01：长文本;02：下拉选项;03：多选项;04：单选项")
    private String optType;

    @ApiModelProperty(value = "表单项名称")
    private String label;

    @ApiModelProperty(value = "表单项唯一标示")
    private String optName;

    @ApiModelProperty(value = "表单值")
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

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getOptGroup() {
        return optGroup;
    }

    public void setOptGroup(Long optGroup) {
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
