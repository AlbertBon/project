package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.FormExtSettingService;
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
 * @Description: FormExtSetting控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "FormExtSetting",description = "表单扩展信息配置表")
@RestController
@RequestMapping("/formExtSetting")
public class FormExtSettingController {

    @Autowired
    private FormExtSettingService formExtSettingService; 

    @ApiOperation(value = "根据条件获取FormExtSetting列表")
    @RequiresPermissions({"url:formExtSetting:listFormExtSetting"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listFormExtSetting(@RequestBody FormExtSettingListDTO listDTO){
        PageVO pageVO = formExtSettingService.listFormExtSetting(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取FormExtSetting")
    @RequiresPermissions({"url:formExtSetting:getFormExtSetting"})
    @GetMapping(value = "/get")
    public ResultBody getFormExtSetting(@RequestParam Long key){
        FormExtSettingVO vo= formExtSettingService.getFormExtSetting(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增FormExtSetting")
    @RequiresPermissions({"url:formExtSetting:saveFormExtSetting"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveFormExtSetting(@RequestBody FormExtSettingDTO dto){
        formExtSettingService.saveFormExtSetting(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改FormExtSetting")
    @RequiresPermissions({"url:formExtSetting:updateFormExtSetting"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateFormExtSetting(@RequestBody FormExtSettingDTO dto){
        formExtSettingService.updateFormExtSetting(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除FormExtSetting")
    @RequiresPermissions({"url:formExtSetting:deleteFormExtSetting"})
    @GetMapping(value = "/delete")
    public ResultBody deleteFormExtSetting(@RequestParam Long key){
        formExtSettingService.deleteFormExtSetting(key);
        return new ResultBody();
    }

}
