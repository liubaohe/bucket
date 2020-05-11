package com.bucket.frm.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: bucket
 * @description: portal启动类
 * @author: liu.baohe
 * @create: 2020-05-09 16:47
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.bucket.frm.common","com.bucket.frm.portal"})
public class FrameworkPortalApplication {
    public static void main(String[] args){
        SpringApplication.run(FrameworkPortalApplication.class);
    }
}
