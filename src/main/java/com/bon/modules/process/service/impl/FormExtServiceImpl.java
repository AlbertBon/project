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
 * @Description: FormExt服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class FormExtServiceImpl implements FormExtService {

    @Autowired
    private FormExtMapper formExtMapper;

    /**查询单个*/
    @Override
    public FormExtVO getFormExt(Long id) {
        FormExt formExt = formExtMapper.selectByPrimaryKey(id);
        FormExtVO vo = new FormExtVO();
        BeanUtil.copyPropertys(formExt, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listFormExt(FormExtListDTO dto){
        PageHelper.startPage(dto);
        List<FormExt> list = formExtMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<FormExtVO> voList = new ArrayList<>();for (FormExt formExt : list) {
            FormExtVO vo = new FormExtVO();
            BeanUtil.copyPropertys(formExt, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public void saveFormExt(FormExtDTO dto) {
        FormExt formExt = new FormExt();
        BeanUtil.copyPropertys(dto, formExt);
        formExt.setFormExtId(null);
        formExt.setGmtCreate(new Date());
        formExt.setGmtModified(new Date());
        formExtMapper.insertSelective(formExt);
    }
    /**更新数据*/
    @Override
    public void updateFormExt(FormExtDTO dto) {
        FormExt formExt = formExtMapper.selectByPrimaryKey(dto.getFormExtId());
        if (formExt == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, formExt);
        formExt.setGmtModified(new Date());
        formExtMapper.updateByPrimaryKeySelective(formExt);
    }
    /**删除数据*/
    @Override
    public void deleteFormExt(Long id) {
        formExtMapper.deleteByPrimaryKey(id);
    }
    

}
