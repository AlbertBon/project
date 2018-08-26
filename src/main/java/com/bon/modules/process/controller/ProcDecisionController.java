package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.ProcDecisionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * @Created：2018-08-25
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "ProcDecision",description = "流程决策配置表")
@RestController
@RequestMapping("/procDecision")
public class ProcDecisionController {

    @Autowired
    private ProcDecisionService procDecisionService;

    @ApiOperation(value = "根据条件获取ProcDecision列表")
    @RequiresPermissions({"url:procDecision:listProcDecision"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcDecision(@RequestBody ProcDecisionListDTO listDTO){
        PageVO pageVO = procDecisionService.listProcDecision(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取ProcDecision")
    @RequiresPermissions({"url:procDecision:getProcDecision"})
    @GetMapping(value = "/get")
    public ResultBody getProcDecision(@RequestParam Long key){
        ProcDecisionVO vo= procDecisionService.getProcDecision(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增ProcDecision")
    @RequiresPermissions({"url:procDecision:saveProcDecision"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcDecision(@RequestBody ProcDecisionDTO dto){
        procDecisionService.saveProcDecision(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改ProcDecision")
    @RequiresPermissions({"url:procDecision:updateProcDecision"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcDecision(@RequestBody ProcDecisionDTO dto){
        procDecisionService.updateProcDecision(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除ProcDecision")
    @RequiresPermissions({"url:procDecision:deleteProcDecision"})
    @GetMapping(value = "/delete")
    public ResultBody deleteProcDecision(@RequestParam Long key){
        procDecisionService.deleteProcDecision(key);
        return new ResultBody();
    }

}
