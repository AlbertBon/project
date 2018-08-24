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
 * @Created：2018-08-24
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcDecision服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class ProcDecisionServiceImpl implements ProcDecisionService {

    @Autowired
    private ProcDecisionMapper procDecisionMapper;

    /**查询单个*/
    @Override
    public ProcDecisionVO getProcDecision(Long id) {
        ProcDecision procDecision = procDecisionMapper.selectByPrimaryKey(id);
        ProcDecisionVO vo = new ProcDecisionVO();
        BeanUtil.copyPropertys(procDecision, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listProcDecision(ProcDecisionListDTO dto){
        PageHelper.startPage(dto);
        List<ProcDecision> list = procDecisionMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<ProcDecisionVO> voList = new ArrayList<>();for (ProcDecision procDecision : list) {
            ProcDecisionVO vo = new ProcDecisionVO();
            BeanUtil.copyPropertys(procDecision, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public void saveProcDecision(ProcDecisionDTO dto) {
        ProcDecision procDecision = new ProcDecision();
        BeanUtil.copyPropertys(dto, procDecision);
        procDecision.setDecisionId(null);
        procDecision.setGmtCreate(new Date());
        procDecision.setGmtModified(new Date());
        procDecisionMapper.insertSelective(procDecision);
    }
    /**更新数据*/
    @Override
    public void updateProcDecision(ProcDecisionDTO dto) {
        ProcDecision procDecision = procDecisionMapper.selectByPrimaryKey(dto.getDecisionId());
        if (procDecision == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, procDecision);
        procDecision.setGmtModified(new Date());
        procDecisionMapper.updateByPrimaryKeySelective(procDecision);
    }
    /**删除数据*/
    @Override
    public void deleteProcDecision(Long id) {
        procDecisionMapper.deleteByPrimaryKey(id);
    }
    

}
