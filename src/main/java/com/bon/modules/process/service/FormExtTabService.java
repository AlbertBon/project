package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.FormExtTab;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtTab服务接口类
 * @Email: 502285815@qq.com
*/
public interface FormExtTabService {
    /**查询单个*/
     public FormExtTabVO getFormExtTab(Long id);
    /**查询列表*/
     public PageVO listFormExtTab(FormExtTabListDTO dto);
    /**保存数据*/
     public Long saveFormExtTab(FormExtTabDTO dto);
    /**更新数据*/
     public void updateFormExtTab(FormExtTabDTO dto);
    /**删除数据*/
     public void deleteFormExtTab(Long id);
    

}
