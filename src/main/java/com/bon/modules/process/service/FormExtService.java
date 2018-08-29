package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.FormExt;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExt服务接口类
 * @Email: 502285815@qq.com
*/
public interface FormExtService {
    /**查询单个*/
     public FormExtVO getFormExt(Long id);
    /**查询列表*/
     public PageVO listFormExt(FormExtListDTO dto);
    /**保存数据*/
     public Long saveFormExt(FormExtDTO dto);
    /**更新数据*/
     public void updateFormExt(FormExtDTO dto);
    /**删除数据*/
     public void deleteFormExt(Long id);
    

}
