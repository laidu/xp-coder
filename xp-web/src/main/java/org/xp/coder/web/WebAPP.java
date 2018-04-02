package org.xp.coder.web;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * web app
 * <p>
 * Created by tiancai.zang
 * on 2018-04-02 23:08.
 */
@Slf4j
@SpringBootApplication
@MapperScan("org.xp.coder.web.mapper")
public class WebAPP {

    public static void main(String[] args) {

        SpringApplication.run(WebAPP.class);
    }
}