package com.bucket.frm.portal.service;

import com.bucket.frm.mbg.model.UmsAdmin;
import com.bucket.frm.mbg.model.UmsPermission;
import com.bucket.frm.mbg.model.UmsResource;
import com.bucket.frm.mbg.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
* @program: bucket
* @description:
* @author: liu.baohe
* @create: 2020-05-11 16:26
**/
public interface UmsAdminService {

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 根据用户名获取用户信息
     */
    UmsAdmin getAdminByUsername(String username);


    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);


    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);


    /**
     * 获取指定用户的可访问资源
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 获取用户对于角色
     */
    List<UmsRole> getRoleList(Long adminId);


    /**
     * 刷新token的功能
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);
}
