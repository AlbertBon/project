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
 * @Description: ProcDeal服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class ProcDealServiceImpl implements ProcDealService {

    @Autowired
    private ProcDealMapper procDealMapper;

    /**查询单个*/
    @Override
    public ProcDealVO getProcDeal(Long id) {
        ProcDeal procDeal = procDealMapper.selectByPrimaryKey(id);
        ProcDealVO vo = new ProcDealVO();
        BeanUtil.copyPropertys(procDeal, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listProcDeal(ProcDealListDTO dto){
        PageHelper.startPage(dto);
        List<ProcDeal> list = procDealMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<ProcDealVO> voList = new ArrayList<>();for (ProcDeal procDeal : list) {
            ProcDealVO vo = new ProcDealVO();
            BeanUtil.copyPropertys(procDeal, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public Long saveProcDeal(ProcDealDTO dto) {
        ProcDeal procDeal = new ProcDeal();
        BeanUtil.copyPropertys(dto, procDeal);
        procDeal.setProcDealId(null);
        procDeal.setGmtCreate(new Date());
        procDeal.setGmtModified(new Date());
        procDealMapper.insertSelective(procDeal);
        return procDeal.getProcDealId();
    }
    /**更新数据*/
    @Override
    public void updateProcDeal(ProcDealDTO dto) {
        ProcDeal procDeal = new ProcDeal();        BeanUtil.copyPropertys(dto, procDeal);
        procDeal.setGmtModified(new Date());
        procDealMapper.updateByPrimaryKeySelective(procDeal);
    }
    /**删除数据*/
    @Override
    public void deleteProcDeal(Long id) {
        procDealMapper.deleteByPrimaryKey(id);
    }
    

}
