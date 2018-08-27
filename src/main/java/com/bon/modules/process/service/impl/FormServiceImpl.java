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
 * @Description: Form服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class FormServiceImpl implements FormService {

    @Autowired
    private FormMapper formMapper;

    /**查询单个*/
    @Override
    public FormVO getForm(Long id) {
        Form form = formMapper.selectByPrimaryKey(id);
        FormVO vo = new FormVO();
        BeanUtil.copyPropertys(form, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listForm(FormListDTO dto){
        PageHelper.startPage(dto);
        List<Form> list = formMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<FormVO> voList = new ArrayList<>();for (Form form : list) {
            FormVO vo = new FormVO();
            BeanUtil.copyPropertys(form, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public void saveForm(FormDTO dto) {
        Form form = new Form();
        BeanUtil.copyPropertys(dto, form);
        form.setFormId(null);
        form.setGmtCreate(new Date());
        form.setGmtModified(new Date());
        formMapper.insertSelective(form);
    }
    /**更新数据*/
    @Override
    public void updateForm(FormDTO dto) {
        Form form = formMapper.selectByPrimaryKey(dto.getFormId());
        if (form == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, form);
        form.setGmtModified(new Date());
        formMapper.updateByPrimaryKeySelective(form);
    }
    /**删除数据*/
    @Override
    public void deleteForm(Long id) {
        formMapper.deleteByPrimaryKey(id);
    }
    

}
