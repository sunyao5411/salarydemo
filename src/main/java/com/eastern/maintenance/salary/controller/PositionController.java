package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.Position;
import com.eastern.maintenance.salary.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Path("/api/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GET
    @Path("/{positionId}")
    public Position getPositionById(@PathVariable("positionId") String positionId) {
        Position postion = positionService.findById(positionId);
        return postion;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPosition(Position position) {
        positionService.create(position);
    }

    @DELETE
    @Path("/{positionId}")
    public void removePosition(@PathParam("positionId") String positionId) {
        if (StringUtils.isEmpty(positionId)) {
            return;
        }
        positionService.remove(positionId);
    }

    @GET
    @Path("/list")
    public List<Position> listAllPosition() {
        return positionService.queryAll();
    }

}
