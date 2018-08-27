package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.Form;

/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: Form参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="FormDTO")
public class FormDTO extends BaseDTO<Form> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long formId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "表单类型ID：与form_type.form_type_id关联")
    private Integer formTypeId;

    @ApiModelProperty(value = "当前所处节点ID")
    private Integer curNodeId;

    @ApiModelProperty(value = "实例名称")
    private String name;

    @ApiModelProperty(value = "建立时间")
    private Date createTime;

    @ApiModelProperty(value = "建立人")
    private Integer creatorId;

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
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

    public Integer getCurNodeId() {
        return curNodeId;
    }

    public void setCurNodeId(Integer curNodeId) {
        this.curNodeId = curNodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

}
