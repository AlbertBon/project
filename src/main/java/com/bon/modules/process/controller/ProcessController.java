package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.ProcSettingService;
import com.bon.modules.process.service.ProcessService;
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
 * @Description: Process控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "流程管理",description = "流程管理")
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @Autowired
    private ProcSettingService procSettingService;

    @ApiOperation(value = "获取流程节点配置")
    @RequiresPermissions({"url:procSetting:getProcSetting"})
    @GetMapping(value = "/getProcSetting")
    public ResultBody getProcSetting(@RequestParam Long key){
        ProcSettingVO vo= procSettingService.getProcSetting(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增流程节点配置")
    @RequiresPermissions({"url:procSetting:saveProcSetting"})
    @PostMapping(value = "/saveProcSetting",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcSetting(@RequestBody ProcSettingDTO dto){
        Long key = procSettingService.saveProcSetting(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改流程节点配置")
    @RequiresPermissions({"url:procSetting:updateProcSetting"})
    @PostMapping(value = "/updateProcSetting",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcSetting(@RequestBody ProcSettingDTO dto){
        procSettingService.updateProcSetting(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除流程节点配置")
    @RequiresPermissions({"url:procSetting:deleteProcSetting"})
    @GetMapping(value = "/deleteProcSetting")
    public ResultBody deleteProcSetting(@RequestParam Long key){
        procSettingService.deleteProcSetting(key);
        return new ResultBody();
    }

    @ApiOperation(value = "根据条件获取Process列表")
    @RequiresPermissions({"url:process:listProcess"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcess(@RequestBody ProcessListDTO listDTO){
        PageVO pageVO = processService.listProcess(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取Process")
    @RequiresPermissions({"url:process:getProcess"})
    @GetMapping(value = "/get")
    public ResultBody getProcess(@RequestParam Long key){
        ProcessVO vo= processService.getProcess(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增Process")
    @RequiresPermissions({"url:process:saveProcess"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcess(@RequestBody ProcessDTO dto){
        processService.saveProcess(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改Process")
    @RequiresPermissions({"url:process:updateProcess"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcess(@RequestBody ProcessDTO dto){
        processService.updateProcess(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除Process")
    @RequiresPermissions({"url:process:deleteProcess"})
    @GetMapping(value = "/delete")
    public ResultBody deleteProcess(@RequestParam Long key){
        processService.deleteProcess(key);
        return new ResultBody();
    }

}
