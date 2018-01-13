package com.eastern.maintenance.salary;

import com.eastern.maintenance.salary.controller.UserController;
import com.eastern.maintenance.salary.domain.Position;
import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.PositionService;
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
public class PositionServiceTests {

	@Autowired
	private PositionService positionService;
	@Test
	public void testAdd() {
		try {
			Position position = new Position();
			position.setPositionId("10");
			position.setPositionName("10");
			position.setCreateTime(new Date());
			position.setCreateUser("admin");
			positionService.add(position);
			Position checkPosition = positionService.findById("10");
			Assert.assertEquals(checkPosition.getPositionName(), "10");
			Assert.assertEquals(checkPosition.getCreateUser(), "admin");
		} finally {
			positionService.remove("10");
		}
	}

	@Test
	public void testUpdate() {
		try {
			Position position = new Position();
			position.setPositionId("10");
			position.setPositionName("10");
			position.setCreateTime(new Date());
			position.setCreateUser("admin");
			positionService.add(position);
			Position position1 = new Position();
			position1.setPositionId("10");
			position1.setPositionName("100");
			position1.setUpdateTime(new Date());
			position1.setUpdateUser("test");
			positionService.update(position1);
			Position checkPosition = positionService.findById("10");
			Assert.assertEquals(checkPosition.getPositionName(), "100");
			Assert.assertEquals(checkPosition.getUpdateUser(), "test");
		} finally {
			positionService.remove("10");
		}
	}

}
