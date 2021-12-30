package com.cailei.service.impl;

import com.cailei.mapper.EmpMapper;
import com.cailei.pojo.Emp;
import com.cailei.service.EmpService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public List<Emp> findByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        List<Emp> pageList = empMapper.findAll();

        return pageList;
    }
}
