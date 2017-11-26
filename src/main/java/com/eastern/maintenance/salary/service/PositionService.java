package com.eastern.maintenance.salary.service;

import com.eastern.maintenance.salary.dao.PositionDao;
import com.eastern.maintenance.salary.dao.UserDao;
import com.eastern.maintenance.salary.domain.Position;
import com.eastern.maintenance.salary.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
    @Autowired
    private PositionDao positionDao;

    public void add(Position position) {
        positionDao.add(position);
    }

    public void update(Position position) {
        positionDao.update(position);
    }

    public void remove(String positionId) {
        positionDao.remove(positionId);
    }

    public Position findById(String positionId) {
        return positionDao.findById(positionId);
    }
}
