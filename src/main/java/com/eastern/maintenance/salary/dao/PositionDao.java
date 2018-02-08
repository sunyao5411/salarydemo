package com.eastern.maintenance.salary.dao;

import com.eastern.maintenance.salary.domain.Position;

import java.util.List;

public interface PositionDao {

    Position findById(String positionId);

    void update(Position position);

    void remove(String positionId);

    void add(Position position);

    List<Position> list();

}
