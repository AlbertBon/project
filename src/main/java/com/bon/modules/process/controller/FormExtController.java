package com.bon.modules.process.controller;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.domain.vo.ResultBody;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.service.FormExtService;
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
 * @Description: FormExt控制层
 * @Email: 502285815@qq.com
*/
@Api(value = "FormExt",description = "扩展值字段")
@RestController
@RequestMapping("/formExt")
public class FormExtController {

    @Autowired
    private FormExtService formExtService; 

    @ApiOperation(value = "根据条件获取FormExt列表")
    @RequiresPermissions({"url:formExt:listFormExt"})
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody listFormExt(@RequestBody FormExtListDTO listDTO){
        PageVO pageVO = formExtService.listFormExt(listDTO);
        return new ResultBody(pageVO);
    }

    @ApiOperation(value = "获取FormExt")
    @RequiresPermissions({"url:formExt:getFormExt"})
    @GetMapping(value = "/get")
    public ResultBody getFormExt(@RequestParam Long key){
        FormExtVO vo= formExtService.getFormExt(key);
        return new ResultBody(vo);
    }

    @ApiOperation(value = "新增FormExt")
    @RequiresPermissions({"url:formExt:saveFormExt"})
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody saveFormExt(@RequestBody FormExtDTO dto){
        Long key = formExtService.saveFormExt(dto);
        return new ResultBody((Object) key);
    }

    @ApiOperation(value = "修改FormExt")
    @RequiresPermissions({"url:formExt:updateFormExt"})
    @PostMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultBody updateFormExt(@RequestBody FormExtDTO dto){
        formExtService.updateFormExt(dto);
        return new ResultBody();
    }

    @ApiOperation(value = "删除FormExt")
    @RequiresPermissions({"url:formExt:deleteFormExt"})
    @GetMapping(value = "/delete")
    public ResultBody deleteFormExt(@RequestParam Long key){
        formExtService.deleteFormExt(key);
        return new ResultBody();
    }

}
