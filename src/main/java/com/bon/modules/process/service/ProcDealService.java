package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.ProcDeal;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDeal服务接口类
 * @Email: 502285815@qq.com
*/
public interface ProcDealService {
    /**查询单个*/
     public ProcDealVO getProcDeal(Long id);
    /**查询列表*/
     public PageVO listProcDeal(ProcDealListDTO dto);
    /**保存数据*/
     public void saveProcDeal(ProcDealDTO dto);
    /**更新数据*/
     public void updateProcDeal(ProcDealDTO dto);
    /**删除数据*/
     public void deleteProcDeal(Long id);
    

}
