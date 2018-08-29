package com.bon.modules.apply.controller;

import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.apply.domain.dto.*;
import com.bon.modules.apply.domain.vo.*;
import com.bon.modules.apply.service.ApplyService;
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
 * @Description: Apply控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "Apply",description = "申请表")
@RestController
@RequestMapping("/apply")
public class ApplyController {

    @Autowired
    private ApplyService applyService; 

    @ApiOperation(value = "根据条件获取Apply列表")
    @RequiresPermissions({"url:apply:listApply"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listApply(@RequestBody ApplyListDTO listDTO){
        PageVO pageVO = applyService.listApply(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取Apply")
    @RequiresPermissions({"url:apply:getApply"})
    @GetMapping(value = "/get")
    public ResultBody getApply(@RequestParam Long key){
        ApplyVO vo= applyService.getApply(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增Apply")
    @RequiresPermissions({"url:apply:saveApply"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveApply(@RequestBody ApplyDTO dto){
        Long key = applyService.saveApply(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改Apply")
    @RequiresPermissions({"url:apply:updateApply"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateApply(@RequestBody ApplyDTO dto){
        applyService.updateApply(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除Apply")
    @RequiresPermissions({"url:apply:deleteApply"})
    @GetMapping(value = "/delete")
    public ResultBody deleteApply(@RequestParam Long key){
        applyService.deleteApply(key);
        return new ResultBody();
    }

}
