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
 * @Description: FormExtGroup服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class FormExtGroupServiceImpl implements FormExtGroupService {

    @Autowired
    private FormExtGroupMapper formExtGroupMapper;

    /**查询单个*/
    @Override
    public FormExtGroupVO getFormExtGroup(Long id) {
        FormExtGroup formExtGroup = formExtGroupMapper.selectByPrimaryKey(id);
        FormExtGroupVO vo = new FormExtGroupVO();
        BeanUtil.copyPropertys(formExtGroup, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listFormExtGroup(FormExtGroupListDTO dto){
        PageHelper.startPage(dto);
        List<FormExtGroup> list = formExtGroupMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<FormExtGroupVO> voList = new ArrayList<>();for (FormExtGroup formExtGroup : list) {
            FormExtGroupVO vo = new FormExtGroupVO();
            BeanUtil.copyPropertys(formExtGroup, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public void saveFormExtGroup(FormExtGroupDTO dto) {
        FormExtGroup formExtGroup = new FormExtGroup();
        BeanUtil.copyPropertys(dto, formExtGroup);
        formExtGroup.setExtGroupId(null);
        formExtGroup.setGmtCreate(new Date());
        formExtGroup.setGmtModified(new Date());
        formExtGroupMapper.insertSelective(formExtGroup);
    }
    /**更新数据*/
    @Override
    public void updateFormExtGroup(FormExtGroupDTO dto) {
        FormExtGroup formExtGroup = formExtGroupMapper.selectByPrimaryKey(dto.getExtGroupId());
        if (formExtGroup == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, formExtGroup);
        formExtGroup.setGmtModified(new Date());
        formExtGroupMapper.updateByPrimaryKeySelective(formExtGroup);
    }
    /**删除数据*/
    @Override
    public void deleteFormExtGroup(Long id) {
        formExtGroupMapper.deleteByPrimaryKey(id);
    }
    

}
