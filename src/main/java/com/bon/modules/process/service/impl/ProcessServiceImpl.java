package com.bon.modules.process.service.impl;

import java.io.Serializable;
import java.util.*;
import com.bon.common.domain.vo.PageVO;
import com.bon.common.exception.BusinessException;
import com.bon.common.util.BeanUtil;
import com.bon.modules.process.domain.entity.Process;
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
 * @Description: Process服务实现类
 * @Email: 502285815@qq.com
*/
@Service
@Transactional
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessMapper processMapper;

    /**查询单个*/
    @Override
    public ProcessVO getProcess(Long id) {
        Process process = processMapper.selectByPrimaryKey(id);
        ProcessVO vo = new ProcessVO();
        BeanUtil.copyPropertys(process, vo);
        return vo;
    }
    /**查询列表*/
      @Override
    public PageVO listProcess(ProcessListDTO dto){
        PageHelper.startPage(dto);
        List<Process> list = processMapper.selectByExample(dto.createExample());
        PageVO pageVO = new PageVO(list);
        List<ProcessVO> voList = new ArrayList<>();for (Process process : list) {
            ProcessVO vo = new ProcessVO();
            BeanUtil.copyPropertys(process, vo);
            voList.add(vo);
        }
        pageVO.setList(voList);
        return pageVO;
    }
    /**保存数据*/
    @Override
    public void saveProcess(ProcessDTO dto) {
        Process process = new Process();
        BeanUtil.copyPropertys(dto, process);
        process.setProcessId(null);
        process.setGmtCreate(new Date());
        process.setGmtModified(new Date());
        processMapper.insertSelective(process);
    }
    /**更新数据*/
    @Override
    public void updateProcess(ProcessDTO dto) {
        Process process = processMapper.selectByPrimaryKey(dto.getProcessId());
        if (process == null) {
            throw new BusinessException("获取信息失败");
        }
        BeanUtil.copyPropertys(dto, process);
        process.setGmtModified(new Date());
        processMapper.updateByPrimaryKeySelective(process);
    }
    /**删除数据*/
    @Override
    public void deleteProcess(Long id) {
        processMapper.deleteByPrimaryKey(id);
    }
    

}
