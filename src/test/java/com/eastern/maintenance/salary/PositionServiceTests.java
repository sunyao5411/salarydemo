package com.eastern.maintenance.salary;

import com.eastern.maintenance.salary.domain.Position;
import com.eastern.maintenance.salary.service.PositionService;
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
public class PositionServiceTests {

	@Autowired
	private PositionService positionService;
	@Test
	public void testAdd() {
		String id = null;
		try {
			Position position = new Position();
			position.setPositionName("10");
			Date date = new Date();
			position.setCreateTime(date);
			position.setCreateUser("admin");
			positionService.create(position);
			id = position.getPositionId();
			Position checker = positionService.findById(id);
			Assert.assertEquals(checker.getPositionName(), "10");
			Assert.assertEquals(checker.getCreateUser(), "admin");
			Assert.assertEquals(checker.getCreateTime().toString(), date.toString());
			List<Position> positionList = positionService.queryAll();
			for (Position p : positionList) {
				System.out.println("### position name: " + p.getPositionName());
			}
		} finally {
			if (id != null) {
				positionService.remove(id);
			}
		}
	}

	@Test
	public void testUpdate() {
		String id = null;
		try {
			Position position = new Position();
			position.setPositionName("10");
			position.setCreateTime(new Date());
			position.setCreateUser("admin");
			positionService.create(position);
			id = position.getPositionId();
			Position position1 = new Position();
			position1.setPositionId(id);
			position1.setPositionName("100");
			Date date = new Date();
			position1.setUpdateTime(date);
			position1.setUpdateUser("test");
			positionService.update(position1);
			Position checker = positionService.findById(id);
			Assert.assertEquals(checker.getPositionName(), "100");
			Assert.assertEquals(checker.getUpdateUser(), "test");
			Assert.assertEquals(checker.getUpdateTime().toString(), date.toString());
		} finally {
			if (id != null) {
				positionService.remove(id);
			}
		}
	}

}
