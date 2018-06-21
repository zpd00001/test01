package com.example.demo.service;

import com.example.demo.entity.Sysuser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zp
 * @since 2018-06-15
 */
public interface SysuserService extends IService<Sysuser> {
    /**
     * 保存USER
     * @param sysuser
     * @return
     */
    int insertUser(Sysuser sysuser);

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int deleteUser(long id);

    /**
     * 根据主键查询对象
     * @param id
     * @return
     */
    Sysuser getUser(long id);

    /**
     * 根据主键修改对象
     * @param sysuser
     * @return
     */
    int editUser(Sysuser sysuser);
}
