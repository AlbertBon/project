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
 * @Created：2018-08-27
 * @Author Albert
 * @Version: 1.0
 * @Description: FormExtTab服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class FormExtTabServiceImpl implements FormExtTabService {

    @Autowired
    private FormExtTabMapper formExtTabMapper;

    /**查询单个*/
    @Override
    public FormExtTabVO getFormExtTab(Long id) {
        FormExtTab formExtTab = formExtTabMapper.selectByPrimaryKey(id);
        FormExtTabVO vo = new FormExtTabVO();
        BeanUtil.copyPropertys(formExtTab, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listFormExtTab(FormExtTabListDTO dto){
        PageHelper.startPage(dto);
        List<FormExtTab> list = formExtTabMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<FormExtTabVO> voList = new ArrayList<>();for (FormExtTab formExtTab : list) {
            FormExtTabVO vo = new FormExtTabVO();
            BeanUtil.copyPropertys(formExtTab, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public void saveFormExtTab(FormExtTabDTO dto) {
        FormExtTab formExtTab = new FormExtTab();
        BeanUtil.copyPropertys(dto, formExtTab);
        formExtTab.setTabId(null);
        formExtTab.setGmtCreate(new Date());
        formExtTab.setGmtModified(new Date());
        formExtTabMapper.insertSelective(formExtTab);
    }
    /**更新数据*/
    @Override
    public void updateFormExtTab(FormExtTabDTO dto) {
        FormExtTab formExtTab = formExtTabMapper.selectByPrimaryKey(dto.getTabId());
        if (formExtTab == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, formExtTab);
        formExtTab.setGmtModified(new Date());
        formExtTabMapper.updateByPrimaryKeySelective(formExtTab);
    }
    /**删除数据*/
    @Override
    public void deleteFormExtTab(Long id) {
        formExtTabMapper.deleteByPrimaryKey(id);
    }
    

}
