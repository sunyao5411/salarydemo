package com.eastern.maintenance.salary.dao;

import com.eastern.maintenance.salary.domain.Salary;

import java.util.List;

public interface SalaryDao {
    
    Salary findById(String salaryId);

    void update(Salary salary);

    void remove(String salaryId);

    void add(Salary salary);

    List<Salary> list();
}
