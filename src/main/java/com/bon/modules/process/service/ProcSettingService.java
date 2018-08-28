package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.ProcSetting;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-25
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcSetting服务接口类
 * @Email: 502285815@qq.com
*/
public interface ProcSettingService {
    /**查询单个*/
     public ProcSettingVO getProcSetting(Long id);
    /**查询列表*/
     public PageVO listProcSetting(ProcSettingListDTO dto);
    /**保存数据*/
     public Long saveProcSetting(ProcSettingDTO dto);
    /**更新数据*/
     public void updateProcSetting(ProcSettingDTO dto);
    /**删除数据*/
     public void deleteProcSetting(Long id);
    /**批量更新数据*/
    public void updateBatchProcSetting(List<ProcSettingDTO> dtoList);

}
