package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.ProcDealService;
import com.bon.modules.process.service.ProcDecisionService;
import com.bon.modules.process.service.ProcSettingService;
import com.bon.modules.process.service.ProcessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: Process控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "流程管理",description = "流程管理模块")
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @Autowired
    private ProcSettingService procSettingService;

    @Autowired
    private ProcDecisionService procDecisionService;

    @Autowired
    private ProcDealService procDealService;

    @ApiOperation(value = "根据条件获取ProcDeal列表")
    @RequiresPermissions({"url:process:listProcDeal"})
    @PostMapping(value = "/listProcDeal",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcDeal(@RequestBody ProcDealListDTO listDTO){
        PageVO pageVO = procDealService.listProcDeal(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取ProcDeal")
    @RequiresPermissions({"url:process:getProcDeal"})
    @GetMapping(value = "/getProcDeal")
    public ResultBody getProcDeal(@RequestParam Long key){
        ProcDealVO vo= procDealService.getProcDeal(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增ProcDeal")
    @RequiresPermissions({"url:process:saveProcDeal"})
    @PostMapping(value = "/saveProcDeal",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcDeal(@RequestBody ProcDealDTO dto){
        Long key = procDealService.saveProcDeal(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改ProcDeal")
    @RequiresPermissions({"url:process:updateProcDeal"})
    @PostMapping(value = "/updateProcDeal",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcDeal(@RequestBody ProcDealDTO dto){
        procDealService.updateProcDeal(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除ProcDeal")
    @RequiresPermissions({"url:process:deleteProcDeal"})
    @GetMapping(value = "/deleteProcDeal")
    public ResultBody deleteProcDeal(@RequestParam Long key){
        procDealService.deleteProcDeal(key);
        return new ResultBody();
    }

    @ApiOperation(value = "根据条件获取ProcDecision列表")
    @RequiresPermissions({"url:process:listProcDecision"})
    @PostMapping(value = "/listProcDecision",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcDecision(@RequestBody ProcDecisionListDTO listDTO){
        PageVO pageVO = procDecisionService.listProcDecision(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取ProcDecision")
    @RequiresPermissions({"url:process:getProcDecision"})
    @GetMapping(value = "/getProcDecision")
    public ResultBody getProcDecision(@RequestParam Long key){
        ProcDecisionVO vo= procDecisionService.getProcDecision(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增ProcDecision")
    @RequiresPermissions({"url:process:saveProcDecision"})
    @PostMapping(value = "/saveProcDecision",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcDecision(@RequestBody ProcDecisionDTO dto){
        procDecisionService.saveProcDecision(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改ProcDecision")
    @RequiresPermissions({"url:process:updateProcDecision"})
    @PostMapping(value = "/updateProcDecision",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcDecision(@RequestBody ProcDecisionDTO dto){
        procDecisionService.updateProcDecision(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除ProcDecision")
    @RequiresPermissions({"url:process:deleteProcDecision"})
    @GetMapping(value = "/deleteProcDecision")
    public ResultBody deleteProcDecision(@RequestParam Long key){
        procDecisionService.deleteProcDecision(key);
        return new ResultBody();
    }

    @ApiOperation(value = "批量修改ProcSetting")
    @RequiresPermissions({"url:process:updateBatchProcDecision"})
    @PostMapping(value = "/updateBatchProcDecision",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateBatchProcDecision(@RequestBody List<ProcDecisionDTO> dtoList){
        procDecisionService.updateBatchProcDecision(dtoList);
        return new ResultBody();
    }

    @ApiOperation(value = "根据条件获取ProcSetting列表")
    @RequiresPermissions({"url:process:listProcSetting"})
    @PostMapping(value = "/listProcSetting",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcSetting(@RequestBody ProcSettingListDTO listDTO){
        PageVO pageVO = procSettingService.listProcSetting(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取ProcSetting")
    @RequiresPermissions({"url:process:getProcSetting"})
    @GetMapping(value = "/getProcSetting")
    public ResultBody getProcSetting(@RequestParam Long key){
        ProcSettingVO vo= procSettingService.getProcSetting(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增ProcSetting")
    @RequiresPermissions({"url:process:saveProcSetting"})
    @PostMapping(value = "/saveProcSetting",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcSetting(@RequestBody ProcSettingDTO dto){
        Long key = procSettingService.saveProcSetting(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改ProcSetting")
    @RequiresPermissions({"url:process:updateProcSetting"})
    @PostMapping(value = "/updateProcSetting",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcSetting(@RequestBody ProcSettingDTO dto){
        procSettingService.updateProcSetting(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除ProcSetting")
    @RequiresPermissions({"url:process:deleteProcSetting"})
    @GetMapping(value = "/deleteProcSetting")
    public ResultBody deleteProcSetting(@RequestParam Long key){
        procSettingService.deleteProcSetting(key);
        return new ResultBody();
    }

    @ApiOperation(value = "批量修改ProcSetting")
    @RequiresPermissions({"url:process:updateBatchProcSetting"})
    @PostMapping(value = "/updateBatchProcSetting",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateBatchProcSetting(@RequestBody List<ProcSettingDTO> dtoList){
        procSettingService.updateBatchProcSetting(dtoList);
        return new ResultBody();
    }

    @ApiOperation(value = "根据条件获取Process列表")
    @RequiresPermissions({"url:process:listProcess"})
    @PostMapping(value = "/listProcess",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcess(@RequestBody ProcessListDTO listDTO){
        PageVO pageVO = processService.listProcess(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取Process")
    @RequiresPermissions({"url:process:getProcess"})
    @GetMapping(value = "/getProcess")
    public ResultBody getProcess(@RequestParam Long key){
        ProcessVO vo= processService.getProcess(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增Process")
    @RequiresPermissions({"url:process:saveProcess"})
    @PostMapping(value = "/saveProcess",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcess(@RequestBody ProcessDTO dto){
        Long key = processService.saveProcess(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改Process")
    @RequiresPermissions({"url:process:updateProcess"})
    @PostMapping(value = "/updateProcess",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcess(@RequestBody ProcessDTO dto){
        processService.updateProcess(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除Process")
    @RequiresPermissions({"url:process:deleteProcess"})
    @GetMapping(value = "/deleteProcess")
    public ResultBody deleteProcess(@RequestParam Long key){
        processService.deleteProcess(key);
        return new ResultBody();
    }

}
