package com.example.demo;

import com.example.demo.controller.SysuserController;
import com.example.demo.entity.Sysuser;
import com.example.demo.service.SysuserService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ControllerTest {
	@Mock
	private SysuserService sysuserService;

	@InjectMocks
	private SysuserController sysuserController;

	@BeforeMethod
	public void initMock(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void contextLoads() {
		when(sysuserService.deleteUser(anyLong())).thenReturn(1);
		when(sysuserService.editUser(any())).thenReturn(1);
		when(sysuserService.insertUser(any())).thenReturn(1);
		when(sysuserService.getUser(anyLong())).thenReturn(new Sysuser(111L,"Champions"));
		Assert.assertEquals(sysuserController.deleteUser(22L),sysuserService.deleteUser(22L));
		Assert.assertEquals(sysuserController.addUser(new Sysuser(111L,"mapla")),sysuserService.insertUser(new Sysuser(111L,"mapla")));
		Assert.assertEquals(sysuserController.editUser(new Sysuser(111L,"alpha")),sysuserService.editUser(new Sysuser(111L,"alpha")));
		Assert.assertEquals(sysuserController.getUser(111L),sysuserService.getUser(111L));

	}

}
