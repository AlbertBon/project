package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.FormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: Form控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "Form",description = "流程表单实例")
@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormService formService; 

    @ApiOperation(value = "根据条件获取Form列表")
    @RequiresPermissions({"url:form:listForm"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listForm(@RequestBody FormListDTO listDTO){
        PageVO pageVO = formService.listForm(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取Form")
    @RequiresPermissions({"url:form:getForm"})
    @GetMapping(value = "/get")
    public ResultBody getForm(@RequestParam Long key){
        FormVO vo= formService.getForm(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增Form")
    @RequiresPermissions({"url:form:saveForm"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveForm(@RequestBody FormDTO dto){
        formService.saveForm(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改Form")
    @RequiresPermissions({"url:form:updateForm"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateForm(@RequestBody FormDTO dto){
        formService.updateForm(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除Form")
    @RequiresPermissions({"url:form:deleteForm"})
    @GetMapping(value = "/delete")
    public ResultBody deleteForm(@RequestParam Long key){
        formService.deleteForm(key);
        return new ResultBody();
    }

}
