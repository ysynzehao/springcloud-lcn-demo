package com.example.demo.service.impl;

import com.example.demo.dao.TestMapper;
import com.example.demo.entity.Test;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lorne on 2017/6/26.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> list() {
        return testMapper.findAll();
    }

    @Override
    @Transactional
    public int save() {

        int rs = testMapper.save("hello2");

        return rs;
    }
}
