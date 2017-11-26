package com.eastern.maintenance.salary;

import com.eastern.maintenance.salary.controller.UserController;
import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

	@Autowired
	private UserController userController;

	@Autowired
	private UserService userService;
	@Test
	public void testAdd() {
		try {
			User user = new User();
			user.setUserId("2");
			user.setUserName("admin");
			user.setCreateTime(new Date());
			user.setCreateUser("admin");
			user.setPositionId("1");
			userService.add(user);
			User checkUser = userService.findById("2");
			Assert.assertEquals(checkUser.getUserName(), "admin");
			Assert.assertEquals(checkUser.getCreateUser(), "admin");
		} finally {
			userService.remove("2");
		}
	}

	@Test
	public void testUpdate() {
		try {
			User user = new User();
			user.setUserId("2");
			user.setUserName("admin");
			user.setCreateTime(new Date());
			user.setCreateUser("admin");
			user.setPositionId("1");
			userService.add(user);
			User newUser = new User();
			newUser.setUserId("2");
			newUser.setUserName("test");
			newUser.setCreateUser("test");
			userService.update(newUser);
			User checkUser = userService.findById("2");
			Assert.assertEquals(checkUser.getUserName(), "test");
			Assert.assertEquals(checkUser.getCreateUser(), "test");
		} finally {
			userService.remove("2");
		}
	}

}
