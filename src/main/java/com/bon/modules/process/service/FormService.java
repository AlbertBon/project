package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.Form;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: Form服务接口类
 * @Email: 502285815@qq.com
*/
public interface FormService {
    /**查询单个*/
     public FormVO getForm(Long id);
    /**查询列表*/
     public PageVO listForm(FormListDTO dto);
    /**保存数据*/
     public Long saveForm(FormDTO dto);
    /**更新数据*/
     public void updateForm(FormDTO dto);
    /**删除数据*/
     public void deleteForm(Long id);
    

}
