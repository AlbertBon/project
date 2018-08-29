package com.bon.modules.apply.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.apply.domain.dto.*;
import com.bon.modules.apply.domain.entity.Apply;
import com.bon.modules.apply.domain.vo.*;



/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: Apply服务接口类
 * @Email: 502285815@qq.com
*/
public interface ApplyService {
    /**查询单个*/
     public ApplyVO getApply(Long id);
    /**查询列表*/
     public PageVO listApply(ApplyListDTO dto);
    /**保存数据*/
     public Long saveApply(ApplyDTO dto);
    /**更新数据*/
     public void updateApply(ApplyDTO dto);
    /**删除数据*/
     public void deleteApply(Long id);
    

}
