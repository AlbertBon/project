package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.FormExtTabService;
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
 * @Description: FormExtTab控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "FormExtTab",description = "扩展表单页配置")
@RestController
@RequestMapping("/formExtTab")
public class FormExtTabController {

    @Autowired
    private FormExtTabService formExtTabService; 

    @ApiOperation(value = "根据条件获取FormExtTab列表")
    @RequiresPermissions({"url:formExtTab:listFormExtTab"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listFormExtTab(@RequestBody FormExtTabListDTO listDTO){
        PageVO pageVO = formExtTabService.listFormExtTab(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取FormExtTab")
    @RequiresPermissions({"url:formExtTab:getFormExtTab"})
    @GetMapping(value = "/get")
    public ResultBody getFormExtTab(@RequestParam Long key){
        FormExtTabVO vo= formExtTabService.getFormExtTab(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增FormExtTab")
    @RequiresPermissions({"url:formExtTab:saveFormExtTab"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveFormExtTab(@RequestBody FormExtTabDTO dto){
        Long key = formExtTabService.saveFormExtTab(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改FormExtTab")
    @RequiresPermissions({"url:formExtTab:updateFormExtTab"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateFormExtTab(@RequestBody FormExtTabDTO dto){
        formExtTabService.updateFormExtTab(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除FormExtTab")
    @RequiresPermissions({"url:formExtTab:deleteFormExtTab"})
    @GetMapping(value = "/delete")
    public ResultBody deleteFormExtTab(@RequestParam Long key){
        formExtTabService.deleteFormExtTab(key);
        return new ResultBody();
    }

}
