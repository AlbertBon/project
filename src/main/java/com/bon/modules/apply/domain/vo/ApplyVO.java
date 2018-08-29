package com.bon.modules.apply.domain.vo;

import java.util.*;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: Apply视图类
 * @Email: 502285815@qq.com
*/
public class ApplyVO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long applyId;

    private Date gmtCreate;

    private Date gmtModified;

    private Long enterpriceId;

    private Long productId;

    private Long chanceId;

    private Long nodeId;

    private Long customerId;

    private String status;

    private BigDecimal amount;

    private Integer duration;

    private Integer ourBenefit;

    private Integer intermeBenefit;

    private Integer spread;

    private Integer guarantee;

    private String guarantorIds;

    private String guaranteeRepayWay;

    private String repayType;

    private Integer repayDay;

    private String repayWay;

    private String repayMethod;

    private Byte feePayer;

    private Byte autoRepay;

    private Byte advRepay;

    private Integer advPunish;

    private Integer advDiscount;

    private String rateType;

    private Integer rate;

    private Integer monRate;

    private Integer dailyRate;

    private Byte avoidDays;

    private Integer penalty;

    private String penaltyBase;

    private Integer penaltyDiscount;

    private Integer creator;

    private Integer saler;

    private Date approveTime;

    private Date contractTime;

    private Date loanTime;

    private Integer loaner;

    private String loanNo;

    private BigDecimal loanAmount;

    private Date finishTime;

    private Integer finisher;

    private BigDecimal principal;

    private BigDecimal penaltyAmt;

    private BigDecimal rateAmt;

    private Byte emailed;

    private Byte smsed;

    private Long creditId;

    private Long creditBalance;

    private Long creditUsedId;

    private String tel;

    private String account;

    private String accountName;

    private String agencyNo;

    private String bankNo;

    private String bankId;

    private String contacts;

    private Long agencyId;

    private String loanPurpose;

    private BigDecimal expectMonthRepay;

    private String mortgageRegister;

    private Date mortgageRegisterTime;

    private BigDecimal chargeFee;

    private String chargeFeeType;

    private String stampType;

    private String stampUser;

    private Date stampTime;

    private String stampStaff;

    private String serviceSourceOne;

    private String serviceSourceTwo;

    private String guaranteeCode;

    private String applyOpinion;

    private String signOperator;

    private Date signTime;

    private String signRemark;

    private String debtRemark;

    private String accountRemark;

    private BigDecimal creditMoney;

    private Integer creditDuration;

    private String applySuggestion;

    private String visitTee;

    private String websiteRemark;

    private String extRemark;

    private Integer penaltyFeeRate;

    private String counterOption;

    private String dalers;

    private BigDecimal beforeAmount;

    private Long updateOperator;

    private String updateReason;

    private Date updateTime;

    private String productRemark;

    private Integer loanDuration;

    private String joinBank;

    private BigDecimal surveyMoney;

    private String chargeFeeTypeRemark;

    private Long controller;

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
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

    public Long getEnterpriceId() {
        return enterpriceId;
    }

    public void setEnterpriceId(Long enterpriceId) {
        this.enterpriceId = enterpriceId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getChanceId() {
        return chanceId;
    }

    public void setChanceId(Long chanceId) {
        this.chanceId = chanceId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getOurBenefit() {
        return ourBenefit;
    }

    public void setOurBenefit(Integer ourBenefit) {
        this.ourBenefit = ourBenefit;
    }

    public Integer getIntermeBenefit() {
        return intermeBenefit;
    }

    public void setIntermeBenefit(Integer intermeBenefit) {
        this.intermeBenefit = intermeBenefit;
    }

    public Integer getSpread() {
        return spread;
    }

    public void setSpread(Integer spread) {
        this.spread = spread;
    }

    public Integer getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Integer guarantee) {
        this.guarantee = guarantee;
    }

    public String getGuarantorIds() {
        return guarantorIds;
    }

    public void setGuarantorIds(String guarantorIds) {
        this.guarantorIds = guarantorIds;
    }

    public String getGuaranteeRepayWay() {
        return guaranteeRepayWay;
    }

    public void setGuaranteeRepayWay(String guaranteeRepayWay) {
        this.guaranteeRepayWay = guaranteeRepayWay;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public Integer getRepayDay() {
        return repayDay;
    }

    public void setRepayDay(Integer repayDay) {
        this.repayDay = repayDay;
    }

    public String getRepayWay() {
        return repayWay;
    }

    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay;
    }

    public String getRepayMethod() {
        return repayMethod;
    }

    public void setRepayMethod(String repayMethod) {
        this.repayMethod = repayMethod;
    }

    public Byte getFeePayer() {
        return feePayer;
    }

    public void setFeePayer(Byte feePayer) {
        this.feePayer = feePayer;
    }

    public Byte getAutoRepay() {
        return autoRepay;
    }

    public void setAutoRepay(Byte autoRepay) {
        this.autoRepay = autoRepay;
    }

    public Byte getAdvRepay() {
        return advRepay;
    }

    public void setAdvRepay(Byte advRepay) {
        this.advRepay = advRepay;
    }

    public Integer getAdvPunish() {
        return advPunish;
    }

    public void setAdvPunish(Integer advPunish) {
        this.advPunish = advPunish;
    }

    public Integer getAdvDiscount() {
        return advDiscount;
    }

    public void setAdvDiscount(Integer advDiscount) {
        this.advDiscount = advDiscount;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getMonRate() {
        return monRate;
    }

    public void setMonRate(Integer monRate) {
        this.monRate = monRate;
    }

    public Integer getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Integer dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Byte getAvoidDays() {
        return avoidDays;
    }

    public void setAvoidDays(Byte avoidDays) {
        this.avoidDays = avoidDays;
    }

    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    public String getPenaltyBase() {
        return penaltyBase;
    }

    public void setPenaltyBase(String penaltyBase) {
        this.penaltyBase = penaltyBase;
    }

    public Integer getPenaltyDiscount() {
        return penaltyDiscount;
    }

    public void setPenaltyDiscount(Integer penaltyDiscount) {
        this.penaltyDiscount = penaltyDiscount;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getSaler() {
        return saler;
    }

    public void setSaler(Integer saler) {
        this.saler = saler;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    public Date getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    public Integer getLoaner() {
        return loaner;
    }

    public void setLoaner(Integer loaner) {
        this.loaner = loaner;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getFinisher() {
        return finisher;
    }

    public void setFinisher(Integer finisher) {
        this.finisher = finisher;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getPenaltyAmt() {
        return penaltyAmt;
    }

    public void setPenaltyAmt(BigDecimal penaltyAmt) {
        this.penaltyAmt = penaltyAmt;
    }

    public BigDecimal getRateAmt() {
        return rateAmt;
    }

    public void setRateAmt(BigDecimal rateAmt) {
        this.rateAmt = rateAmt;
    }

    public Byte getEmailed() {
        return emailed;
    }

    public void setEmailed(Byte emailed) {
        this.emailed = emailed;
    }

    public Byte getSmsed() {
        return smsed;
    }

    public void setSmsed(Byte smsed) {
        this.smsed = smsed;
    }

    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public Long getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(Long creditBalance) {
        this.creditBalance = creditBalance;
    }

    public Long getCreditUsedId() {
        return creditUsedId;
    }

    public void setCreditUsedId(Long creditUsedId) {
        this.creditUsedId = creditUsedId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public BigDecimal getExpectMonthRepay() {
        return expectMonthRepay;
    }

    public void setExpectMonthRepay(BigDecimal expectMonthRepay) {
        this.expectMonthRepay = expectMonthRepay;
    }

    public String getMortgageRegister() {
        return mortgageRegister;
    }

    public void setMortgageRegister(String mortgageRegister) {
        this.mortgageRegister = mortgageRegister;
    }

    public Date getMortgageRegisterTime() {
        return mortgageRegisterTime;
    }

    public void setMortgageRegisterTime(Date mortgageRegisterTime) {
        this.mortgageRegisterTime = mortgageRegisterTime;
    }

    public BigDecimal getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(BigDecimal chargeFee) {
        this.chargeFee = chargeFee;
    }

    public String getChargeFeeType() {
        return chargeFeeType;
    }

    public void setChargeFeeType(String chargeFeeType) {
        this.chargeFeeType = chargeFeeType;
    }

    public String getStampType() {
        return stampType;
    }

    public void setStampType(String stampType) {
        this.stampType = stampType;
    }

    public String getStampUser() {
        return stampUser;
    }

    public void setStampUser(String stampUser) {
        this.stampUser = stampUser;
    }

    public Date getStampTime() {
        return stampTime;
    }

    public void setStampTime(Date stampTime) {
        this.stampTime = stampTime;
    }

    public String getStampStaff() {
        return stampStaff;
    }

    public void setStampStaff(String stampStaff) {
        this.stampStaff = stampStaff;
    }

    public String getServiceSourceOne() {
        return serviceSourceOne;
    }

    public void setServiceSourceOne(String serviceSourceOne) {
        this.serviceSourceOne = serviceSourceOne;
    }

    public String getServiceSourceTwo() {
        return serviceSourceTwo;
    }

    public void setServiceSourceTwo(String serviceSourceTwo) {
        this.serviceSourceTwo = serviceSourceTwo;
    }

    public String getGuaranteeCode() {
        return guaranteeCode;
    }

    public void setGuaranteeCode(String guaranteeCode) {
        this.guaranteeCode = guaranteeCode;
    }

    public String getApplyOpinion() {
        return applyOpinion;
    }

    public void setApplyOpinion(String applyOpinion) {
        this.applyOpinion = applyOpinion;
    }

    public String getSignOperator() {
        return signOperator;
    }

    public void setSignOperator(String signOperator) {
        this.signOperator = signOperator;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignRemark() {
        return signRemark;
    }

    public void setSignRemark(String signRemark) {
        this.signRemark = signRemark;
    }

    public String getDebtRemark() {
        return debtRemark;
    }

    public void setDebtRemark(String debtRemark) {
        this.debtRemark = debtRemark;
    }

    public String getAccountRemark() {
        return accountRemark;
    }

    public void setAccountRemark(String accountRemark) {
        this.accountRemark = accountRemark;
    }

    public BigDecimal getCreditMoney() {
        return creditMoney;
    }

    public void setCreditMoney(BigDecimal creditMoney) {
        this.creditMoney = creditMoney;
    }

    public Integer getCreditDuration() {
        return creditDuration;
    }

    public void setCreditDuration(Integer creditDuration) {
        this.creditDuration = creditDuration;
    }

    public String getApplySuggestion() {
        return applySuggestion;
    }

    public void setApplySuggestion(String applySuggestion) {
        this.applySuggestion = applySuggestion;
    }

    public String getVisitTee() {
        return visitTee;
    }

    public void setVisitTee(String visitTee) {
        this.visitTee = visitTee;
    }

    public String getWebsiteRemark() {
        return websiteRemark;
    }

    public void setWebsiteRemark(String websiteRemark) {
        this.websiteRemark = websiteRemark;
    }

    public String getExtRemark() {
        return extRemark;
    }

    public void setExtRemark(String extRemark) {
        this.extRemark = extRemark;
    }

    public Integer getPenaltyFeeRate() {
        return penaltyFeeRate;
    }

    public void setPenaltyFeeRate(Integer penaltyFeeRate) {
        this.penaltyFeeRate = penaltyFeeRate;
    }

    public String getCounterOption() {
        return counterOption;
    }

    public void setCounterOption(String counterOption) {
        this.counterOption = counterOption;
    }

    public String getDalers() {
        return dalers;
    }

    public void setDalers(String dalers) {
        this.dalers = dalers;
    }

    public BigDecimal getBeforeAmount() {
        return beforeAmount;
    }

    public void setBeforeAmount(BigDecimal beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public Long getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(Long updateOperator) {
        this.updateOperator = updateOperator;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProductRemark() {
        return productRemark;
    }

    public void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }

    public Integer getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Integer loanDuration) {
        this.loanDuration = loanDuration;
    }

    public String getJoinBank() {
        return joinBank;
    }

    public void setJoinBank(String joinBank) {
        this.joinBank = joinBank;
    }

    public BigDecimal getSurveyMoney() {
        return surveyMoney;
    }

    public void setSurveyMoney(BigDecimal surveyMoney) {
        this.surveyMoney = surveyMoney;
    }

    public String getChargeFeeTypeRemark() {
        return chargeFeeTypeRemark;
    }

    public void setChargeFeeTypeRemark(String chargeFeeTypeRemark) {
        this.chargeFeeTypeRemark = chargeFeeTypeRemark;
    }

    public Long getController() {
        return controller;
    }

    public void setController(Long controller) {
        this.controller = controller;
    }

}
