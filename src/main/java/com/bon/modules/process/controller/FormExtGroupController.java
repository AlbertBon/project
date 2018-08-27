package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.FormExtGroupService;
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
 * @Description: FormExtGroup控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "FormExtGroup",description = "扩展表单组配置")
@RestController
@RequestMapping("/formExtGroup")
public class FormExtGroupController {

    @Autowired
    private FormExtGroupService formExtGroupService; 

    @ApiOperation(value = "根据条件获取FormExtGroup列表")
    @RequiresPermissions({"url:formExtGroup:listFormExtGroup"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listFormExtGroup(@RequestBody FormExtGroupListDTO listDTO){
        PageVO pageVO = formExtGroupService.listFormExtGroup(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取FormExtGroup")
    @RequiresPermissions({"url:formExtGroup:getFormExtGroup"})
    @GetMapping(value = "/get")
    public ResultBody getFormExtGroup(@RequestParam Long key){
        FormExtGroupVO vo= formExtGroupService.getFormExtGroup(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增FormExtGroup")
    @RequiresPermissions({"url:formExtGroup:saveFormExtGroup"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveFormExtGroup(@RequestBody FormExtGroupDTO dto){
        formExtGroupService.saveFormExtGroup(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改FormExtGroup")
    @RequiresPermissions({"url:formExtGroup:updateFormExtGroup"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateFormExtGroup(@RequestBody FormExtGroupDTO dto){
        formExtGroupService.updateFormExtGroup(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除FormExtGroup")
    @RequiresPermissions({"url:formExtGroup:deleteFormExtGroup"})
    @GetMapping(value = "/delete")
    public ResultBody deleteFormExtGroup(@RequestParam Long key){
        formExtGroupService.deleteFormExtGroup(key);
        return new ResultBody();
    }

}
