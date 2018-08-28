package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-28
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcSetting视图类
 * @Email: 502285815@qq.com
*/
public class ProcSettingVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long nodeId;

    private Date gmtCreate;

    private Date gmtModified;

    private Long formTypeId;

    private Long departmentId;

    private String nodeName;

    private Integer nodeLeft;

    private Integer nodeTop;

    private Integer nodeWidth;

    private Integer nodeHeight;

    private String dealerPos;

    private String dealer;

    private Float dealerBenefit;

    private Byte benefitBase;

    private Integer expireTime;

    private String dealType;

    private Byte threshold;

    private Byte singleReject;

    private String nodeType;

    private Byte autoDesition;

    private String dealResult;

    private String dealIntro;

    private String actionMethod;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
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

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Integer nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Integer getNodeTop() {
        return nodeTop;
    }

    public void setNodeTop(Integer nodeTop) {
        this.nodeTop = nodeTop;
    }

    public Integer getNodeWidth() {
        return nodeWidth;
    }

    public void setNodeWidth(Integer nodeWidth) {
        this.nodeWidth = nodeWidth;
    }

    public Integer getNodeHeight() {
        return nodeHeight;
    }

    public void setNodeHeight(Integer nodeHeight) {
        this.nodeHeight = nodeHeight;
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
