package com.bucket.frm.portal.dao;


import com.bucket.frm.mbg.model.UmsPermission;
import com.bucket.frm.mbg.model.UmsResource;
import com.bucket.frm.mbg.model.UmsRole;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
* @program: bucket
*
* @description: 
*
* @author: liu.baohe
*
* @create: 2020-05-11 16:57
**/
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
