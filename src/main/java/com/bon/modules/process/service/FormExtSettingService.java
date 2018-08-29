package com.bon.modules.process.service;

import java.util.List;
import com.bon.common.domain.vo.PageVO;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.entity.FormExtSetting;
import com.bon.modules.process.domain.vo.*;



/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtSetting服务接口类
 * @Email: 502285815@qq.com
*/
public interface FormExtSettingService {
    /**查询单个*/
     public FormExtSettingVO getFormExtSetting(Long id);
    /**查询列表*/
     public PageVO listFormExtSetting(FormExtSettingListDTO dto);
    /**保存数据*/
     public Long saveFormExtSetting(FormExtSettingDTO dto);
    /**更新数据*/
     public void updateFormExtSetting(FormExtSettingDTO dto);
    /**删除数据*/
     public void deleteFormExtSetting(Long id);
    

}
