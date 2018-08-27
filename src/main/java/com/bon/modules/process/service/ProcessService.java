package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.Process;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: Process服务接口类
 * @Email: 502285815@qq.com
*/
public interface ProcessService {
    /**查询单个*/
     public ProcessVO getProcess(Long id);
    /**查询列表*/
     public PageVO listProcess(ProcessListDTO dto);
    /**保存数据*/
     public void saveProcess(ProcessDTO dto);
    /**更新数据*/
     public void updateProcess(ProcessDTO dto);
    /**删除数据*/
     public void deleteProcess(Long id);
    

}
