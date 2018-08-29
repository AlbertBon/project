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
 * @Description: FormType服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class FormTypeServiceImpl implements FormTypeService {

    @Autowired
    private FormTypeMapper formTypeMapper;

    /**查询单个*/
    @Override
    public FormTypeVO getFormType(Long id) {
        FormType formType = formTypeMapper.selectByPrimaryKey(id);
        FormTypeVO vo = new FormTypeVO();
        BeanUtil.copyPropertys(formType, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listFormType(FormTypeListDTO dto){
        PageHelper.startPage(dto);
        List<FormType> list = formTypeMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<FormTypeVO> voList = new ArrayList<>();for (FormType formType : list) {
            FormTypeVO vo = new FormTypeVO();
            BeanUtil.copyPropertys(formType, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public Long saveFormType(FormTypeDTO dto) {
        FormType formType = new FormType();
        BeanUtil.copyPropertys(dto, formType);
        formType.setFormTypeId(null);
        formType.setGmtCreate(new Date());
        formType.setGmtModified(new Date());
        formTypeMapper.insertSelective(formType);
        return formType.getFormTypeId();
    }
    /**更新数据*/
    @Override
    public void updateFormType(FormTypeDTO dto) {
        FormType formType = new FormType();        BeanUtil.copyPropertys(dto, formType);
        formType.setGmtModified(new Date());
        formTypeMapper.updateByPrimaryKeySelective(formType);
    }
    /**删除数据*/
    @Override
    public void deleteFormType(Long id) {
        formTypeMapper.deleteByPrimaryKey(id);
    }
    

}
