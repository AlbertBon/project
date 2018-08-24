package com.bon.modules.process.domain.vo;

import java.util.*;
import java.io.Serializable;

/**
 * @Created：2018-08-24
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcSetting视图类
 * @Email: 502285815@qq.com
*/
public class ProcSettingVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long nodeId;

    private Integer objectId;

    private Integer formTypeId;

    private Integer departmentId;

    private String nodeName;

    private Integer left;

    private Integer top;

    private Integer width;

    private Integer height;

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
