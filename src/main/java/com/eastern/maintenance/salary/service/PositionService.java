package com.eastern.maintenance.salary.service;

import com.eastern.maintenance.salary.dao.PositionDao;
import com.eastern.maintenance.salary.domain.Position;
import com.eastern.maintenance.salary.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PositionService {
    @Autowired
    private PositionDao positionDao;

    public void create(Position position) {
        position.setPositionId(IDGenerator.generateUniqueId());
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

    public List<Position> queryAll() {
        return this.positionDao.list();
    }
}
