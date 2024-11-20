package org.tdd;

import org.tdd.location.Coordinates;
import org.tdd.orientation.Direction;
import org.tdd.orientation.Orientation;
import org.tdd.roverCommand.*;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private final Coordinates coordinates;
    private final Direction orientation;
    private final Map<String, Command> commandMap;

    public MarsRover() {
        this.orientation = new Orientation();
        this.coordinates = new Coordinates(orientation);
        this.commandMap = new HashMap<>();
        commandMap.put("F", new MoveForwardCommand());
        commandMap.put("L", new TurnLeftCommand());
        commandMap.put("R", new TurnRightCommand());
        commandMap.put("B", new MoveBackwardCommand());
    }

    public void execCommand(String command) {
        Command cmd = commandMap.get(command);
        if (cmd != null) {
            cmd.execute(this);
        }
    }

    public Coordinates getLocation() {
        return coordinates;
    }

    public Direction getOrientation() {
        return orientation;
    }

    public String getStatus() {
        return String.format("%d:%d:%s", coordinates.getX(), coordinates.getY(), orientation.getDirection());
    }
}