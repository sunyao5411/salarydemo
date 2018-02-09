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
			salary.setUserName("admin");
			salary.setCoefficient(1.6f);
            salary.setKpi(894f);
            salary.setLabor(133f);
            salary.setLaborBonus(3273f);
            salary.setPassSmall(61);
            salary.setPassBig(0);
            salary.setAdjust(1200);
            salary.setPassBonus(915);
            salary.setCompactSalary(6283);
            salary.setTestResult(104);
            salary.setExamineBonus(643);
            salary.setTotalSalary(6925);
            salary.setYear(2018);
            salary.setMonth(2);
            Date date = new Date();
            salary.setCreateTime(date);
            salary.setCreateUser("admin");
            salary.setDescription("test");
            salaryService.create(salary);
            id = salary.getSalaryId();
            Salary checkSalary = salaryService.findById(id);
            Assert.assertEquals(checkSalary.getUserId(), "1");
            Assert.assertEquals(checkSalary.getUserName(), "admin");
            Assert.assertEquals(String.valueOf(checkSalary.getCoefficient()), String.valueOf(1.6f));
            Assert.assertEquals(String.valueOf(checkSalary.getKpi()), String.valueOf(894f));
            Assert.assertEquals(String.valueOf(checkSalary.getLabor()), String.valueOf(133f));
            Assert.assertEquals(String.valueOf(checkSalary.getLaborBonus()), String.valueOf(3273f));
            Assert.assertEquals(checkSalary.getPassSmall(), 61);
            Assert.assertEquals(checkSalary.getPassBig(), 0);
            Assert.assertEquals(checkSalary.getAdjust(), 1200);
            Assert.assertEquals(checkSalary.getPassBonus(), 915);
            Assert.assertEquals(checkSalary.getCompactSalary(), 6283);
            Assert.assertEquals(checkSalary.getTestResult(), 104);
            Assert.assertEquals(checkSalary.getExamineBonus(), 643);
            Assert.assertEquals(checkSalary.getTotalSalary(), 6925);
            Assert.assertEquals(checkSalary.getYear(), 2018);
            Assert.assertEquals(checkSalary.getMonth(), 2);
            Assert.assertEquals(checkSalary.getCreateTime().toString(), date.toString());
            System.out.println("#### Date to string : " + date.toString());
            Assert.assertEquals(checkSalary.getCreateUser(), "admin");
            Assert.assertEquals(checkSalary.getDescription(), "test");
			List<Salary> salaryList = salaryService.queryAll();
			for (Salary s : salaryList) {
				System.out.println("### user name: " + s.getUserName());
			}
		} finally {
//			if (id != null) {
//				salaryService.remove(id);
//			}
		}
	}

	@Test
	public void testUpdate() {
        String id = "";
		try {
            Salary salary = new Salary();
            salary.setUserId("1");
            salary.setUserName("admin");
            salary.setCoefficient(1.6f);
            salary.setKpi(894f);
            salary.setLabor(133f);
            salary.setLaborBonus(3273f);
            salary.setPassSmall(61);
            salary.setPassBig(0);
            salary.setAdjust(1200);
            salary.setPassBonus(915);
            salary.setCompactSalary(6283);
            salary.setTestResult(104);
            salary.setExamineBonus(643);
            salary.setTotalSalary(6925);
            salary.setYear(2018);
            salary.setMonth(2);
            Date date = new Date();
            salary.setCreateTime(date);
            salary.setCreateUser("admin");
            salary.setDescription("test");
            salaryService.create(salary);
            id = salary.getSalaryId();
            Salary newSalary = salaryService.findById(id);
            newSalary.setUserId("2");
            newSalary.setUserName("admin123");
            newSalary.setCoefficient(1.0f);
            newSalary.setKpi(900f);
            newSalary.setLabor(100f);
            newSalary.setLaborBonus(3000f);
            newSalary.setPassSmall(60);
            newSalary.setPassBig(1);
            newSalary.setAdjust(1500);
            newSalary.setPassBonus(1000);
            newSalary.setCompactSalary(7000);
            newSalary.setTestResult(100);
            newSalary.setExamineBonus(600);
            newSalary.setTotalSalary(7000);
            newSalary.setYear(2019);
            newSalary.setMonth(5);
            Date date1 = new Date();
            newSalary.setUpdateTime(date1);
            newSalary.setUpdateUser("admin1");
            newSalary.setDescription("test123");
            salaryService.update(newSalary);
            Salary checkSalary = salaryService.findById(id);
            Assert.assertEquals(checkSalary.getUserId(), "2");
            Assert.assertEquals(checkSalary.getUserName(), "admin123");
            Assert.assertEquals(String.valueOf(checkSalary.getCoefficient()), String.valueOf(1.0f));
            Assert.assertEquals(String.valueOf(checkSalary.getKpi()), String.valueOf(900f));
            Assert.assertEquals(String.valueOf(checkSalary.getLabor()), String.valueOf(100f));
            Assert.assertEquals(String.valueOf(checkSalary.getLaborBonus()), String.valueOf(3000f));
            Assert.assertEquals(checkSalary.getPassSmall(), 60);
            Assert.assertEquals(checkSalary.getPassBig(), 1);
            Assert.assertEquals(checkSalary.getAdjust(), 1500);
            Assert.assertEquals(checkSalary.getPassBonus(), 1000);
            Assert.assertEquals(checkSalary.getCompactSalary(), 7000);
            Assert.assertEquals(checkSalary.getTestResult(), 100);
            Assert.assertEquals(checkSalary.getExamineBonus(), 600);
            Assert.assertEquals(checkSalary.getTotalSalary(), 7000);
            Assert.assertEquals(checkSalary.getYear(), 2019);
            Assert.assertEquals(checkSalary.getMonth(), 5);
            Assert.assertEquals(checkSalary.getCreateTime().toString(), date.toString());
            Assert.assertEquals(checkSalary.getCreateUser(), "admin");
            Assert.assertEquals(checkSalary.getUpdateTime().toString(), date1.toString());
            Assert.assertEquals(checkSalary.getUpdateUser(), "admin1");
            Assert.assertEquals(checkSalary.getDescription(), "test123");
		} finally {
			if (id != null) {
				salaryService.remove(id);
			}
		}
	}

}
