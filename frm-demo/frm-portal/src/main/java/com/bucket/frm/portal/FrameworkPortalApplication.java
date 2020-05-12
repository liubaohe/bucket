package com.bucket.frm.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: bucket
 * @description: portal启动类
 * @author: liu.baohe
 * @create: 2020-05-09 16:47
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.bucket.frm.common.*","com.bucket.frm.portal.*","com.bucket.frm.security.*"})
@EnableTransactionManagement
@MapperScan({"com.bucket.frm.mbg.mapper","com.bucket.frm.portal.dao"})
public class FrameworkPortalApplication {
    public static void main(String[] args){
        SpringApplication.run(FrameworkPortalApplication.class);
    }
}
