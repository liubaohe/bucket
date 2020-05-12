package com.bucket.frm.portal.service;

import com.bucket.frm.mbg.model.UmsAdmin;
import com.bucket.frm.mbg.model.UmsResource;

import java.util.List;

/**
* @program: bucket
* @description:
* @author: liu.baohe
* @create: 2020-05-11 16:45
**/
public interface UmsAdminCacheService {


    /**
     * 获取缓存后台用户信息
     */
    UmsAdmin getAdmin(String username);

    /**
     * 设置缓存后台用户信息
     */
    void setAdmin(UmsAdmin admin);

    /**
     * 获取缓存后台用户资源列表
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 设置后台后台用户资源列表
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
