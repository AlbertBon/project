<template>
  <div class="app-container calendar-list-container">
<!--新增修改弹出框部分-->
    <div class="filter-container">
      <el-input style="width: 200px;" v-model="listParams.keyMap.equal_formTypeId" class="filter-item" placeholder="序号">
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
      <el-table-column width="160px" align="center" label="Name">
        <template slot-scope="scope">
          <span>{{scope.row.name}}</span>
        </template>
      </el-table-column>
      <el-table-column width="160px" align="center" label="CreateType">
        <template slot-scope="scope">
          <span>{{scope.row.createType}}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="操作" width="230" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button type="primary" size="mini" @click="handleUpdate(scope.row.formTypeId)">修改</el-button>
          <el-button type="danger" size="mini" @click="handleDel(scope.row.formTypeId)">删除</el-button>
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
      <el-form ref="formTypeForm" :rules="rules" :model="formTypeParams" label-position="left" label-width="100px"
               style='width: 400px; margin-left:50px;'>
        <el-form-item v-show="false" prop="formTypeId">
          <el-input v-model="formTypeParams.formTypeId"></el-input>
        </el-form-item>
        <el-form-item v-show="false" label="FormTypeId" prop="FormTypeId">
          <el-input v-model="formTypeParams.formTypeId"></el-input>
        </el-form-item>
        <el-form-item label="Name" prop="Name">
          <el-input v-model="formTypeParams.name"></el-input>
        </el-form-item>
        <el-form-item label="CreateType" prop="CreateType">
          <el-input v-model="formTypeParams.createType"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button v-if="dialogTitle=='新增'" type="primary" @click="createFormType">新增</el-button>
        <el-button v-else-if="dialogTitle=='修改'" type="primary" @click="updateFormType">修改</el-button>
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
        formTypeParams: {
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
        this.postRequest('/formType/list', this.listParams).then(res => {
          _this.listLoading = false;
          if (res.data.code == '00') {
            this.pageInfo = res.data.data;
          }
        })
      },
      //点击新增按钮触发方法
      handleCreate() {
        if (this.$refs['formTypeForm']!==undefined) {
          this.$refs['formTypeForm'].resetFields();
        }
        this.dialogFormVisible = true;
        this.dialogTitle = '新增';
      },
      //新增提交方法
      createFormType() {
        this.$refs['formTypeForm'].validate((valid=> {
          if (valid) {
            this.postRequest('/formType/save', this.formTypeParams).then(res => {
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
      handleUpdate(formTypeId) {
        if (this.$refs['formTypeForm']!==undefined) {
          this.$refs['formTypeForm'].resetFields();
        }
        this.dialogFormVisible = true;
        this.dialogTitle = '修改';
        this.getRequest('/formType/get?key='+formTypeId).then(res => {
          if (res.data.code == '00') {
            this.formTypeParams = res.data.data;
          }
        })
      },
      //修改提交方法
      updateFormType(){
        this.$refs['formTypeForm'].validate((valid=>{
          if(valid){
            this.postRequest('/formType/update', this.formTypeParams).then(res => {
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
      handleDel(formTypeId) {
        this.$confirm('是否删除该用户', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.getRequest('/formType/delete?key='+formTypeId).then(res => {
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


