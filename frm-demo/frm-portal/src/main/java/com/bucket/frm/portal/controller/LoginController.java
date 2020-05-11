package com.bucket.frm.portal.controller;


import com.bucket.frm.common.api.CommonResult;
import com.bucket.frm.common.exception.Asserts;
import com.bucket.frm.common.service.RedisService;
import com.bucket.frm.portal.dto.UserLoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: bucket
 * @description:
 * @author: liu.baohe
 * @create: 2020-05-09 16:41
 **/

@RestController
@Api(tags = "UmsAdminController", description = "用户管理")
@RequestMapping("/sso")
public class LoginController {
    @ApiOperation(value = "测试")
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public CommonResult test(){
        return CommonResult.validateFailed("用户名或密码错误");
    }
    @Autowired
    private RedisService redisService;
    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public CommonResult login(@RequestBody  @Valid UserLoginParam userLoginParam, BindingResult result) {
        redisService.set("tt","222");
        // 如果有参数校验失败，会将错误信息封装成对象组装在BindingResult里
        for (ObjectError error : result.getFieldErrors()) {
                System.out.println("======="+ error.getDefaultMessage());
        }
        String key=(String)redisService.get("tt");
        System.out.println(key);
        Asserts.fail(key);
        return CommonResult.validateFailed("用户名或密码错误");
    }

}
