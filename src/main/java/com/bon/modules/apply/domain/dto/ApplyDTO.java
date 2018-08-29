package com.bon.modules.apply.domain.dto;

import java.util.*;
import java.math.BigDecimal;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.bon.common.domain.dto.BaseDTO;
import com.bon.modules.apply.domain.entity.Apply;

/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: Apply参数类
 * @Email: 502285815@qq.com
*/
@ApiModel(value ="ApplyDTO")
public class ApplyDTO extends BaseDTO<Apply> implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long applyId;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "最后一次更新时间")
    private Date gmtModified;

    @ApiModelProperty(value = "使用公司ID")
    private Long enterpriceId;

    @ApiModelProperty(value = "产品ID (与product.product_id关联)")
    private Long productId;

    @ApiModelProperty(value = "商机ID (与chance.chance_id关联)")
    private Long chanceId;

    @ApiModelProperty(value = "当前所处节点 (与proc_setting.node_id关联)")
    private Long nodeId;

    @ApiModelProperty(value = "申请人ID (与customer.customer_id关联)")
    private Long customerId;

    @ApiModelProperty(value = "当前状态 (00：申请流程中;01：等待放款;02：放款中;03：已放款;04：放款失败;05：还款中;06：已还清款项并结单;90：已提交坏账认定申请;12：已用印；99：确认坏账，并结单;97：已出售坏账)")
    private String status;

    @ApiModelProperty(value = "申请贷款数额 (单位为分)")
    private BigDecimal amount;

    @ApiModelProperty(value = "久期 (单位为月)")
    private Integer duration;

    @ApiModelProperty(value = "我司代理商分润（手续费）")
    private Integer ourBenefit;

    @ApiModelProperty(value = "中介手续费")
    private Integer intermeBenefit;

    @ApiModelProperty(value = "利差")
    private Integer spread;

    @ApiModelProperty(value = "担保费")
    private Integer guarantee;

    @ApiModelProperty(value = "担保人ID，多个用逗号隔开")
    private String guarantorIds;

    @ApiModelProperty(value = "担保费计算方式 (00：先息后本;01：等额本息;02：斩头;03：等额本金)")
    private String guaranteeRepayWay;

    @ApiModelProperty(value = "还款日期类型（00：每月固定日期 01：相隔日数）")
    private String repayType;

    @ApiModelProperty(value = "还款天数（如果repay_type为00，则范围在1～31，如果是01，则范围在1～30）")
    private Integer repayDay;

    @ApiModelProperty(value = "还款方式 (00：先息后本;01：等额本息;02：斩头;03：等额本金)")
    private String repayWay;

    @ApiModelProperty(value = "还款途径 (00：线下还款;01：代收付自动扣取)")
    private String repayMethod;

    @ApiModelProperty(value = "还款手续费承担方 (0：客户方;1：贷款方)")
    private Byte feePayer;

    @ApiModelProperty(value = "是否支持自动扣款还款 (0：不支持;1：支持)")
    private Byte autoRepay;

    @ApiModelProperty(value = "是否允许提前还贷 (00：不允许;01：允许)")
    private Byte advRepay;

    @ApiModelProperty(value = "提前还贷罚息 (实际利息的100000倍;8%记做8000;0.578%记做578)")
    private Integer advPunish;

    @ApiModelProperty(value = "提前还贷折扣")
    private Integer advDiscount;

    @ApiModelProperty(value = "利率计算方式 (00：按年计息;01：按月计息;02：按日计息)")
    private String rateType;

    @ApiModelProperty(value = "年化利率 (实际利息的100000倍;8%记做8000;0.578%记做578)")
    private Integer rate;

    @ApiModelProperty(value = "月利率 (实际利息的100000倍;8%记做8000;0.578%记做578)")
    private Integer monRate;

    @ApiModelProperty(value = "日息 (实际利息的100000倍;8%记做8000;0.578%记做578)")
    private Integer dailyRate;

    @ApiModelProperty(value = "免罚期限 (单位为天;默认为0)")
    private Byte avoidDays;

    @ApiModelProperty(value = "罚息 (实际利息的100000倍;8%记做8000;0.578%记做578;罚息按日计算)")
    private Integer penalty;

    @ApiModelProperty(value = "罚息计算基础 (00：当期应还款;01：当期本金;02：剩余本金)")
    private String penaltyBase;

    @ApiModelProperty(value = "罚息折扣")
    private Integer penaltyDiscount;

    @ApiModelProperty(value = "建立人 (与staff.staff_id关联)")
    private Integer creator;

    @ApiModelProperty(value = "业务员 (与staff.staff_id关联)")
    private Integer saler;

    @ApiModelProperty(value = "审批流程完成时间")
    private Date approveTime;

    @ApiModelProperty(value = "贷款合同签订时间")
    private Date contractTime;

    @ApiModelProperty(value = "放款时间 (指放款操作时间)")
    private Date loanTime;

    @ApiModelProperty(value = "放款人 (与staff.staff_id关联)")
    private Integer loaner;

    @ApiModelProperty(value = "贷款编号")
    private String loanNo;

    @ApiModelProperty(value = "放款金额")
    private BigDecimal loanAmount;

    @ApiModelProperty(value = "结单时间 (确认还清款项或者确认坏账，列入坏账资产)")
    private Date finishTime;

    @ApiModelProperty(value = "结单人 (与staff.staff_id关联)")
    private Integer finisher;

    @ApiModelProperty(value = "列入坏账时剩余本金总额 (单位：分)")
    private BigDecimal principal;

    @ApiModelProperty(value = "列入坏账时应付罚息总额 (单位：分)")
    private BigDecimal penaltyAmt;

    @ApiModelProperty(value = "列入坏账时应付利息总额 (单位：分)")
    private BigDecimal rateAmt;

    @ApiModelProperty(value = "邮件通知 (放款邮件通知;0：未发送;1：已发送)")
    private Byte emailed;

    @ApiModelProperty(value = "短信通知 (放款邮件通知;0：未发送;1：已发送)")
    private Byte smsed;

    @ApiModelProperty(value = "授信合同")
    private Long creditId;

    @ApiModelProperty(value = "授信余额")
    private Long creditBalance;

    @ApiModelProperty(value = "授信使用流水")
    private Long creditUsedId;

    @ApiModelProperty(value = "联系电话")
    private String tel;

    @ApiModelProperty(value = "还款账号")
    private String account;

    @ApiModelProperty(value = "还款户名")
    private String accountName;

    @ApiModelProperty(value = "支行行号")
    private String agencyNo;

    @ApiModelProperty(value = "清算行行号")
    private String bankNo;

    @ApiModelProperty(value = "银行ID")
    private String bankId;

    @ApiModelProperty(value = "联系人ID")
    private String contacts;

    @ApiModelProperty(value = "所属代理商ID")
    private Long agencyId;

    @ApiModelProperty(value = "详细贷款用途")
    private String loanPurpose;

    @ApiModelProperty(value = "期望月还款额")
    private BigDecimal expectMonthRepay;

    @ApiModelProperty(value = "登记执行人")
    private String mortgageRegister;

    @ApiModelProperty(value = "登记时间")
    private Date mortgageRegisterTime;

    @ApiModelProperty(value = "收取手续费(单位：分)")
    private BigDecimal chargeFee;

    @ApiModelProperty(value = "收取手续费方式(00 现金 ;01 代扣 ;02 转账 ;03 刷卡 ;04 其他方式)")
    private String chargeFeeType;

    @ApiModelProperty(value = "用章类型(00:公章；01：合同章；02：财务章)")
    private String stampType;

    @ApiModelProperty(value = "用印人")
    private String stampUser;

    @ApiModelProperty(value = "用印时间")
    private Date stampTime;

    @ApiModelProperty(value = "审核人")
    private String stampStaff;

    @ApiModelProperty(value = "业务来源1")
    private String serviceSourceOne;

    @ApiModelProperty(value = "业务来源2")
    private String serviceSourceTwo;

    @ApiModelProperty(value = "最高额保证反担保合同")
    private String guaranteeCode;

    @ApiModelProperty(value = "申请意见")
    private String applyOpinion;

    @ApiModelProperty(value = "签约操作人")
    private String signOperator;

    @ApiModelProperty(value = "签约时间")
    private Date signTime;

    @ApiModelProperty(value = "签约备注")
    private String signRemark;

    @ApiModelProperty(value = "负责总备注")
    private String debtRemark;

    @ApiModelProperty(value = "帐户汇总总备注")
    private String accountRemark;

    @ApiModelProperty(value = "授信额度")
    private BigDecimal creditMoney;

    @ApiModelProperty(value = "授信期限")
    private Integer creditDuration;

    @ApiModelProperty(value = "风控审批结果")
    private String applySuggestion;

    @ApiModelProperty(value = "调查费")
    private String visitTee;

    @ApiModelProperty(value = "第三方查询备注")
    private String websiteRemark;

    @ApiModelProperty(value = "拓展备注")
    private String extRemark;

    @ApiModelProperty(value = "违约金")
    private Integer penaltyFeeRate;

    @ApiModelProperty(value = "反担保措施")
    private String counterOption;

    @ApiModelProperty(value = "处理人ID历史")
    private String dalers;

    @ApiModelProperty(value = "修改前金额")
    private BigDecimal beforeAmount;

    @ApiModelProperty(value = "修改人")
    private Long updateOperator;

    @ApiModelProperty(value = "修改原因")
    private String updateReason;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "申请页面的备注")
    private String productRemark;

    @ApiModelProperty(value = "放款期限")
    private Integer loanDuration;

    @ApiModelProperty(value = "合作银行")
    private String joinBank;

    @ApiModelProperty(value = "手续费金额（优抵贷有用到）")
    private BigDecimal surveyMoney;

    @ApiModelProperty(value = "收取费用备注")
    private String chargeFeeTypeRemark;

    @ApiModelProperty(value = "风控专员StaffId")
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
