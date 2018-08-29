package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.FormTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormType控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "FormType",description = "流程表单类型 ")
@RestController
@RequestMapping("/formType")
public class FormTypeController {

    @Autowired
    private FormTypeService formTypeService; 

    @ApiOperation(value = "根据条件获取FormType列表")
    @RequiresPermissions({"url:formType:listFormType"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listFormType(@RequestBody FormTypeListDTO listDTO){
        PageVO pageVO = formTypeService.listFormType(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取FormType")
    @RequiresPermissions({"url:formType:getFormType"})
    @GetMapping(value = "/get")
    public ResultBody getFormType(@RequestParam Long key){
        FormTypeVO vo= formTypeService.getFormType(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增FormType")
    @RequiresPermissions({"url:formType:saveFormType"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveFormType(@RequestBody FormTypeDTO dto){
        Long key = formTypeService.saveFormType(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改FormType")
    @RequiresPermissions({"url:formType:updateFormType"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateFormType(@RequestBody FormTypeDTO dto){
        formTypeService.updateFormType(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除FormType")
    @RequiresPermissions({"url:formType:deleteFormType"})
    @GetMapping(value = "/delete")
    public ResultBody deleteFormType(@RequestParam Long key){
        formTypeService.deleteFormType(key);
        return new ResultBody();
    }

}
