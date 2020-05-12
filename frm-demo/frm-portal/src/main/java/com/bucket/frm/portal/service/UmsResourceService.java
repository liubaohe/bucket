package com.bucket.frm.portal.service;

import com.bucket.frm.mbg.model.UmsResource;

import java.util.List;

/**
 * @program: bucket
 * @description:
 * @author: liu.baohe
 * @create: 2020-05-11 17:07
 **/
public interface UmsResourceService {
    /**
     * 获取资源详情
     */
    UmsResource getItem(Long id);

    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();
}
