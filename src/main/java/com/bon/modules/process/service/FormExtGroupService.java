package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.FormExtGroup;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtGroup服务接口类
 * @Email: 502285815@qq.com
*/
public interface FormExtGroupService {
    /**查询单个*/
     public FormExtGroupVO getFormExtGroup(Long id);
    /**查询列表*/
     public PageVO listFormExtGroup(FormExtGroupListDTO dto);
    /**保存数据*/
     public Long saveFormExtGroup(FormExtGroupDTO dto);
    /**更新数据*/
     public void updateFormExtGroup(FormExtGroupDTO dto);
    /**删除数据*/
     public void deleteFormExtGroup(Long id);
    

}
