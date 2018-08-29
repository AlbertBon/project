package com.bon.modules.process.service.impl;

import java.io.Serializable;
import java.util.*;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.exception.BusinessException;
import com.bon.common.util.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.bon.modules.process.domain.dto.*;
import com.bon.modules.process.domain.vo.*;
import com.bon.modules.process.domain.entity.*;
import com.bon.modules.process.dao.*;
import com.bon.modules.process.service.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtSetting服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class FormExtSettingServiceImpl implements FormExtSettingService {

    @Autowired
    private FormExtSettingMapper formExtSettingMapper;

    /**查询单个*/
    @Override
    public FormExtSettingVO getFormExtSetting(Long id) {
        FormExtSetting formExtSetting = formExtSettingMapper.selectByPrimaryKey(id);
        FormExtSettingVO vo = new FormExtSettingVO();
        BeanUtil.copyPropertys(formExtSetting, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listFormExtSetting(FormExtSettingListDTO dto){
        PageHelper.startPage(dto);
        List<FormExtSetting> list = formExtSettingMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<FormExtSettingVO> voList = new ArrayList<>();for (FormExtSetting formExtSetting : list) {
            FormExtSettingVO vo = new FormExtSettingVO();
            BeanUtil.copyPropertys(formExtSetting, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public Long saveFormExtSetting(FormExtSettingDTO dto) {
        FormExtSetting formExtSetting = new FormExtSetting();
        BeanUtil.copyPropertys(dto, formExtSetting);
        formExtSetting.setOptionId(null);
        formExtSetting.setGmtCreate(new Date());
        formExtSetting.setGmtModified(new Date());
        formExtSettingMapper.insertSelective(formExtSetting);
        return formExtSetting.getOptionId();
    }
    /**更新数据*/
    @Override
    public void updateFormExtSetting(FormExtSettingDTO dto) {
        FormExtSetting formExtSetting = new FormExtSetting();        BeanUtil.copyPropertys(dto, formExtSetting);
        formExtSetting.setGmtModified(new Date());
        formExtSettingMapper.updateByPrimaryKeySelective(formExtSetting);
    }
    /**删除数据*/
    @Override
    public void deleteFormExtSetting(Long id) {
        formExtSettingMapper.deleteByPrimaryKey(id);
    }
    

}
