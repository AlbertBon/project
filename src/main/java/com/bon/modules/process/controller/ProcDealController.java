package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.ProcDealService;
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
 * @Description: ProcDeal控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "ProcDeal",description = "流程记录表")
@RestController
@RequestMapping("/procDeal")
public class ProcDealController {

    @Autowired
    private ProcDealService procDealService; 

    @ApiOperation(value = "根据条件获取ProcDeal列表")
    @RequiresPermissions({"url:procDeal:listProcDeal"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listProcDeal(@RequestBody ProcDealListDTO listDTO){
        PageVO pageVO = procDealService.listProcDeal(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取ProcDeal")
    @RequiresPermissions({"url:procDeal:getProcDeal"})
    @GetMapping(value = "/get")
    public ResultBody getProcDeal(@RequestParam Long key){
        ProcDealVO vo= procDealService.getProcDeal(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增ProcDeal")
    @RequiresPermissions({"url:procDeal:saveProcDeal"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveProcDeal(@RequestBody ProcDealDTO dto){
        procDealService.saveProcDeal(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "修改ProcDeal")
    @RequiresPermissions({"url:procDeal:updateProcDeal"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateProcDeal(@RequestBody ProcDealDTO dto){
        procDealService.updateProcDeal(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除ProcDeal")
    @RequiresPermissions({"url:procDeal:deleteProcDeal"})
    @GetMapping(value = "/delete")
    public ResultBody deleteProcDeal(@RequestParam Long key){
        procDealService.deleteProcDeal(key);
        return new ResultBody();
    }

}
