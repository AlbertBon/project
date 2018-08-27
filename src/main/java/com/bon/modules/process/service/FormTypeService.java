package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.FormType;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: FormType服务接口类
 * @Email: 502285815@qq.com
*/
public interface FormTypeService {
    /**查询单个*/
     public FormTypeVO getFormType(Long id);
    /**查询列表*/
     public PageVO listFormType(FormTypeListDTO dto);
    /**保存数据*/
     public void saveFormType(FormTypeDTO dto);
    /**更新数据*/
     public void updateFormType(FormTypeDTO dto);
    /**删除数据*/
     public void deleteFormType(Long id);
    

}
