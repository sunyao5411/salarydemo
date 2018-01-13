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
public class UserServiceTests {

	@Autowired
	private UserService userService;
	@Test
	public void testAdd() {
	    String userId = "";
		try {
			User user = new User();
			user.setUserName("admin");
			user.setPassword("admin");
			user.setEmail("admin@yourcompany.com");
			user.setCreateTime(new Date());
			user.setCreateUser("admin");
			user.setPositionId("1");
			userService.add(user);
			userId = user.getUserId();
			User checkUser = userService.findById(userId);
			Assert.assertEquals(checkUser.getUserName(), "admin");
			Assert.assertEquals(checkUser.getCreateUser(), "admin");
			Assert.assertEquals(checkUser.getPassword(), "admin");
			Assert.assertEquals(checkUser.getEmail(), "admin@yourcompany.com");
		} finally {
			userService.remove(userId);
		}
	}

	@Test
	public void testUpdate() {
        String userId = "";
		try {
			User user = new User();
			user.setUserName("admin");
			user.setPassword("admin");
			user.setEmail("admin@yourcompany.com");
			user.setCreateTime(new Date());
			user.setCreateUser("admin");
			user.setPositionId("1");
			userService.add(user);
			userId = user.getUserId();
			User newUser = new User();
			newUser.setUserId(userId);
			newUser.setUserName("test");
			newUser.setPassword("test");
			newUser.setEmail("test@yourcompany.com");
			newUser.setCreateUser("test");
			userService.update(newUser);
			User checkUser = userService.findById(userId);
			Assert.assertEquals(checkUser.getUserName(), "test");
			Assert.assertEquals(checkUser.getCreateUser(), "test");
			Assert.assertEquals(checkUser.getEmail(), "test@yourcompany.com");
			Assert.assertEquals(checkUser.getPassword(), "test");
		} finally {
			userService.remove(userId);
		}
	}

}
