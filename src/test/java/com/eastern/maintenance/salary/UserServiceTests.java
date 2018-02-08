package com.eastern.maintenance.salary;

import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

	@Autowired
	private UserService userService;
	@Test
	public void testAdd() {
	    String id = "";
		try {
			User user = new User();
			user.setUserName("admin");
			user.setPassword("admin");
			user.setDisplayName("超级管理员");
			user.setEmail("admin@yourcompany.com");
			user.setCreateTime(new Date());
			user.setCreateUser("admin");
			user.setPositionId("1");
			userService.create(user);
			id = user.getUserId();
			User checkUser = userService.findById(id);
			Assert.assertEquals(checkUser.getUserName(), "admin");
			Assert.assertEquals(checkUser.getCreateUser(), "admin");
			Assert.assertEquals(checkUser.getPassword(), "admin");
			Assert.assertEquals(checkUser.getDisplayName(), "超级管理员");
			Assert.assertEquals(checkUser.getEmail(), "admin@yourcompany.com");
			List<User> userList = userService.queryAll();
			for (User u : userList) {
				System.out.println("### user name: " + u.getUserName());
			}
		} finally {
//			if (id != null) {
//				userService.remove(id);
//			}
		}
	}

	@Test
	public void testUpdate() {
        String id = "";
		try {
			User user = new User();
			user.setUserName("admin");
			user.setPassword("admin");
			user.setEmail("admin@yourcompany.com");
			user.setCreateTime(new Date());
			user.setCreateUser("admin");
			user.setPositionId("1");
			userService.create(user);
			id = user.getUserId();
			User newUser = new User();
			newUser.setUserId(id);
			newUser.setUserName("test");
			newUser.setPassword("test");
			newUser.setEmail("test@yourcompany.com");
			newUser.setCreateUser("test");
			userService.modify(newUser);
			User checkUser = userService.findById(id);
			Assert.assertEquals(checkUser.getUserName(), "test");
			Assert.assertEquals(checkUser.getCreateUser(), "test");
			Assert.assertEquals(checkUser.getEmail(), "test@yourcompany.com");
			Assert.assertEquals(checkUser.getPassword(), "test");
		} finally {
			if (id != null) {
				userService.remove(id);
			}
		}
	}

}
