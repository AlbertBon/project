package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
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
@Api(value = "Process",description = "流程记录表")
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private ProcessService processService; 

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
