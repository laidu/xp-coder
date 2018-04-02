package org.xp.coder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xp.coder.web.entity.DemoTable;
import org.xp.coder.web.mapper.DemoTableMapper;

/**
 * demo controller
 * <p>
 * Created by tiancai.zang
 * on 2018-04-02 23:07.
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoTableMapper demoTableMapper;

    @PostMapping("/add")
    public int add(@RequestBody DemoTable demo){
       return demoTableMapper.insert(demo);
    }

}