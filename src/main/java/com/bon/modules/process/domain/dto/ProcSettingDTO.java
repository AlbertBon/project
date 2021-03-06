package com.bon.modules.process.domain.dto;

import java.util.*;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.process.domain.entity.ProcSetting;

/**
 * @Created：2018-08-24
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcSetting参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="ProcSettingDTO")
public class ProcSettingDTO extends BaseDTO<ProcSetting> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long nodeId;

    @ApiModelProperty(value = "关联customer表主键")
    private Integer objectId;

    @ApiModelProperty(value = "表单类型ID")
    private Integer formTypeId;

    @ApiModelProperty(value = "主管部门")
    private Integer departmentId;

    @ApiModelProperty(value = "节点名称")
    private String nodeName;

    @ApiModelProperty(value = "左边距离")
    private Integer left;

    @ApiModelProperty(value = "顶部距离")
    private Integer top;

    @ApiModelProperty(value = "宽度")
    private Integer width;

    @ApiModelProperty(value = "高度")
    private Integer height;

    @ApiModelProperty(value = "可处理职位IDS:可处理该流程的职位;关联position.position_id;dealer_pos和dealer必填一项")
    private String dealerPos;

    @ApiModelProperty(value = "可处理员工IDS:关联staff.staff_id 多个员工使用逗号分开")
    private String dealer;

    @ApiModelProperty(value = "处理人提成")
    private Float dealerBenefit;

    @ApiModelProperty(value = "提成计算基数:0：按照放款金额提成;1：按照公司收益提成;2：按固定金额提成")
    private Byte benefitBase;

    @ApiModelProperty(value = "超时时间:单位为分钟；0为不做限制")
    private Integer expireTime;

    @ApiModelProperty(value = "处理类型：00：符合条件的任意一人处理即可;01：超过百分比的人数选择通过")
    private String dealType;

    @ApiModelProperty(value = "百分比阈值")
    private Byte threshold;

    @ApiModelProperty(value = "允许一票否决：0：否；1：是")
    private Byte singleReject;

    @ApiModelProperty(value = "节点类型：00：自动节点;01：人工节点;02：状态节点;04：决策节点;99：结束节点;98：开始节点")
    private String nodeType;

    @ApiModelProperty(value = "是否自动决策：0：非决策节点时的默认值;1：手动决策;2：自动决策")
    private Byte autoDesition;

    @ApiModelProperty(value = "处理结果：00：未处理;01：通过;02：拒绝;03：驳回")
    private String dealResult;

    @ApiModelProperty(value = "处理说明")
    private String dealIntro;

    @ApiModelProperty(value = "处理方法")
    private String actionMethod;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getFormTypeId() {
        return formTypeId;
    }

    public void setFormTypeId(Integer formTypeId) {
        this.formTypeId = formTypeId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getDealerPos() {
        return dealerPos;
    }

    public void setDealerPos(String dealerPos) {
        this.dealerPos = dealerPos;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public Float getDealerBenefit() {
        return dealerBenefit;
    }

    public void setDealerBenefit(Float dealerBenefit) {
        this.dealerBenefit = dealerBenefit;
    }

    public Byte getBenefitBase() {
        return benefitBase;
    }

    public void setBenefitBase(Byte benefitBase) {
        this.benefitBase = benefitBase;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Byte getThreshold() {
        return threshold;
    }

    public void setThreshold(Byte threshold) {
        this.threshold = threshold;
    }

    public Byte getSingleReject() {
        return singleReject;
    }

    public void setSingleReject(Byte singleReject) {
        this.singleReject = singleReject;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Byte getAutoDesition() {
        return autoDesition;
    }

    public void setAutoDesition(Byte autoDesition) {
        this.autoDesition = autoDesition;
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    public String getDealIntro() {
        return dealIntro;
    }

    public void setDealIntro(String dealIntro) {
        this.dealIntro = dealIntro;
    }

    public String getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod;
    }

}
