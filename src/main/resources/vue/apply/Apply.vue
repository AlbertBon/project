<template>
  <div class="app-container calendar-list-container">
<!--新增修改弹出框部分-->
    <div class="filter-container">
      <el-input style="width: 200px;" v-model="listParams.keyMap.equal_applyId" class="filter-item" placeholder="序号">
      </el-input>
      <el-date-picker style="width: 200px;" v-model="listParams.keyMap.greater_gmtCreate" type="datetime"
                      class="filter-item" placeholder="起始时间" value-format="yyyy-MM-dd HH:mm:ss">
      </el-date-picker>  -
      <el-date-picker style="width: 200px;" v-model="listParams.keyMap.less_gmtCreate" type="datetime"
                      class="filter-item" placeholder="结束时间" value-format="yyyy-MM-dd HH:mm:ss">
      </el-date-picker>
      <el-button class="filter-item" @click="getList" style="margin-left: 10px;" type="primary" icon="el-icon-search">
        搜索
      </el-button>
      <el-button @click="handleCreate" class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit">
        新增
      </el-button>
    </div>


<!--新增修改弹出框部分-->
    <el-table :data="pageInfo.list" v-loading="listLoading" element-loading-text="给我一点时间" border fit
              highlight-current-row
              style="width: 100%">
      <el-table-column type="index" align="center" label="序号" width="65">
      </el-table-column>
      <el-table-column width="160px" align="center" label="GmtCreate">
        <template slot-scope="scope">
          <span>{{scope.row.gmtCreate | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="EnterpriceId">
        <template slot-scope="scope">
          <span>{{scope.row.enterpriceId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ProductId">
        <template slot-scope="scope">
          <span>{{scope.row.productId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ChanceId">
        <template slot-scope="scope">
          <span>{{scope.row.chanceId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="NodeId">
        <template slot-scope="scope">
          <span>{{scope.row.nodeId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CustomerId">
        <template slot-scope="scope">
          <span>{{scope.row.customerId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Status">
        <template slot-scope="scope">
          <span>{{scope.row.status}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Amount">
        <template slot-scope="scope">
          <span>{{scope.row.amount}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Duration">
        <template slot-scope="scope">
          <span>{{scope.row.duration}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="OurBenefit">
        <template slot-scope="scope">
          <span>{{scope.row.ourBenefit}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="IntermeBenefit">
        <template slot-scope="scope">
          <span>{{scope.row.intermeBenefit}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Spread">
        <template slot-scope="scope">
          <span>{{scope.row.spread}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Guarantee">
        <template slot-scope="scope">
          <span>{{scope.row.guarantee}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="GuarantorIds">
        <template slot-scope="scope">
          <span>{{scope.row.guarantorIds}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="GuaranteeRepayWay">
        <template slot-scope="scope">
          <span>{{scope.row.guaranteeRepayWay}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="RepayType">
        <template slot-scope="scope">
          <span>{{scope.row.repayType}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="RepayDay">
        <template slot-scope="scope">
          <span>{{scope.row.repayDay}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="RepayWay">
        <template slot-scope="scope">
          <span>{{scope.row.repayWay}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="RepayMethod">
        <template slot-scope="scope">
          <span>{{scope.row.repayMethod}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="FeePayer">
        <template slot-scope="scope">
          <span>{{scope.row.feePayer}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AutoRepay">
        <template slot-scope="scope">
          <span>{{scope.row.autoRepay}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AdvRepay">
        <template slot-scope="scope">
          <span>{{scope.row.advRepay}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AdvPunish">
        <template slot-scope="scope">
          <span>{{scope.row.advPunish}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AdvDiscount">
        <template slot-scope="scope">
          <span>{{scope.row.advDiscount}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="RateType">
        <template slot-scope="scope">
          <span>{{scope.row.rateType}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Rate">
        <template slot-scope="scope">
          <span>{{scope.row.rate}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="MonRate">
        <template slot-scope="scope">
          <span>{{scope.row.monRate}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DailyRate">
        <template slot-scope="scope">
          <span>{{scope.row.dailyRate}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AvoidDays">
        <template slot-scope="scope">
          <span>{{scope.row.avoidDays}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Penalty">
        <template slot-scope="scope">
          <span>{{scope.row.penalty}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="PenaltyBase">
        <template slot-scope="scope">
          <span>{{scope.row.penaltyBase}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="PenaltyDiscount">
        <template slot-scope="scope">
          <span>{{scope.row.penaltyDiscount}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Creator">
        <template slot-scope="scope">
          <span>{{scope.row.creator}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Saler">
        <template slot-scope="scope">
          <span>{{scope.row.saler}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ApproveTime">
        <template slot-scope="scope">
          <span>{{scope.row.approveTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ContractTime">
        <template slot-scope="scope">
          <span>{{scope.row.contractTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="LoanTime">
        <template slot-scope="scope">
          <span>{{scope.row.loanTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Loaner">
        <template slot-scope="scope">
          <span>{{scope.row.loaner}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="LoanNo">
        <template slot-scope="scope">
          <span>{{scope.row.loanNo}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="LoanAmount">
        <template slot-scope="scope">
          <span>{{scope.row.loanAmount}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="FinishTime">
        <template slot-scope="scope">
          <span>{{scope.row.finishTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Finisher">
        <template slot-scope="scope">
          <span>{{scope.row.finisher}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Principal">
        <template slot-scope="scope">
          <span>{{scope.row.principal}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="PenaltyAmt">
        <template slot-scope="scope">
          <span>{{scope.row.penaltyAmt}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="RateAmt">
        <template slot-scope="scope">
          <span>{{scope.row.rateAmt}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Emailed">
        <template slot-scope="scope">
          <span>{{scope.row.emailed}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Smsed">
        <template slot-scope="scope">
          <span>{{scope.row.smsed}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CreditId">
        <template slot-scope="scope">
          <span>{{scope.row.creditId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CreditBalance">
        <template slot-scope="scope">
          <span>{{scope.row.creditBalance}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CreditUsedId">
        <template slot-scope="scope">
          <span>{{scope.row.creditUsedId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Tel">
        <template slot-scope="scope">
          <span>{{scope.row.tel}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Account">
        <template slot-scope="scope">
          <span>{{scope.row.account}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AccountName">
        <template slot-scope="scope">
          <span>{{scope.row.accountName}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AgencyNo">
        <template slot-scope="scope">
          <span>{{scope.row.agencyNo}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="BankNo">
        <template slot-scope="scope">
          <span>{{scope.row.bankNo}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="BankId">
        <template slot-scope="scope">
          <span>{{scope.row.bankId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Contacts">
        <template slot-scope="scope">
          <span>{{scope.row.contacts}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AgencyId">
        <template slot-scope="scope">
          <span>{{scope.row.agencyId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="LoanPurpose">
        <template slot-scope="scope">
          <span>{{scope.row.loanPurpose}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ExpectMonthRepay">
        <template slot-scope="scope">
          <span>{{scope.row.expectMonthRepay}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="MortgageRegister">
        <template slot-scope="scope">
          <span>{{scope.row.mortgageRegister}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="MortgageRegisterTime">
        <template slot-scope="scope">
          <span>{{scope.row.mortgageRegisterTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ChargeFee">
        <template slot-scope="scope">
          <span>{{scope.row.chargeFee}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ChargeFeeType">
        <template slot-scope="scope">
          <span>{{scope.row.chargeFeeType}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="StampType">
        <template slot-scope="scope">
          <span>{{scope.row.stampType}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="StampUser">
        <template slot-scope="scope">
          <span>{{scope.row.stampUser}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="StampTime">
        <template slot-scope="scope">
          <span>{{scope.row.stampTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="StampStaff">
        <template slot-scope="scope">
          <span>{{scope.row.stampStaff}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ServiceSourceOne">
        <template slot-scope="scope">
          <span>{{scope.row.serviceSourceOne}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ServiceSourceTwo">
        <template slot-scope="scope">
          <span>{{scope.row.serviceSourceTwo}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="GuaranteeCode">
        <template slot-scope="scope">
          <span>{{scope.row.guaranteeCode}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ApplyOpinion">
        <template slot-scope="scope">
          <span>{{scope.row.applyOpinion}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="SignOperator">
        <template slot-scope="scope">
          <span>{{scope.row.signOperator}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="SignTime">
        <template slot-scope="scope">
          <span>{{scope.row.signTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="SignRemark">
        <template slot-scope="scope">
          <span>{{scope.row.signRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DebtRemark">
        <template slot-scope="scope">
          <span>{{scope.row.debtRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AccountRemark">
        <template slot-scope="scope">
          <span>{{scope.row.accountRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CreditMoney">
        <template slot-scope="scope">
          <span>{{scope.row.creditMoney}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CreditDuration">
        <template slot-scope="scope">
          <span>{{scope.row.creditDuration}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ApplySuggestion">
        <template slot-scope="scope">
          <span>{{scope.row.applySuggestion}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="VisitTee">
        <template slot-scope="scope">
          <span>{{scope.row.visitTee}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="WebsiteRemark">
        <template slot-scope="scope">
          <span>{{scope.row.websiteRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ExtRemark">
        <template slot-scope="scope">
          <span>{{scope.row.extRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="PenaltyFeeRate">
        <template slot-scope="scope">
          <span>{{scope.row.penaltyFeeRate}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CounterOption">
        <template slot-scope="scope">
          <span>{{scope.row.counterOption}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Dalers">
        <template slot-scope="scope">
          <span>{{scope.row.dalers}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="BeforeAmount">
        <template slot-scope="scope">
          <span>{{scope.row.beforeAmount}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="UpdateOperator">
        <template slot-scope="scope">
          <span>{{scope.row.updateOperator}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="UpdateReason">
        <template slot-scope="scope">
          <span>{{scope.row.updateReason}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="UpdateTime">
        <template slot-scope="scope">
          <span>{{scope.row.updateTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}')}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ProductRemark">
        <template slot-scope="scope">
          <span>{{scope.row.productRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="LoanDuration">
        <template slot-scope="scope">
          <span>{{scope.row.loanDuration}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="JoinBank">
        <template slot-scope="scope">
          <span>{{scope.row.joinBank}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="SurveyMoney">
        <template slot-scope="scope">
          <span>{{scope.row.surveyMoney}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ChargeFeeTypeRemark">
        <template slot-scope="scope">
          <span>{{scope.row.chargeFeeTypeRemark}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Controller">
        <template slot-scope="scope">
          <span>{{scope.row.controller}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="操作" width="230" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button type="primary" size="mini" @click="handleUpdate(scope.row.applyId)">修改</el-button>
          <el-button type="danger" size="mini" @click="handleDel(scope.row.applyId)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>


<!--分页部分-->
    <pagination
      :pageSizes="pageSizes"
      :pageSize="listParams.pageSize"
      :pageCount="pageInfo.total"
      @handleSizeChange="handleSizeChange"
      @handleCurrentChange="handleCurrentChange"></pagination>


<!--新增修改弹出框部分-->
    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
      <el-form ref="applyForm" :rules="rules" :model="applyParams" label-position="left" label-width="100px"
               style='width: 400px; margin-left:50px;'>
        <el-form-item v-show="false" prop="applyId">
          <el-input v-model="applyParams.applyId"></el-input>
        </el-form-item>
        <el-form-item v-show="false" label="ApplyId" prop="applyId">
          <el-input v-model="applyParams.applyId"></el-input>
        </el-form-item>
        <el-form-item label="EnterpriceId" prop="enterpriceId">
          <el-input v-model="applyParams.enterpriceId"></el-input>
        </el-form-item>
        <el-form-item label="ProductId" prop="productId">
          <el-input v-model="applyParams.productId"></el-input>
        </el-form-item>
        <el-form-item label="ChanceId" prop="chanceId">
          <el-input v-model="applyParams.chanceId"></el-input>
        </el-form-item>
        <el-form-item label="NodeId" prop="nodeId">
          <el-input v-model="applyParams.nodeId"></el-input>
        </el-form-item>
        <el-form-item label="CustomerId" prop="customerId">
          <el-input v-model="applyParams.customerId"></el-input>
        </el-form-item>
        <el-form-item label="Status" prop="status">
          <el-input v-model="applyParams.status"></el-input>
        </el-form-item>
        <el-form-item label="Amount" prop="amount">
          <el-input v-model="applyParams.amount"></el-input>
        </el-form-item>
        <el-form-item label="Duration" prop="duration">
          <el-input v-model="applyParams.duration"></el-input>
        </el-form-item>
        <el-form-item label="OurBenefit" prop="ourBenefit">
          <el-input v-model="applyParams.ourBenefit"></el-input>
        </el-form-item>
        <el-form-item label="IntermeBenefit" prop="intermeBenefit">
          <el-input v-model="applyParams.intermeBenefit"></el-input>
        </el-form-item>
        <el-form-item label="Spread" prop="spread">
          <el-input v-model="applyParams.spread"></el-input>
        </el-form-item>
        <el-form-item label="Guarantee" prop="guarantee">
          <el-input v-model="applyParams.guarantee"></el-input>
        </el-form-item>
        <el-form-item label="GuarantorIds" prop="guarantorIds">
          <el-input v-model="applyParams.guarantorIds"></el-input>
        </el-form-item>
        <el-form-item label="GuaranteeRepayWay" prop="guaranteeRepayWay">
          <el-input v-model="applyParams.guaranteeRepayWay"></el-input>
        </el-form-item>
        <el-form-item label="RepayType" prop="repayType">
          <el-input v-model="applyParams.repayType"></el-input>
        </el-form-item>
        <el-form-item label="RepayDay" prop="repayDay">
          <el-input v-model="applyParams.repayDay"></el-input>
        </el-form-item>
        <el-form-item label="RepayWay" prop="repayWay">
          <el-input v-model="applyParams.repayWay"></el-input>
        </el-form-item>
        <el-form-item label="RepayMethod" prop="repayMethod">
          <el-input v-model="applyParams.repayMethod"></el-input>
        </el-form-item>
        <el-form-item label="FeePayer" prop="feePayer">
          <el-input v-model="applyParams.feePayer"></el-input>
        </el-form-item>
        <el-form-item label="AutoRepay" prop="autoRepay">
          <el-input v-model="applyParams.autoRepay"></el-input>
        </el-form-item>
        <el-form-item label="AdvRepay" prop="advRepay">
          <el-input v-model="applyParams.advRepay"></el-input>
        </el-form-item>
        <el-form-item label="AdvPunish" prop="advPunish">
          <el-input v-model="applyParams.advPunish"></el-input>
        </el-form-item>
        <el-form-item label="AdvDiscount" prop="advDiscount">
          <el-input v-model="applyParams.advDiscount"></el-input>
        </el-form-item>
        <el-form-item label="RateType" prop="rateType">
          <el-input v-model="applyParams.rateType"></el-input>
        </el-form-item>
        <el-form-item label="Rate" prop="rate">
          <el-input v-model="applyParams.rate"></el-input>
        </el-form-item>
        <el-form-item label="MonRate" prop="monRate">
          <el-input v-model="applyParams.monRate"></el-input>
        </el-form-item>
        <el-form-item label="DailyRate" prop="dailyRate">
          <el-input v-model="applyParams.dailyRate"></el-input>
        </el-form-item>
        <el-form-item label="AvoidDays" prop="avoidDays">
          <el-input v-model="applyParams.avoidDays"></el-input>
        </el-form-item>
        <el-form-item label="Penalty" prop="penalty">
          <el-input v-model="applyParams.penalty"></el-input>
        </el-form-item>
        <el-form-item label="PenaltyBase" prop="penaltyBase">
          <el-input v-model="applyParams.penaltyBase"></el-input>
        </el-form-item>
        <el-form-item label="PenaltyDiscount" prop="penaltyDiscount">
          <el-input v-model="applyParams.penaltyDiscount"></el-input>
        </el-form-item>
        <el-form-item label="Creator" prop="creator">
          <el-input v-model="applyParams.creator"></el-input>
        </el-form-item>
        <el-form-item label="Saler" prop="saler">
          <el-input v-model="applyParams.saler"></el-input>
        </el-form-item>
        <el-form-item label="ApproveTime" prop="approveTime">
          <el-input v-model="applyParams.approveTime"></el-input>
        </el-form-item>
        <el-form-item label="ContractTime" prop="contractTime">
          <el-input v-model="applyParams.contractTime"></el-input>
        </el-form-item>
        <el-form-item label="LoanTime" prop="loanTime">
          <el-input v-model="applyParams.loanTime"></el-input>
        </el-form-item>
        <el-form-item label="Loaner" prop="loaner">
          <el-input v-model="applyParams.loaner"></el-input>
        </el-form-item>
        <el-form-item label="LoanNo" prop="loanNo">
          <el-input v-model="applyParams.loanNo"></el-input>
        </el-form-item>
        <el-form-item label="LoanAmount" prop="loanAmount">
          <el-input v-model="applyParams.loanAmount"></el-input>
        </el-form-item>
        <el-form-item label="FinishTime" prop="finishTime">
          <el-input v-model="applyParams.finishTime"></el-input>
        </el-form-item>
        <el-form-item label="Finisher" prop="finisher">
          <el-input v-model="applyParams.finisher"></el-input>
        </el-form-item>
        <el-form-item label="Principal" prop="principal">
          <el-input v-model="applyParams.principal"></el-input>
        </el-form-item>
        <el-form-item label="PenaltyAmt" prop="penaltyAmt">
          <el-input v-model="applyParams.penaltyAmt"></el-input>
        </el-form-item>
        <el-form-item label="RateAmt" prop="rateAmt">
          <el-input v-model="applyParams.rateAmt"></el-input>
        </el-form-item>
        <el-form-item label="Emailed" prop="emailed">
          <el-input v-model="applyParams.emailed"></el-input>
        </el-form-item>
        <el-form-item label="Smsed" prop="smsed">
          <el-input v-model="applyParams.smsed"></el-input>
        </el-form-item>
        <el-form-item label="CreditId" prop="creditId">
          <el-input v-model="applyParams.creditId"></el-input>
        </el-form-item>
        <el-form-item label="CreditBalance" prop="creditBalance">
          <el-input v-model="applyParams.creditBalance"></el-input>
        </el-form-item>
        <el-form-item label="CreditUsedId" prop="creditUsedId">
          <el-input v-model="applyParams.creditUsedId"></el-input>
        </el-form-item>
        <el-form-item label="Tel" prop="tel">
          <el-input v-model="applyParams.tel"></el-input>
        </el-form-item>
        <el-form-item label="Account" prop="account">
          <el-input v-model="applyParams.account"></el-input>
        </el-form-item>
        <el-form-item label="AccountName" prop="accountName">
          <el-input v-model="applyParams.accountName"></el-input>
        </el-form-item>
        <el-form-item label="AgencyNo" prop="agencyNo">
          <el-input v-model="applyParams.agencyNo"></el-input>
        </el-form-item>
        <el-form-item label="BankNo" prop="bankNo">
          <el-input v-model="applyParams.bankNo"></el-input>
        </el-form-item>
        <el-form-item label="BankId" prop="bankId">
          <el-input v-model="applyParams.bankId"></el-input>
        </el-form-item>
        <el-form-item label="Contacts" prop="contacts">
          <el-input v-model="applyParams.contacts"></el-input>
        </el-form-item>
        <el-form-item label="AgencyId" prop="agencyId">
          <el-input v-model="applyParams.agencyId"></el-input>
        </el-form-item>
        <el-form-item label="LoanPurpose" prop="loanPurpose">
          <el-input v-model="applyParams.loanPurpose"></el-input>
        </el-form-item>
        <el-form-item label="ExpectMonthRepay" prop="expectMonthRepay">
          <el-input v-model="applyParams.expectMonthRepay"></el-input>
        </el-form-item>
        <el-form-item label="MortgageRegister" prop="mortgageRegister">
          <el-input v-model="applyParams.mortgageRegister"></el-input>
        </el-form-item>
        <el-form-item label="MortgageRegisterTime" prop="mortgageRegisterTime">
          <el-input v-model="applyParams.mortgageRegisterTime"></el-input>
        </el-form-item>
        <el-form-item label="ChargeFee" prop="chargeFee">
          <el-input v-model="applyParams.chargeFee"></el-input>
        </el-form-item>
        <el-form-item label="ChargeFeeType" prop="chargeFeeType">
          <el-input v-model="applyParams.chargeFeeType"></el-input>
        </el-form-item>
        <el-form-item label="StampType" prop="stampType">
          <el-input v-model="applyParams.stampType"></el-input>
        </el-form-item>
        <el-form-item label="StampUser" prop="stampUser">
          <el-input v-model="applyParams.stampUser"></el-input>
        </el-form-item>
        <el-form-item label="StampTime" prop="stampTime">
          <el-input v-model="applyParams.stampTime"></el-input>
        </el-form-item>
        <el-form-item label="StampStaff" prop="stampStaff">
          <el-input v-model="applyParams.stampStaff"></el-input>
        </el-form-item>
        <el-form-item label="ServiceSourceOne" prop="serviceSourceOne">
          <el-input v-model="applyParams.serviceSourceOne"></el-input>
        </el-form-item>
        <el-form-item label="ServiceSourceTwo" prop="serviceSourceTwo">
          <el-input v-model="applyParams.serviceSourceTwo"></el-input>
        </el-form-item>
        <el-form-item label="GuaranteeCode" prop="guaranteeCode">
          <el-input v-model="applyParams.guaranteeCode"></el-input>
        </el-form-item>
        <el-form-item label="ApplyOpinion" prop="applyOpinion">
          <el-input v-model="applyParams.applyOpinion"></el-input>
        </el-form-item>
        <el-form-item label="SignOperator" prop="signOperator">
          <el-input v-model="applyParams.signOperator"></el-input>
        </el-form-item>
        <el-form-item label="SignTime" prop="signTime">
          <el-input v-model="applyParams.signTime"></el-input>
        </el-form-item>
        <el-form-item label="SignRemark" prop="signRemark">
          <el-input v-model="applyParams.signRemark"></el-input>
        </el-form-item>
        <el-form-item label="DebtRemark" prop="debtRemark">
          <el-input v-model="applyParams.debtRemark"></el-input>
        </el-form-item>
        <el-form-item label="AccountRemark" prop="accountRemark">
          <el-input v-model="applyParams.accountRemark"></el-input>
        </el-form-item>
        <el-form-item label="CreditMoney" prop="creditMoney">
          <el-input v-model="applyParams.creditMoney"></el-input>
        </el-form-item>
        <el-form-item label="CreditDuration" prop="creditDuration">
          <el-input v-model="applyParams.creditDuration"></el-input>
        </el-form-item>
        <el-form-item label="ApplySuggestion" prop="applySuggestion">
          <el-input v-model="applyParams.applySuggestion"></el-input>
        </el-form-item>
        <el-form-item label="VisitTee" prop="visitTee">
          <el-input v-model="applyParams.visitTee"></el-input>
        </el-form-item>
        <el-form-item label="WebsiteRemark" prop="websiteRemark">
          <el-input v-model="applyParams.websiteRemark"></el-input>
        </el-form-item>
        <el-form-item label="ExtRemark" prop="extRemark">
          <el-input v-model="applyParams.extRemark"></el-input>
        </el-form-item>
        <el-form-item label="PenaltyFeeRate" prop="penaltyFeeRate">
          <el-input v-model="applyParams.penaltyFeeRate"></el-input>
        </el-form-item>
        <el-form-item label="CounterOption" prop="counterOption">
          <el-input v-model="applyParams.counterOption"></el-input>
        </el-form-item>
        <el-form-item label="Dalers" prop="dalers">
          <el-input v-model="applyParams.dalers"></el-input>
        </el-form-item>
        <el-form-item label="BeforeAmount" prop="beforeAmount">
          <el-input v-model="applyParams.beforeAmount"></el-input>
        </el-form-item>
        <el-form-item label="UpdateOperator" prop="updateOperator">
          <el-input v-model="applyParams.updateOperator"></el-input>
        </el-form-item>
        <el-form-item label="UpdateReason" prop="updateReason">
          <el-input v-model="applyParams.updateReason"></el-input>
        </el-form-item>
        <el-form-item label="UpdateTime" prop="updateTime">
          <el-input v-model="applyParams.updateTime"></el-input>
        </el-form-item>
        <el-form-item label="ProductRemark" prop="productRemark">
          <el-input v-model="applyParams.productRemark"></el-input>
        </el-form-item>
        <el-form-item label="LoanDuration" prop="loanDuration">
          <el-input v-model="applyParams.loanDuration"></el-input>
        </el-form-item>
        <el-form-item label="JoinBank" prop="joinBank">
          <el-input v-model="applyParams.joinBank"></el-input>
        </el-form-item>
        <el-form-item label="SurveyMoney" prop="surveyMoney">
          <el-input v-model="applyParams.surveyMoney"></el-input>
        </el-form-item>
        <el-form-item label="ChargeFeeTypeRemark" prop="chargeFeeTypeRemark">
          <el-input v-model="applyParams.chargeFeeTypeRemark"></el-input>
        </el-form-item>
        <el-form-item label="Controller" prop="controller">
          <el-input v-model="applyParams.controller"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button v-if="dialogTitle=='新增'" type="primary" @click="createApply">新增</el-button>
        <el-button v-else-if="dialogTitle=='修改'" type="primary" @click="updateApply">修改</el-button>
      </div>
    </el-dialog>


  </div>
</template>


<!--js部分-->
<script>
  import Pagination from '@/components/Pagination'

  export default {
    components: {
      Pagination
    },
    data() {
      return {
        //列表部分
        listLoading: true,
        listParams: {
          pageSize: 5,
          pageNum: 1,
          keyMap:{},
          orderBy:''
        },
        pageSizes: [5, 10, 30, 50],
        pageInfo: {
          list: []
        },
        //增删改部分
        dialogFormVisible: false,
        dialogTitle: '',
        applyParams: {
        },
        rules:{
        }
      };
    },
    created() {
      this.getList();
    },
    methods: {
      //分页调用方法
      handleSizeChange(size) {
        this.listParams.pageSize = size;
        this.getList();
      },
      handleCurrentChange(currentPage) {
        this.listParams.pageNum = currentPage;
        this.getList();
      },
      //获取列表方法
      getList() {
        let _this = this;
        this.listLoading = true;
        this.postRequest('/apply/list', this.listParams).then(res => {
          _this.listLoading = false;
          if (res.data.code == '00') {
            this.pageInfo = res.data.data;
          }
        })
      },
      //点击新增按钮触发方法
      handleCreate() {
        if (this.$refs['applyForm']!==undefined) {
          this.$refs['applyForm'].resetFields();
        }
        this.dialogFormVisible = true;
        this.dialogTitle = '新增';
      },
      //新增提交方法
      createApply() {
        this.$refs['applyForm'].validate((valid=> {
          if (valid) {
            this.postRequest('/apply/save', this.applyParams).then(res => {
              if (res.data.code == '00') {
                this.dialogFormVisible = false;
                this.$message.success('新增成功');
                this.getList();
              }
            })
          }
        }))
      },
      //点击修改按钮触发方法
      handleUpdate(applyId) {
        if (this.$refs['applyForm']!==undefined) {
          this.$refs['applyForm'].resetFields();
        }
        this.dialogFormVisible = true;
        this.dialogTitle = '修改';
        this.getRequest('/apply/get?key='+applyId).then(res => {
          if (res.data.code == '00') {
            this.applyParams = res.data.data;
          }
        })
      },
      //修改提交方法
      updateApply(){
        this.$refs['applyForm'].validate((valid=>{
          if(valid){
            this.postRequest('/apply/update', this.applyParams).then(res => {
              if (res.data.code == '00') {
                this.dialogFormVisible = false;
                this.$message.success('修改成功');
                this.getList();
              }
            })
          }
        }))
      },
      //点击删除触发方法
      handleDel(applyId) {
        this.$confirm('是否删除该用户', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.getRequest('/apply/delete?key='+applyId).then(res => {
            if (res.data.code == '00') {
              this.$message.success('删除成功');
              this.getList();
            }
          })
        }).catch(() => {
          this.$message.info('已取消删除');
        });
      },
    }
  }

</script>


