package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.Position;
import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.PositionService;
import com.eastern.maintenance.salary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @RequestMapping("/position/{postionId}")
    @ResponseBody
    public Position getPositionById(@PathVariable("positionId") String positionId) {
        Position postion = positionService.findById(positionId);
        return postion;
    }

}
