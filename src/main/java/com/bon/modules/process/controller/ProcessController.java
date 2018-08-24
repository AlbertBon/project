package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.ProcSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * @Created：2018-08-24
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcSetting控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "process",description = "流程控制器")
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private ProcSettingService procSettingService;

    @ApiOperation(value = "根据条件获取ProcSetting列表")
    @RequiresPermissions({"url:procSetting:listProcSetting"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcSetting(@RequestBody ProcSettingListDTO listDTO){
        PageVO pageVO = procSettingService.listProcSetting(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取ProcSetting")
    @RequiresPermissions({"url:procSetting:getProcSetting"})
    @GetMapping(value = "/get")
    public ResultBody getProcSetting(@RequestParam Long key){
        ProcSettingVO vo= procSettingService.getProcSetting(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增ProcSetting")
    @RequiresPermissions({"url:procSetting:saveProcSetting"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcSetting(@RequestBody ProcSettingDTO dto){
        procSettingService.saveProcSetting(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改ProcSetting")
    @RequiresPermissions({"url:procSetting:updateProcSetting"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcSetting(@RequestBody ProcSettingDTO dto){
        procSettingService.updateProcSetting(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除ProcSetting")
    @RequiresPermissions({"url:procSetting:deleteProcSetting"})
    @GetMapping(value = "/delete")
    public ResultBody deleteProcSetting(@RequestParam Long key){
        procSettingService.deleteProcSetting(key);
        return new ResultBody();
    }

}