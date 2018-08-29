package com.bon.modules.apply.service.impl;

import java.io.Serializable;
import java.util.*;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.exception.BusinessException;
import com.bon.common.util.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.bon.modules.apply.domain.dto.*;
import com.bon.modules.apply.domain.vo.*;
import com.bon.modules.apply.domain.entity.Apply;
import com.bon.modules.apply.dao.*;
import com.bon.modules.apply.service.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Created：2018-08-29
 * @Author Albert
 * @Version: 1.0
 * @Description: Apply服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    /**查询单个*/
    @Override
    public ApplyVO getApply(Long id) {
        Apply apply = applyMapper.selectByPrimaryKey(id);
        ApplyVO vo = new ApplyVO();
        BeanUtil.copyPropertys(apply, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listApply(ApplyListDTO dto){
        PageHelper.startPage(dto);
        List<Apply> list = applyMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<ApplyVO> voList = new ArrayList<>();for (Apply apply : list) {
            ApplyVO vo = new ApplyVO();
            BeanUtil.copyPropertys(apply, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public Long saveApply(ApplyDTO dto) {
        Apply apply = new Apply();
        BeanUtil.copyPropertys(dto, apply);
        apply.setApplyId(null);
        apply.setGmtCreate(new Date());
        apply.setGmtModified(new Date());
        applyMapper.insertSelective(apply);
        return apply.getApplyId();
    }
    /**更新数据*/
    @Override
    public void updateApply(ApplyDTO dto) {
        Apply apply = new Apply();        BeanUtil.copyPropertys(dto, apply);
        apply.setGmtModified(new Date());
        applyMapper.updateByPrimaryKeySelective(apply);
    }
    /**删除数据*/
    @Override
    public void deleteApply(Long id) {
        applyMapper.deleteByPrimaryKey(id);
    }
    

}
