package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.ProcDecision;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-24
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision服务接口类
 * @Email: 502285815@qq.com
*/
public interface ProcDecisionService {
    /**查询单个*/
     public ProcDecisionVO getProcDecision(Long id);
    /**查询列表*/
     public PageVO listProcDecision(ProcDecisionListDTO dto);
    /**保存数据*/
     public void saveProcDecision(ProcDecisionDTO dto);
    /**更新数据*/
     public void updateProcDecision(ProcDecisionDTO dto);
    /**删除数据*/
     public void deleteProcDecision(Long id);
    

}
