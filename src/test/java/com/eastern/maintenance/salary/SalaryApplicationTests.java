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
public class SalaryApplicationTests {

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
			user.setCreator("admin");
			user.setPositionId("1");
			userService.addUser(user);
			User checkUser = userService.findUserById("2");
			Assert.assertEquals(checkUser.getUserName(), "admin");
			Assert.assertEquals(checkUser.getCreator(), "admin");
		} finally {
			userService.removeUser("2");
		}
	}

	@Test
	public void testUpdate() {
		try {
			User user = new User();
			user.setUserId("2");
			user.setUserName("admin");
			user.setCreateTime(new Date());
			user.setCreator("admin");
			user.setPositionId("1");
			userService.addUser(user);
			User newUser = new User();
			newUser.setUserId("2");
			newUser.setUserName("test");
			newUser.setCreator("test");
			userService.updateUser(newUser);
			User checkUser = userService.findUserById("2");
			Assert.assertEquals(checkUser.getUserName(), "test");
			Assert.assertEquals(checkUser.getCreator(), "test");
		} finally {
			userService.removeUser("2");
		}
	}

}
