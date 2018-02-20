package com.eastern.maintenance.salary.service;

import com.eastern.maintenance.salary.dao.SalaryDao;
import com.eastern.maintenance.salary.domain.Salary;
import com.eastern.maintenance.salary.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SalaryService {
    @Autowired
    private SalaryDao salaryDao;

    public void create(Salary Salary) {
        Salary.setSalaryId(IDGenerator.generateUniqueId());
        salaryDao.add(Salary);
    }

    public void update(Salary Salary) {
        salaryDao.update(Salary);
    }

    public void remove(String SalaryId) {
        salaryDao.remove(SalaryId);
    }

    public Salary findById(String SalaryId) {
        return salaryDao.findById(SalaryId);
    }

    public List<Salary> queryAll() {
        return this.salaryDao.list();
    }
}
