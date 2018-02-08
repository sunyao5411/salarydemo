package com.eastern.maintenance.salary;

import com.eastern.maintenance.salary.domain.Salary;
import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.SalaryService;
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
public class SalaryServiceTests {

	@Autowired
	private SalaryService salaryService;
	@Test
	public void testAdd() {
	    String id = "";
		try {
			Salary salary = new Salary();
			salary.setUserId("1");
			salary.setCoefficient(1.6f);
            salary.setKpi(894f);
            salary.setLabor(3273);

//			salaryService.create(salary);
//			id = salary.getSalaryId();
//			User checkUser = salaryService.findById(id);
//			Assert.assertEquals(checkUser.getUserName(), "admin");
//			Assert.assertEquals(checkUser.getCreateUser(), "admin");
//			Assert.assertEquals(checkUser.getPassword(), "admin");
//			Assert.assertEquals(checkUser.getEmail(), "admin@yourcompany.com");
//			List<User> userList = salaryService.queryAll();
//			for (User u : userList) {
//				System.out.println("### user name: " + u.getUserName());
//			}
		} finally {
			if (id != null) {
				salaryService.remove(id);
			}
		}
	}

	@Test
	public void testUpdate() {
//        String userId = "";
//		try {
//			User user = new User();
//			user.setUserName("admin");
//			user.setPassword("admin");
//			user.setEmail("admin@yourcompany.com");
//			user.setCreateTime(new Date());
//			user.setCreateUser("admin");
//			user.setPositionId("1");
//			salaryService.create(user);
//			userId = user.getUserId();
//			User newUser = new User();
//			newUser.setUserId(userId);
//			newUser.setUserName("test");
//			newUser.setPassword("test");
//			newUser.setEmail("test@yourcompany.com");
//			newUser.setCreateUser("test");
//			salaryService.modify(newUser);
//			User checkUser = salaryService.findById(userId);
//			Assert.assertEquals(checkUser.getUserName(), "test");
//			Assert.assertEquals(checkUser.getCreateUser(), "test");
//			Assert.assertEquals(checkUser.getEmail(), "test@yourcompany.com");
//			Assert.assertEquals(checkUser.getPassword(), "test");
//		} finally {
//			if (userId != null) {
//				salaryService.remove(userId);
//			}
//		}
	}

}
