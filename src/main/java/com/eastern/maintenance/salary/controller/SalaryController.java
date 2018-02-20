package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.Salary;
import com.eastern.maintenance.salary.service.SalaryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Path("/api/salary")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @GET
    @Path("/{salaryId}")
    public Salary getSalaryById(@PathParam("salaryId") String salaryId) {
        Salary salary = salaryService.findById(salaryId);
        return salary;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addSalary(Salary salary) {
        salaryService.create(salary);
    }

    @DELETE
    @Path("/{salaryId}")
    public void removeSalary(@PathParam("salaryId") String salaryId) {
        if (StringUtils.isEmpty(salaryId)) {
            return;
        }
        salaryService.remove(salaryId);
    }

    @GET
    @Path("/list")
    public List<Salary> listAllSalary() {
        return salaryService.queryAll();
    }

}
