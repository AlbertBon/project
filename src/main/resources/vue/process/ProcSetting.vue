<template>
  <div class="app-container calendar-list-container">
<!--新增修改弹出框部分-->
    <div class="filter-container">
      <el-input style="width: 200px;" v-model="listParams.keyMap.equal_nodeId" class="filter-item" placeholder="序号">
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
      <el-table-column width="160px" align="center" label="DepartmentId">
        <template slot-scope="scope">
          <span>{{scope.row.departmentId}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="NodeName">
        <template slot-scope="scope">
          <span>{{scope.row.nodeName}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Left">
        <template slot-scope="scope">
          <span>{{scope.row.left}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Top">
        <template slot-scope="scope">
          <span>{{scope.row.top}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Width">
        <template slot-scope="scope">
          <span>{{scope.row.width}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Height">
        <template slot-scope="scope">
          <span>{{scope.row.height}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DealerPos">
        <template slot-scope="scope">
          <span>{{scope.row.dealerPos}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Dealer">
        <template slot-scope="scope">
          <span>{{scope.row.dealer}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DealerBenefit">
        <template slot-scope="scope">
          <span>{{scope.row.dealerBenefit}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="BenefitBase">
        <template slot-scope="scope">
          <span>{{scope.row.benefitBase}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ExpireTime">
        <template slot-scope="scope">
          <span>{{scope.row.expireTime}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DealType">
        <template slot-scope="scope">
          <span>{{scope.row.dealType}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="Threshold">
        <template slot-scope="scope">
          <span>{{scope.row.threshold}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="SingleReject">
        <template slot-scope="scope">
          <span>{{scope.row.singleReject}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="NodeType">
        <template slot-scope="scope">
          <span>{{scope.row.nodeType}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="AutoDesition">
        <template slot-scope="scope">
          <span>{{scope.row.autoDesition}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DealResult">
        <template slot-scope="scope">
          <span>{{scope.row.dealResult}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="DealIntro">
        <template slot-scope="scope">
          <span>{{scope.row.dealIntro}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="ActionMethod">
        <template slot-scope="scope">
          <span>{{scope.row.actionMethod}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="操作" width="230" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button type="primary" size="mini" @click="handleUpdate(scope.row.nodeId)">修改</el-button>
          <el-button type="danger" size="mini" @click="handleDel(scope.row.nodeId)">删除</el-button>
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
      <el-form ref="procSettingForm" :rules="rules" :model="procSettingParams" label-position="left" label-width="100px"
               style='width: 400px; margin-left:50px;'>
        <el-form-item v-show="false" prop="nodeId">
          <el-input v-model="procSettingParams.nodeId"></el-input>
        </el-form-item>
        <el-form-item v-show="false" label="NodeId" prop="NodeId">
          <el-input v-model="procSettingParams.nodeId"></el-input>
        </el-form-item>
        <el-form-item label="DepartmentId" prop="DepartmentId">
          <el-input v-model="procSettingParams.departmentId"></el-input>
        </el-form-item>
        <el-form-item label="NodeName" prop="NodeName">
          <el-input v-model="procSettingParams.nodeName"></el-input>
        </el-form-item>
        <el-form-item label="Left" prop="Left">
          <el-input v-model="procSettingParams.left"></el-input>
        </el-form-item>
        <el-form-item label="Top" prop="Top">
          <el-input v-model="procSettingParams.top"></el-input>
        </el-form-item>
        <el-form-item label="Width" prop="Width">
          <el-input v-model="procSettingParams.width"></el-input>
        </el-form-item>
        <el-form-item label="Height" prop="Height">
          <el-input v-model="procSettingParams.height"></el-input>
        </el-form-item>
        <el-form-item label="DealerPos" prop="DealerPos">
          <el-input v-model="procSettingParams.dealerPos"></el-input>
        </el-form-item>
        <el-form-item label="Dealer" prop="Dealer">
          <el-input v-model="procSettingParams.dealer"></el-input>
        </el-form-item>
        <el-form-item label="DealerBenefit" prop="DealerBenefit">
          <el-input v-model="procSettingParams.dealerBenefit"></el-input>
        </el-form-item>
        <el-form-item label="BenefitBase" prop="BenefitBase">
          <el-input v-model="procSettingParams.benefitBase"></el-input>
        </el-form-item>
        <el-form-item label="ExpireTime" prop="ExpireTime">
          <el-input v-model="procSettingParams.expireTime"></el-input>
        </el-form-item>
        <el-form-item label="DealType" prop="DealType">
          <el-input v-model="procSettingParams.dealType"></el-input>
        </el-form-item>
        <el-form-item label="Threshold" prop="Threshold">
          <el-input v-model="procSettingParams.threshold"></el-input>
        </el-form-item>
        <el-form-item label="SingleReject" prop="SingleReject">
          <el-input v-model="procSettingParams.singleReject"></el-input>
        </el-form-item>
        <el-form-item label="NodeType" prop="NodeType">
          <el-input v-model="procSettingParams.nodeType"></el-input>
        </el-form-item>
        <el-form-item label="AutoDesition" prop="AutoDesition">
          <el-input v-model="procSettingParams.autoDesition"></el-input>
        </el-form-item>
        <el-form-item label="DealResult" prop="DealResult">
          <el-input v-model="procSettingParams.dealResult"></el-input>
        </el-form-item>
        <el-form-item label="DealIntro" prop="DealIntro">
          <el-input v-model="procSettingParams.dealIntro"></el-input>
        </el-form-item>
        <el-form-item label="ActionMethod" prop="ActionMethod">
          <el-input v-model="procSettingParams.actionMethod"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button v-if="dialogTitle=='新增'" type="primary" @click="createProcSetting">新增</el-button>
        <el-button v-else-if="dialogTitle=='修改'" type="primary" @click="updateProcSetting">修改</el-button>
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
        procSettingParams: {
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
        this.postRequest('/procSetting/list', this.listParams).then(res => {
          _this.listLoading = false;
          if (res.data.code == '00') {
            this.pageInfo = res.data.data;
          }
        })
      },
      //点击新增按钮触发方法
      handleCreate() {
        if (this.$refs['procSettingForm']!==undefined) {
          this.$refs['procSettingForm'].resetFields();
        }
        this.dialogFormVisible = true;
        this.dialogTitle = '新增';
      },
      //新增提交方法
      createProcSetting() {
        this.$refs['procSettingForm'].validate((valid=> {
          if (valid) {
            this.postRequest('/procSetting/save', this.procSettingParams).then(res => {
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
      handleUpdate(nodeId) {
        if (this.$refs['procSettingForm']!==undefined) {
          this.$refs['procSettingForm'].resetFields();
        }
        this.dialogFormVisible = true;
        this.dialogTitle = '修改';
        this.getRequest('/procSetting/get?key='+nodeId).then(res => {
          if (res.data.code == '00') {
            this.procSettingParams = res.data.data;
          }
        })
      },
      //修改提交方法
      updateProcSetting(){
        this.$refs['procSettingForm'].validate((valid=>{
          if(valid){
            this.postRequest('/procSetting/update', this.procSettingParams).then(res => {
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
      handleDel(nodeId) {
        this.$confirm('是否删除该用户', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.getRequest('/procSetting/delete?key='+nodeId).then(res => {
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


