package com.eastern.maintenance.salary.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class Salary implements Serializable{
    private String salaryId;
    private String userId;
    private String userName;
    private float coefficient;
    private float kpi;
    private float labor;
    private float laborBonus;
    private int passSmall;
    private int passBig;
    private long adjust;
    private long passBonus;
    private long compactSalary;
    private int testResult;
    private int examineBonus;
    private int year;
    private int month;
    private long totalSalary;
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;
    private String description;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }
    public String getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public float getKpi() {
        return kpi;
    }

    public void setKpi(float kpi) {
        this.kpi = kpi;
    }

    public float getLabor() {
        return labor;
    }

    public void setLabor(float labor) {
        this.labor = labor;
    }

    public float getLaborBonus() {
        return laborBonus;
    }

    public void setLaborBonus(float laborBonus) {
        this.laborBonus = laborBonus;
    }

    public int getPassSmall() {
        return passSmall;
    }

    public void setPassSmall(int passSmall) {
        this.passSmall = passSmall;
    }

    public int getPassBig() {
        return passBig;
    }

    public void setPassBig(int passBig) {
        this.passBig = passBig;
    }

    public long getAdjust() {
        return adjust;
    }

    public void setAdjust(long adjust) {
        this.adjust = adjust;
    }

    public long getPassBonus() {
        return passBonus;
    }

    public void setPassBonus(long passBonus) {
        this.passBonus = passBonus;
    }

    public long getCompactSalary() {
        return compactSalary;
    }

    public void setCompactSalary(long compactSalary) {
        this.compactSalary = compactSalary;
    }

    public int getTestResult() {
        return testResult;
    }

    public void setTestResult(int testResult) {
        this.testResult = testResult;
    }

    public int getExamineBonus() {
        return examineBonus;
    }

    public void setExamineBonus(int examineBonus) {
        this.examineBonus = examineBonus;
    }

    public long getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(long totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
