package com.example.demo;


import com.example.demo.entity.Sysuser;
import com.example.demo.mapper.SysuserMapper;
import com.example.demo.service.impl.SysuserServiceImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ServiceMockTest {
    @Mock
    private SysuserMapper sysuserMapper;

    @InjectMocks
    private SysuserServiceImpl sysuserServiceImpl;

    private Sysuser sysuser;
    @BeforeMethod
    public void initMock(){
        MockitoAnnotations.initMocks(this);
        sysuser = new Sysuser(222L,"Sun");
        when(sysuserMapper.insert(sysuser)).thenReturn(1);
        when(sysuserMapper.deleteById(anyLong())).thenReturn(1);
        when(sysuserMapper.updateById(any())).thenReturn(1);
        when(sysuserMapper.selectById(anyLong())).thenReturn(sysuser);
    }

    @Test
    public void test(){
        Assert.assertEquals(sysuserServiceImpl.insertUser(sysuser),1);
        Assert.assertEquals(1,sysuserServiceImpl.deleteUser(33L));
        Assert.assertEquals(1,sysuserServiceImpl.editUser(sysuser));
        Assert.assertEquals(sysuser,sysuserServiceImpl.getUser(22L));
        Mockito.verify(sysuserMapper).insert(sysuser);
    }
}
