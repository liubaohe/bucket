package com.bucket.frm.portal.service.impl;

import com.bucket.frm.mbg.mapper.UmsResourceMapper;
import com.bucket.frm.mbg.model.UmsResource;
import com.bucket.frm.mbg.model.UmsResourceExample;
import com.bucket.frm.portal.service.UmsAdminCacheService;
import com.bucket.frm.portal.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: bucket
 * @description:
 * @author: liu.baohe
 * @create: 2020-05-11 17:08
 **/
@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Autowired
    private UmsResourceMapper resourceMapper;
    @Autowired
    private UmsAdminCacheService adminCacheService;

    @Override
    public UmsResource getItem(Long id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }
}
