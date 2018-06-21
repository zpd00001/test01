package com.example.demo.service.impl;

import com.example.demo.entity.Sysuser;
import com.example.demo.mapper.SysuserMapper;
import com.example.demo.service.SysuserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zp
 * @since 2018-06-15
 */
@Service
public class SysuserServiceImpl extends ServiceImpl<SysuserMapper, Sysuser> implements SysuserService {

    private SysuserMapper sysuserMapper;

    public SysuserServiceImpl(SysuserMapper sysuserMapper){
        this.sysuserMapper = sysuserMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(Sysuser sysuser){
        return sysuserMapper.insert(sysuser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteUser(long id){
        return sysuserMapper.deleteById(id);
    }

    @Override
    public Sysuser getUser(long id){
        return sysuserMapper.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int editUser(Sysuser sysuser) {
        return sysuserMapper.updateById(sysuser);
    }
}
