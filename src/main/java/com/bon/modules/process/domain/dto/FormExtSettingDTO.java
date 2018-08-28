package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.FormExtSetting;

/**
 * @Created：2018-08-28
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtSetting参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="FormExtSettingDTO")
public class FormExtSettingDTO extends BaseDTO<FormExtSetting> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long optionId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "表单类型ID：与form_type.form_type_id关联")
    private Integer formTypeId;

    @ApiModelProperty(value = "表单项组别：与proc_setting.node_id关联;默认为0;为0时表示流程开始就必须填写;不为0时表示走到相应流程时填写")
    private Long nodeId;

    @ApiModelProperty(value = "表单类型：origin：原生；extend：扩展")
    private String itemType;

    @ApiModelProperty(value = "表单组类别：与form_ext_group.ext_group_id关联")
    private Long extGroupId;

    @ApiModelProperty(value = "表单项名称")
    private String label;

    @ApiModelProperty(value = "表单项唯一标示")
    private String optName;

    @ApiModelProperty(value = "表单类型")
    private String optType;

    @ApiModelProperty(value = "输入框大小")
    private Byte size;

    @ApiModelProperty(value = "多项选择类型")
    private String selectType;

    @ApiModelProperty(value = "可选选项值：下拉、多选、单选时的可选值;建议存储为JSON字符串;[opt1,opt2]的格式")
    private String optOption;

    @ApiModelProperty(value = "标识：类似相关的标识，;用于表单验证和后续处理;eml：EMAIL;tel：电话;mob: 手机号;idc：身份证号;cno：银行卡号;nam：姓名;…")
    private String optFlag;

    @ApiModelProperty(value = "排序序号")
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
