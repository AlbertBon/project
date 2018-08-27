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
 * @Created：2018-08-25
 * @Author Albert
 * @Version: 1.0
 * @Description: ProcSetting服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class ProcSettingServiceImpl implements ProcSettingService {

    @Autowired
    private ProcSettingMapper procSettingMapper;

    /**查询单个*/
    @Override
    public ProcSettingVO getProcSetting(Long id) {
        ProcSetting procSetting = procSettingMapper.selectByPrimaryKey(id);
        ProcSettingVO vo = new ProcSettingVO();
        BeanUtil.copyPropertys(procSetting, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listProcSetting(ProcSettingListDTO dto){
        PageHelper.startPage(dto);
        List<ProcSetting> list = procSettingMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<ProcSettingVO> voList = new ArrayList<>();for (ProcSetting procSetting : list) {
            ProcSettingVO vo = new ProcSettingVO();
            BeanUtil.copyPropertys(procSetting, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public Long saveProcSetting(ProcSettingDTO dto) {
        ProcSetting procSetting = new ProcSetting();
        BeanUtil.copyPropertys(dto, procSetting);
        procSetting.setNodeId(null);
        procSetting.setGmtCreate(new Date());
        procSetting.setGmtModified(new Date());
        procSetting.setNodeName(dto.getName());
        procSetting.setNodeWidth(dto.getWidth());
        procSetting.setNodeHeight(dto.getHeight());
        procSetting.setNodeLeft(dto.getLeft());
        procSetting.setNodeTop(dto.getTop());
        procSetting.setNodeType(dto.getType());
        procSettingMapper.insertSelective(procSetting);
        return procSetting.getNodeId();
    }
    /**更新数据*/
    @Override
    public void updateProcSetting(ProcSettingDTO dto) {
        ProcSetting procSetting = procSettingMapper.selectByPrimaryKey(dto.getNodeId());
        if (procSetting == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, procSetting);
        procSetting.setGmtModified(new Date());
        procSettingMapper.updateByPrimaryKeySelective(procSetting);
    }
    /**删除数据*/
    @Override
    public void deleteProcSetting(Long id) {
        procSettingMapper.deleteByPrimaryKey(id);
    }
    

}
