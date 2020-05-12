package com.bucket.frm.portal.dto;


import com.bucket.frm.portal.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @program: bucket
 * @description: 用户请求登录对象封装
 * @author: liu.baohe
 * @create: 2020-05-09 16:38
 **/
@Data
public class UserLoginParam {

    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    @Size(min = 6, max = 11, message = "账号长度必须是6-11个字符")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
//    @ApiModelProperty(value = "用户头像")
//    private String icon;
//    @ApiModelProperty(value = "邮箱")
//    @Email(message = "邮箱格式不合法")
//    private String email;
//    @ApiModelProperty(value = "用户昵称")
//    private String nickName;
//    @ApiModelProperty(value = "备注")
//    //自定义验证，值为1或2或3，其他均不可通过验证
//    @FlagValidator(value = {"1","2","3"})
//    private String note;
}
